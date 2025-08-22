package sudoku;

import static java.util.stream.Collectors.toMap;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class main {
	
	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		final var positionData = initializePositions(args);

		int option = -1;
		if (option != -1) {
			UI.configureUI(Game.getInstance(), positionData);
		} else {
			Game gameInstance = Game.getInstance();
			while (true) {
				System.out.println("Selecione uma das opções a seguir");
				System.out.println("1 - Iniciar um novo Jogo");
				System.out.println("2 - Mostrar Jogo Atual");
				System.out.println("3 - Mostrar Status Atual");
				System.out.println("4 - Inserir Número");
				System.out.println("5 - Remover Número");
				System.out.println("0 - Sair");

				option = scanner.nextInt();

				switch (option) {
				case 1 -> gameInstance.startGame(positionData);
				case 2 -> gameInstance.showActualGame();
				case 3 -> System.out.println(gameInstance.getStatus().getLabel());
				case 4 -> gameInstance.inputNumber();
				case 5 -> gameInstance.removeNumber();
				case 0 -> System.exit(0);
				}
			}
		}
	}

	private static Map<String, String> initializePositions(String[] initialArguments) {
		return Stream.of(initialArguments).collect(
				toMap(tilePosition -> tilePosition.split(";")[0], tileAttributes -> tileAttributes.split(";")[1]));
	}
}
