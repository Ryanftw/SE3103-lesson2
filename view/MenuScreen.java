package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class MenuScreen {

	private JFrame window;

	public MenuScreen(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();
		JPanel menuPanel = new JPanel();
		menuPanel.setPreferredSize(new Dimension(400, 200));
		menuPanel.setLayout(new GridLayout(2, 1));
		cp.add(BorderLayout.CENTER, menuPanel);
		var baseballButton = new JButton("Baseball Game");
		var drawingButton = new JButton("Triangle Drawing");
		menuPanel.add(baseballButton);
		menuPanel.add(drawingButton);
	}

}