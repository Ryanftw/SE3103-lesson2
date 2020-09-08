package view;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class BaseballCanvas extends JPanel {

	public static int WIDTH = 500;
	public static int LENGTH = 500;
	private BaseballGamePanel panel;

	public BaseballCanvas(BaseballGamePanel panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(WIDTH, LENGTH));
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// custom drawing

	}

}
