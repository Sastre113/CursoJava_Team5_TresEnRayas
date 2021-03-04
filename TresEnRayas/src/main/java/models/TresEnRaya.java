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
	
	public int[] algoritmoCpu(String signo) {
		int posicion[] = {-1,-1};
		boolean exit = false;

		for(int i = 0; i < tablero.length && !exit; i++) {
			for(int j = 0; j < tablero.length && !exit; j++) {
				if(tablero[i][j] == null) {
					tablero[i][j] = signo;
					if(condicionVictoria(signo)) {
						posicion[0] = i;
						posicion[1] = j;
						exit = true;
					}
					tablero[i][j] = null; 
				}	
			}
		}
		return posicion;
	}
	
	public boolean esPosicionValida(int [] posicion) {
		return (posicion[0] != -1) ? true:false;
	}
	
	public boolean posicionOcupada(int x, int y) {
		return tablero[x][y] != null;
	}
	
	public boolean condicionVictoria(String signoJugador) {
		boolean victoria = false;
		
		if(this.tablero[0][0] == signoJugador && this.tablero[0][1] == signoJugador && this.tablero[0][2] == signoJugador) // 1º Fila
			victoria = true;
		if(this.tablero[1][0] == signoJugador && this.tablero[1][1] == signoJugador && this.tablero[1][2] == signoJugador) // 2º Fila
			victoria = true;
		if(this.tablero[2][0] == signoJugador && this.tablero[2][1] == signoJugador && this.tablero[2][2] == signoJugador) // 3º Fila
			victoria = true;
		if(this.tablero[0][0] == signoJugador && this.tablero[1][0] == signoJugador && this.tablero[2][0] == signoJugador) // 1º Columna
			victoria = true;
		if(this.tablero[0][1] == signoJugador && this.tablero[1][1] == signoJugador && this.tablero[2][1] == signoJugador) // 2º Columna
			victoria = true;
		if(this.tablero[0][2] == signoJugador && this.tablero[1][2] == signoJugador && this.tablero[2][2] == signoJugador) // 3º Columna
			victoria = true;
		if(this.tablero[0][0] == signoJugador && this.tablero[1][1] == signoJugador && this.tablero[2][2] == signoJugador) // 1º Diagonal
			victoria = true;
		if(this.tablero[0][2] == signoJugador && this.tablero[1][1] == signoJugador && this.tablero[2][0] == signoJugador) // 2º Diagonal
			victoria = true;
		
		return victoria;
	}
	
	
	public boolean quedanMovimientos() {
		return this.movimientos < this.MOV_TOTALES;
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
	
	public String signoContrario() {
		return (this.isTurnoJ1() == false) ? "X" : "O"; 
	}
	
	public String jugadorTurno() {
		return (this.isTurnoJ1() == true) ? this.nameJ1:this.nameJ2;
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
