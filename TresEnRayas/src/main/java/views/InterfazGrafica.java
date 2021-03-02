/**
 * 
 */
package views;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import models.TresEnRaya;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;

/**
 * @author Miguel A. Sastre
 *
 */
public class InterfazGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldJ2;
	private JTextField textFieldJ1;
	private final ButtonGroup bgHumCPUJ1 = new ButtonGroup();
	private final ButtonGroup bgHumCPUJ2 = new ButtonGroup();
	private final ButtonGroup buttonGroup = new ButtonGroup();



	/**
	 * Create the frame.
	 */
	public InterfazGrafica() {
		
		TresEnRaya juego = new TresEnRaya();
		
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
		
		/**
		 * Tablero
		 */
		
		// Fila 0
		JButton btn00 = new JButton("");
		buttonGroup.add(btn00);
		btn00.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn00.setBounds(10, 11, 90, 90);
		panel.add(btn00);
		
		JButton btn01 = new JButton("");
		buttonGroup.add(btn01);
		btn01.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn01.setBounds(94, 11, 90, 90);
		panel.add(btn01);
		
		JButton btn02 = new JButton("");
		buttonGroup.add(btn02);
		btn02.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn02.setBounds(180, 11, 90, 90);
		panel.add(btn02);
		
		// Fila 1
		JButton btn10 = new JButton("");
		buttonGroup.add(btn10);
		btn10.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn10.setBounds(10, 96, 90, 90);
		panel.add(btn10);
		
		JButton btn11 = new JButton("");
		buttonGroup.add(btn11);
		btn11.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn11.setBounds(94, 96, 90, 90);
		panel.add(btn11);
		
		JButton btn12 = new JButton("");
		buttonGroup.add(btn12);
		btn12.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn12.setBounds(180, 96, 90, 90);
		panel.add(btn12);
		
		// Fila 2
		JButton btn20 = new JButton("");
		buttonGroup.add(btn20);
		btn20.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn20.setBounds(10, 179, 90, 90);
		panel.add(btn20);
		
		JButton btn21 = new JButton("");
		buttonGroup.add(btn21);
		btn21.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn21.setBounds(94, 179, 90, 90);
		panel.add(btn21);
		
		JButton btn22 = new JButton("");
		buttonGroup.add(btn22);
		btn22.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn22.setBounds(180, 179, 90, 90);
		panel.add(btn22);
		
		///////////////////////////////////////////////////////
		
		/**
		 * 
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(299, 11, 280, 280);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNuevaPartida = new JButton("Nueva partida");
		btnNuevaPartida.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNuevaPartida.setBounds(141, 11, 129, 25);
		panel_1.add(btnNuevaPartida);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 58, 260, 100);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblJ1 = new JLabel("Jugador 1");
		lblJ1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJ1.setBounds(10, 11, 70, 20);
		panel_2.add(lblJ1);
		
		JLabel lblNombreJ1 = new JLabel("Nombre: ");
		lblNombreJ1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreJ1.setBounds(10, 42, 70, 20);
		panel_2.add(lblNombreJ1);
		
		JLabel lblTipoJ1 = new JLabel("Tipo:");
		lblTipoJ1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoJ1.setBounds(10, 69, 70, 20);
		panel_2.add(lblTipoJ1);
		
		textFieldJ1 = new JTextField();
		textFieldJ1.setColumns(10);
		textFieldJ1.setBounds(90, 44, 86, 20);
		panel_2.add(textFieldJ1);
		
		JRadioButton rdbtnHumanoJ1 = new JRadioButton("Humano");
		bgHumCPUJ1.add(rdbtnHumanoJ1);
		rdbtnHumanoJ1.setBounds(75, 70, 70, 23);
		panel_2.add(rdbtnHumanoJ1);
		
		JRadioButton rdbtnCPUJ1 = new JRadioButton("CPU");
		bgHumCPUJ1.add(rdbtnCPUJ1);
		rdbtnCPUJ1.setBounds(145, 70, 70, 23);
		panel_2.add(rdbtnCPUJ1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2_1.setBounds(10, 169, 260, 100);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblJ2 = new JLabel("Jugador 2");
		lblJ2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJ2.setBounds(10, 11, 70, 20);
		panel_2_1.add(lblJ2);
		
		JLabel lblNombreJ2 = new JLabel("Nombre:");
		lblNombreJ2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreJ2.setBounds(10, 42, 70, 20);
		panel_2_1.add(lblNombreJ2);
		
		JLabel lblTipoJ2 = new JLabel("Tipo:");
		lblTipoJ2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoJ2.setBounds(10, 73, 70, 20);
		panel_2_1.add(lblTipoJ2);
		
		textFieldJ2 = new JTextField();
		textFieldJ2.setBounds(90, 44, 86, 20);
		panel_2_1.add(textFieldJ2);
		textFieldJ2.setColumns(10);
		
		JRadioButton rdbtnHumanoJ2 = new JRadioButton("Humano");
		bgHumCPUJ2.add(rdbtnHumanoJ2);
		rdbtnHumanoJ2.setBounds(75, 74, 70, 23);
		panel_2_1.add(rdbtnHumanoJ2);
		
		JRadioButton rdbtnCPUJ2 = new JRadioButton("CPU");
		bgHumCPUJ2.add(rdbtnCPUJ2);
		rdbtnCPUJ2.setBounds(145, 74, 70, 23);
		panel_2_1.add(rdbtnCPUJ2);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setBounds(28, 18, 87, 14);
		panel_1.add(lblTurno);
	}
}
