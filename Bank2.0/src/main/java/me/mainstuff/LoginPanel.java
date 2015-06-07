package me.mainstuff;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblUsername = new JLabel("Username: ");
		add(lblUsername);

		textField = new JTextField();
		add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password: ");
		add(lblPassword);

		passwordField = new JPasswordField();
		add(passwordField);

		JButton btnLogin = new JButton("Login");
		add(btnLogin);

		JButton btnSignUp = new JButton("Sign Up");
		add(btnSignUp);

		JLabel lblForgotCredentials = new JLabel("Forgot credentials ...");
		add(lblForgotCredentials);
	}

}
