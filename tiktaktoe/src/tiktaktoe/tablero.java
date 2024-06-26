
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
                if (j==1) {
                    System.out.print("|"+parte_tablero_get(i,j)+"|");
                }
                else System.out.print(tablero_juego[i][j]);                         
            }
            if (i!=2) {
                System.out.println("\n-+-+-");
            }
        }
        System.out.println("\n");
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
    public String parte_tablero_get(int a, int b){
        String res;
        res = tablero_juego[a][b];
        return res;
    }
    public boolean victoria(){
        boolean ganador = false;
        
        //ganar con 3 verticales o horizontales       
        for (int i = 0; i < 3; i++) {
            //condiciones en horizotal 
            //si la fila entera esta llena de 'X' o 'O' entonces ganador = a true
            if (tablero_juego[i][0].equals("X") & tablero_juego[i][1].equals("X") & tablero_juego[i][2].equals("X") || tablero_juego[i][0].equals("O") & tablero_juego[i][1].equals("O") & tablero_juego[i][2].equals("O")) {
                ganador = true;
            }
            //Vertical
            //si alguna columna tiene los 3 espacios llenos de 'X' o 'O'
            if (tablero_juego[0][i].equals("X") & tablero_juego[1][i].equals("X") & tablero_juego[2][i].equals("X") || tablero_juego[0][i].equals("O") & tablero_juego[1][i].equals("O") & tablero_juego[2][i].equals("O") ) {
                ganador = true;
            }
        }
        //ganar con 3 en diagonal
        if (
           //diagonal 2,0 a la 0,2
            tablero_juego[2][0].equals("X") 
          & tablero_juego[1][1].equals("X") 
          & tablero_juego[0][2].equals("X") 
          //0,0 a la 2,2
         ||tablero_juego[0][0].equals("X") 
         & tablero_juego[1][1].equals("X") 
         & tablero_juego[2][2].equals("X")
                
          //diagonal 2,0 a la 0,2
         ||tablero_juego[2][0].equals("O") 
         & tablero_juego[1][1].equals("O") 
         & tablero_juego[0][2].equals("O")
         //0,0 a la 2,2
         ||tablero_juego[0][0].equals("O") 
         & tablero_juego[1][1].equals("O") 
         & tablero_juego[2][2].equals("O")) {
            ganador = true;
        }
        
        return ganador;
    }
    public boolean empate(){
        boolean empat = false;
        int cont =0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (tablero_juego [i][j].equals("X") || tablero_juego [i][j].equals("O")) {
                    cont++;
                }
            }
        }
        if (cont==9) {
            empat = true;
        }
        
        
        return empat;
    }
    
}
