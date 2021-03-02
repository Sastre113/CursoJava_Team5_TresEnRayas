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
	
	String [][] tablero;
	final int MOV_TOTALES = 9;
	int movimientos;
	boolean j1 = true;
	
	/**
	 * @param tablero
	 */
	public TresEnRaya() {
		this.tablero = new String[3][3];
		this.movimientos = 0;
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
	
	public void incrementar() {
		this.movimientos += 1;
	}
	
}
