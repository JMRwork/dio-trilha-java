package ui;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton {
	public Button(String text, ActionListener listener) {
		this.setText(text);
		this.addActionListener(listener);
	}
}
