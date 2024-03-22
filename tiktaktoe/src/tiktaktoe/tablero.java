
package tiktaktoe;


public class tablero {
    String[] [] tablero_juego = new String[3][3];
    
    public tablero() {
        //tablero
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero_juego[i][j] = " ";
            }
        }
    }
    
    public void mostrar(){
        //al mostrar se contatena para hacer la froma del tablero
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero_juego[i][j]);
                if (true) {
                    
                }
                
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
