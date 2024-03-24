
package tiktaktoe;


public class Tablero {
    String[] [] tablero_juego = new String[3][3];
    
    public Tablero() {
        //tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero_juego[i][j] = " ";
            }
        }
    }
    
    public void mostrar(){
        //al mostrar se contatena para hacer la froma del tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero_juego[i][j]);              
            }
            System.out.println("");
        }
    }

    public String[][] getTablero_juego() {
        return tablero_juego;
    }

    public void setTablero_juego(String[][] tablero_juego) {
        this.tablero_juego = tablero_juego;
    }
    
    public boolean hayAlgo(int j, int a){
        
        boolean hay = true;
        if (tablero_juego[j][a].equals(" ")) {
            hay = false;
            
        }
        return hay;
    }
    public void ponerFicha(int a, int b, boolean turno){
        if (turno) {
            tablero_juego [a][b] ="X";
        }
        else tablero_juego [a][b] ="O";
        
    }
    
}
