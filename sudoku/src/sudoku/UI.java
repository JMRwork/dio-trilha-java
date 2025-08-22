package sudoku;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.border.LineBorder;
import static java.awt.Color.black;

import ui.*;

public class UI {

	public static UI instance;

	private Panel mainPanel;
	private Panel sudokuPanel;
	private Frame mainFrame;

	private UI() {
		this.mainPanel = new Panel(new Dimension(200, 200), true);
		this.sudokuPanel = new Panel(new Dimension(170, 170), false);
		this.mainFrame = new Frame(new Dimension(700, 700), mainPanel, sudokuPanel);
	}

	private static UI getInstance() {
		if (instance == null) {
			instance = new UI();
		}
		return instance;
	}

	public static void configureUI(Game game, Map<String, String> positionData) {
		var instance = getInstance();
		instance.configureMainPanel(game, positionData);
	}

	private void configureMainPanel(Game game, Map<String, String> positionData) {
		mainPanel.add(new Button("Iniciar um novo Jogo", e -> {
			mainPanel.getComponents().toString();
			game.startGame(positionData);
			sudokuPanel.setBorder(new LineBorder(black, 2, true));
			sudokuPanel.setVisible(true);
		}));
		mainPanel.add(new Button("Mostrar Jogo Atual", null));

	}
}
