package apkaOk;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AplikacjaOk {
//dodaje komentarz

//no powinno go nie byc

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikacjaOk window = new AplikacjaOk();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AplikacjaOk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//public static StringBuilder Dane.sb = new StringBuilder();
	private JTextField textField;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('1');
				textField.setText(Dane.sb.toString());
			}
		});

		button1.setBounds(10, 68, 89, 23);
		frame.getContentPane().add(button1);

		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('2');
				textField.setText(Dane.sb.toString());
			}
		});
		button2.setBounds(10, 102, 89, 23);
		frame.getContentPane().add(button2);

		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('3');
				textField.setText(Dane.sb.toString());
			}
		});
		button3.setBounds(10, 136, 89, 23);
		frame.getContentPane().add(button3);

		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('4');
				textField.setText(Dane.sb.toString());
			}
		});
		button4.setBounds(116, 68, 89, 23);
		frame.getContentPane().add(button4);

		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('5');
				textField.setText(Dane.sb.toString());
			}
		});
		button5.setBounds(116, 102, 89, 23);
		frame.getContentPane().add(button5);

		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('6');
				textField.setText(Dane.sb.toString());
			}
		});
		button6.setBounds(116, 136, 89, 23);
		frame.getContentPane().add(button6);

		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('7');
				textField.setText(Dane.sb.toString());
			}
		});
		button7.setBounds(215, 68, 89, 23);
		frame.getContentPane().add(button7);

		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('8');
				textField.setText(Dane.sb.toString());
			}
		});
		button8.setBounds(215, 102, 89, 23);
		frame.getContentPane().add(button8);

		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('9');
				textField.setText(Dane.sb.toString());
			}
		});
		button9.setBounds(215, 136, 89, 23);
		frame.getContentPane().add(button9);

		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('0');
				textField.setText(Dane.sb.toString());
			}
		});
		button0.setBounds(116, 170, 89, 23);
		frame.getContentPane().add(button0);

		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('+');
				textField.setText(Dane.sb.toString());
			}
		});
		buttonPlus.setBounds(10, 205, 89, 23);
		frame.getContentPane().add(buttonPlus);

		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('-');
				textField.setText(Dane.sb.toString());
			}
		});
		buttonMinus.setBounds(116, 205, 89, 23);
		frame.getContentPane().add(buttonMinus);

		JButton buttonStar = new JButton("*");
		buttonStar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.sb.append('*');
				textField.setText(Dane.sb.toString());
			}
		});
		buttonStar.setBounds(215, 205, 89, 23);
		frame.getContentPane().add(buttonStar);

		textField = new JTextField();
		textField.setBounds(119, 29, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton buttonRowna = new JButton("=");
		buttonRowna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dane.znajdzLiczby();
				Dane.oblicz();
				textField.setText(Dane.sb.toString());
			}
		});
		buttonRowna.setBounds(335, 136, 89, 23);
		frame.getContentPane().add(buttonRowna);
	}
}
