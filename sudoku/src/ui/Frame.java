package ui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame(Dimension dimension, Panel mainPanel, Panel sudokuPanel) {
		super("Sudoku");
		this.setSize(dimension);
		this.setPreferredSize(dimension);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.add(mainPanel);
		this.add(sudokuPanel);
	}
}
