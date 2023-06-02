package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class DesktopApp extends JFrame {
	
	private static final long serialVersionUID = -4483634591044153104L;
	
	static String appName = CommonUtility.getAppName();

	public DesktopApp() {
		super(appName);
		init();
	}

	private void init() {
		setLayout(new FlowLayout());
		add(new JLabel("Welcome to " + appName));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640, 480);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DesktopApp().setVisible(true);
			}
		});
	}
}