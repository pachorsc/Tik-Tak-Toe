
package tiktaktoe;


public class tablero {
    String[] [] tablero_juego = new String[5][5];
    
    public tablero() {
        //tablero
        tablero_juego[0][1]="|";
        tablero_juego[0][3]="|";
        tablero_juego[2][1]="|";
        tablero_juego[2][3]="|";
        tablero_juego[4][1]="|";
        tablero_juego[4][3]="|";
        
        tablero_juego[1][0]="-";
        tablero_juego[1][2]="-";
        tablero_juego[1][4]="-";
        tablero_juego[3][0]="-";
        tablero_juego[3][2]="-";
        tablero_juego[3][4]="-";
        
        tablero_juego[1][1]="+";
        tablero_juego[1][3]="+";
        tablero_juego[3][1]="+";
        tablero_juego[3][3]="+";
        
        //zona jugeo vacias
        tablero_juego[0][0]=" ";
        tablero_juego[0][2]=" ";
        tablero_juego[0][4]=" ";
        
        tablero_juego[2][0]=" ";
        tablero_juego[2][2]=" ";
        tablero_juego[2][4]=" ";
        
        tablero_juego[4][0]=" ";
        tablero_juego[4][2]=" ";
        tablero_juego[4][4]=" ";
    }
    
    public void mostrar(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
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
    
}
