/**
 * 
 */
package models;

/**
 * @author Miguel A. Sastre
 *
 */
public class TresEnRaya {

	/**
	 * 	Atributo tablero
	 */
	final int MOV_TOTALES = 9;
	final String JUGADOR1 = "JUGADOR 1";
	final String JUGADOR2 = "JUGADOR 2";
	String [][] tablero;
	int movimientos;
	boolean turnoJ1;
	String nameJ1;
	String nameJ2;
	
	
	/**
	 * @param tablero
	 */
	public TresEnRaya(String nombreJ1, String nombreJ2) {
		this.tablero = new String[3][3];
		this.movimientos = 0;
		this.turnoJ1 = true;
		comprobarNombre(nombreJ1,nombreJ2);
	}
	
	public boolean condicionVictoria(String jugador) {
		boolean victoria = false;
		
		if(this.tablero[0][0] == jugador && this.tablero[0][1] == jugador && this.tablero[0][2] == jugador) // 1º Fila
			victoria = true;
		if(this.tablero[1][0] == jugador && this.tablero[1][1] == jugador && this.tablero[1][2] == jugador) // 2º Fila
			victoria = true;
		if(this.tablero[2][0] == jugador && this.tablero[2][1] == jugador && this.tablero[2][2] == jugador) // 3º Fila
			victoria = true;
		if(this.tablero[0][0] == jugador && this.tablero[1][0] == jugador && this.tablero[2][0] == jugador) // 1º Columna
			victoria = true;
		if(this.tablero[0][1] == jugador && this.tablero[1][1] == jugador && this.tablero[2][1] == jugador) // 2º Columna
			victoria = true;
		if(this.tablero[0][2] == jugador && this.tablero[1][2] == jugador && this.tablero[2][2] == jugador) // 3º Columna
			victoria = true;
		if(this.tablero[0][0] == jugador && this.tablero[1][1] == jugador && this.tablero[2][2] == jugador) // 1º Diagonal
			victoria = true;
		if(this.tablero[0][2] == jugador && this.tablero[1][1] == jugador && this.tablero[2][0] == jugador) // 2º Diagonal
			victoria = true;
		
		return victoria;
	}
	
	public boolean posicionOcupada(int x, int y) {
		return tablero[x][y] != null;
	}
	
	public void incrementarMovimientos() {
		this.movimientos += 1;
	}
	
	public void siguienteTurno() {
		this.turnoJ1 = (this.isTurnoJ1() == true) ? false: true;
	}
	
	private void comprobarNombre(String j1, String j2) {
		this.nameJ1 = (j1.compareToIgnoreCase("") == 0) ? this.JUGADOR1 : j1;
		this.nameJ2 = (j2.compareToIgnoreCase("") == 0) ? this.JUGADOR2 : j2;
	}
	
	/**
	 * @return the turnoJ1
	 */
	public boolean isTurnoJ1() {
		return turnoJ1;
	}

	/**
	 * @return the nameJ1
	 */
	public String getNameJ1() {
		return nameJ1;
	}

	/**
	 * @return the nameJ2
	 */
	public String getNameJ2() {
		return nameJ2;
	}
	
	public void marcarPosicion(int x, int y,String turno) {
		this.tablero[x][y] = turno;
	}
	
	public String signoTurno() {
		return (this.isTurnoJ1() == true) ? "X" : "O"; 
	}
	
	public String obtenerTurno() {
		String turno = "";
		
		if(this.isTurnoJ1() == true)
			turno += this.getNameJ1();
		else
			turno += this.getNameJ2();
		
		return turno + ",\n coloca ficha...";
	}
	
}
