/**
 * 
 */
package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 * @author Miguel A. Sastre
 *
 */
public class InterfazGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica frame = new InterfazGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(9, 11, 280, 280);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton.setBounds(10, 11, 90, 90);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton_1.setBounds(94, 11, 90, 90);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton_2.setBounds(180, 11, 90, 90);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X");
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton_3.setBounds(10, 96, 90, 90);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("X");
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton_1_1.setBounds(94, 96, 90, 90);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("X");
		btnNewButton_2_1.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton_2_1.setBounds(180, 96, 90, 90);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("X");
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton_4.setBounds(10, 179, 90, 90);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("X");
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton_1_2.setBounds(94, 179, 90, 90);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("X");
		btnNewButton_2_2.setFont(new Font("Arial Black", Font.BOLD, 40));
		btnNewButton_2_2.setBounds(180, 179, 90, 90);
		panel.add(btnNewButton_2_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(299, 11, 280, 280);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("Nueva partida");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(76, 11, 129, 36);
		panel_1.add(btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 58, 260, 100);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 70, 20);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 42, 70, 20);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 69, 70, 20);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(90, 44, 86, 20);
		panel_2.add(textField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Humano");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(75, 70, 70, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CPU");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(145, 70, 70, 23);
		panel_2.add(rdbtnNewRadioButton_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2_1.setBounds(10, 169, 260, 100);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Jugador 2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 11, 70, 20);
		panel_2_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 42, 70, 20);
		panel_2_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 73, 70, 20);
		panel_2_1.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 44, 86, 20);
		panel_2_1.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Humano");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(75, 74, 70, 23);
		panel_2_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("CPU");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(145, 74, 70, 23);
		panel_2_1.add(rdbtnNewRadioButton_3);
	}
}
