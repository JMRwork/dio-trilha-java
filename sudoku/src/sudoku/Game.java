package sudoku;

import java.util.Collection;
import java.util.Map;
import model.Board;
import model.GameStatusEnum;
import util.BoardTemplate;
import util.ValidNumber;

public class Game {
	public static Game instance;
	public Board board;
	
	private Game() {
	}
	
	public static Game getInstance() {
		if (instance == null) {
			instance = new Game();
		} 
		return instance;
	}	
	
	public void startGame(Map<String, String> positionData) {
		if (board == null) {
			board = new Board(positionData);
		} else {
			System.out.println("O jogo já está em andamento.");
		}
	}
	
	public void showActualGame() {
		if (board == null){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }
		var actualTiles = board.getTiles().stream()
				.flatMap(row -> row
						.stream()
						.map(tile -> {
							Integer value = tile.getActual();
							if (value != null) {
								return value.toString();
							} else {
								return "*";
							}}))
				.toList();
		System.out.printf(BoardTemplate.get(), actualTiles.toArray());
	}
	
	public void inputNumber() {
        if (board == null){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        System.out.println("Informe a coluna que em que o número será inserido");
        var col = ValidNumber.runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha que em que o número será inserido");
        var row = ValidNumber.runUntilGetValidNumber(0, 8);
        System.out.printf("Informe o número que vai entrar na posição [%s,%s]\n", col, row);
        var value = ValidNumber.runUntilGetValidNumber(1, 9);
        board.getTiles().get(row).get(col).setActual(value);
        if (board.getTiles().get(row).get(col).isFixed()){
            System.out.printf("A posição [%s,%s] tem um valor fixo\n", col, row);
        }
    }

    public void removeNumber() {
        if (board == null){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        System.out.println("Informe a coluna que em que o número será inserido");
        var col = ValidNumber.runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha que em que o número será inserido");
        var row = ValidNumber.runUntilGetValidNumber(0, 8);
        board.getTiles().get(row).get(col).setActual(null);
        if (board.getTiles().get(row).get(col).isFixed()){
            System.out.printf("A posição [%s,%s] tem um valor fixo\n", col, row);
        }
    }
    
    public GameStatusEnum getStatus(){
        if (board == null){
            return GameStatusEnum.NON_STARTED;
        }

        return board.getTiles().stream().flatMap(Collection::stream).anyMatch(s -> (s.getActual() == null)) ? GameStatusEnum.INCOMPLETE : GameStatusEnum.COMPLETE;
    }

    public boolean hasErrors(){
        if(getStatus() == GameStatusEnum.NON_STARTED){
            return false;
        }

        return board.getTiles().stream().flatMap(Collection::stream)
                .anyMatch(s -> (s.getActual() == null) && !s.getActual().equals(s.getExpected()));
    }

        
        public boolean gameIsFinished(){
            return !hasErrors() && getStatus().equals(GameStatusEnum.COMPLETE);
        }
}
