package ui;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Panel extends JPanel {
	public Panel(Dimension dimension, boolean isVisible) {
		this.setSize(dimension);
		this.setPreferredSize(dimension);
		this.setVisible(isVisible);
	}
}
