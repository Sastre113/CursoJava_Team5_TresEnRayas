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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

/**
 * @author Miguel A. Sastre
 *
 */
public class InterfazGrafica extends JFrame {

	private TresEnRaya juego;
	private JPanel contentPane;
	private JTextField textFieldJ2;
	private JTextField textFieldJ1;
	private JLabel lblTurno = new JLabel("Turno");
	private final ButtonGroup bgHumCPUJ1 = new ButtonGroup();
	private final ButtonGroup bgHumCPUJ2 = new ButtonGroup();
	private final ButtonGroup tablero = new ButtonGroup();
	
	private String j1 = "";
	private String j2 = "";



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
		
		/**
		 * Tablero
		 */
		
		// Fila 0
		JButton btn00 = new JButton("");
		btn00.setActionCommand("btn00");
		btn00.setEnabled(false);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn00,0,0,juego.signoTurno());
			}
		});
		tablero.add(btn00);
		btn00.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn00.setBounds(10, 11, 90, 90);
		panel.add(btn00);
		
		JButton btn01 = new JButton("");
		btn01.setEnabled(false);
		btn01.setActionCommand("btn01");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn01,0,1,juego.signoTurno());
			}
		});
		tablero.add(btn01);
		btn01.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn01.setBounds(94, 11, 90, 90);
		panel.add(btn01);
		
		JButton btn02 = new JButton("");
		btn02.setEnabled(false);
		btn02.setActionCommand("btn02");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn02,0,2,juego.signoTurno());
			}
		});
		tablero.add(btn02);
		btn02.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn02.setBounds(180, 11, 90, 90);
		panel.add(btn02);
		
		// Fila 1
		JButton btn10 = new JButton("");
		btn10.setEnabled(false);
		btn10.setActionCommand("btn10");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn10,1,0,juego.signoTurno());
			}
		});
		tablero.add(btn10);
		btn10.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn10.setBounds(10, 96, 90, 90);
		panel.add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.setEnabled(false);
		btn11.setActionCommand("btn11");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn11,1,1,juego.signoTurno());
			}
		});
		tablero.add(btn11);
		btn11.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn11.setBounds(94, 96, 90, 90);
		panel.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.setEnabled(false);
		btn12.setActionCommand("btn12");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn12,1,2,juego.signoTurno());
			}
		});
		tablero.add(btn12);
		btn12.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn12.setBounds(180, 96, 90, 90);
		panel.add(btn12);
		
		// Fila 2
		JButton btn20 = new JButton("");
		btn20.setEnabled(false);
		btn20.setActionCommand("btn20");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn20,2,0,juego.signoTurno());
			}
		});
		tablero.add(btn20);
		btn20.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn20.setBounds(10, 179, 90, 90);
		panel.add(btn20);
		
		JButton btn21 = new JButton("");
		btn21.setEnabled(false);
		btn21.setActionCommand("btn21");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn21,2,1,juego.signoTurno());
			}
		});
		tablero.add(btn21);
		btn21.setFont(new Font("Arial Black", Font.BOLD, 40));
		btn21.setBounds(94, 179, 90, 90);
		panel.add(btn21);
		
		JButton btn22 = new JButton("");
		btn22.setEnabled(false);
		btn22.setActionCommand("btn22");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				marcar(btn22,2,2,juego.signoTurno());
			}
		});
		tablero.add(btn22);
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
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				juego = new TresEnRaya(textFieldJ1.getText(),textFieldJ2.getText());
				lblTurno.setText(juego.obtenerTurno());
				Iterator<AbstractButton> it = tablero.getElements().asIterator();
				while(it.hasNext()) {
					AbstractButton boton = it.next();
					boton.setText("");
				}
				
				j1 = (bgHumCPUJ1.getSelection().getActionCommand().compareToIgnoreCase("Humano") == 0) ? "Humano":"CPU";
				j2 = (bgHumCPUJ2.getSelection().getActionCommand().compareToIgnoreCase("Humano") == 0) ? "Humano":"CPU";				
				bloquearBotones(true);
				
				if(j1.compareToIgnoreCase("CPU") == 0)
					cpu();
			}
		});
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
		rdbtnHumanoJ1.setSelected(true);
		rdbtnHumanoJ1.setActionCommand(rdbtnHumanoJ1.getText());
		bgHumCPUJ1.add(rdbtnHumanoJ1);
		rdbtnHumanoJ1.setBounds(75, 70, 70, 23);
		panel_2.add(rdbtnHumanoJ1);
		
		JRadioButton rdbtnCPUJ1 = new JRadioButton("CPU");
		bgHumCPUJ1.add(rdbtnCPUJ1);
		rdbtnCPUJ1.setActionCommand("CPU");
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
		rdbtnHumanoJ2.setActionCommand("Humano");
		rdbtnHumanoJ2.setBounds(75, 74, 70, 23);
		panel_2_1.add(rdbtnHumanoJ2);
		
		JRadioButton rdbtnCPUJ2 = new JRadioButton("CPU");
		rdbtnCPUJ2.setSelected(true);
		rdbtnCPUJ2.setActionCommand("CPU");
		bgHumCPUJ2.add(rdbtnCPUJ2);
		rdbtnCPUJ2.setBounds(145, 74, 70, 23);
		panel_2_1.add(rdbtnCPUJ2);
		lblTurno.setVerticalAlignment(SwingConstants.TOP);
		
		
		lblTurno.setHorizontalAlignment(SwingConstants.LEFT);
		lblTurno.setBounds(10, 18, 121, 29);
		panel_1.add(lblTurno);
	}
	
	
	public void cpu() {
		/*
		 * 	1. Jugar en el centro siempre que se pueda
		 *  2. ¿Está CPU puede ganar? Intenta ganar
		 *  3. CPU tiene que analizar si el jugador contrario puede ganar.
		 *  4. Posicion Aleatoria
		 */
		
		if(!juego.posicionOcupada(1,1))
			marcar((JButton) obtenerBoton("btn11"),1,1,juego.signoTurno());
		
		
		
	}
	
	public AbstractButton obtenerBoton(String botonBuscado) {
		Iterator<AbstractButton> it = tablero.getElements().asIterator();
		boolean exit = false;
		AbstractButton boton = null;
		while(it.hasNext() && !exit) {
			boton = it.next();
			if(botonBuscado.compareToIgnoreCase(boton.getActionCommand()) == 0)
				exit = true;	
		}
		
		return boton;
	}
	
	public void marcar(JButton boton,int x,int y,String turno) {
		boton.setText(turno);
		juego.marcarPosicion(x,y, turno);
		boton.setEnabled(false);
		
		if(juego.condicionVictoria(turno)) {
			bloquearBotones(false);
			JOptionPane.showMessageDialog(null, "Has ganado");
		}
		cambiarTurno();
	}
	
	public void cambiarTurno() {
		juego.siguienteTurno();
		lblTurno.setText(juego.obtenerTurno());
	}
	
	public void bloquearBotones(boolean opcion) {
		Iterator<AbstractButton> it = tablero.getElements().asIterator();
		while(it.hasNext()) {
			it.next().setEnabled(opcion);
		}
	}
	
}
