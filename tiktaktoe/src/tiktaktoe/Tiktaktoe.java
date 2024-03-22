
package tiktaktoe;
import java.util.Scanner;
public class Tiktaktoe {
    static Scanner sc = new Scanner(System.in);
    static tablero tablero_juego = new tablero();
    static boolean turno= true;


    public static void main(String[] args) {
        
        boolean fin = false;
        
        do{
            //creamos el tablero
            
            
            //opciones del juego
            System.out.println("Elige la opcion: "
                    + "\n[1] 1 Jugador"
                    + "\n[2] 2 Jugadores"
                    + "\n[3] Salir");
            int opc = sc.nextInt();
            switch (opc){
                case 1: 
                    //jugar solo
                    //mostramos el tablero
                    tablero_juego.mostrar();
                                       
                    break; 
                case 2: 
                    //2Jugadres
                    break;
                case 3:
                    //terminar juego
                    fin = true;
                    break;
            }
            
        }while(!fin);   
    }
    public void turno(){
        boolean turnofin = true;
        while(turnofin){
            //aseguramos que sean columnas
            System.out.println("Elige una columna");
            int column = sc.nextInt();
            while (column>3 || column<0){
                System.out.println("un numero entre 1 y 3"
                        + "\nElige una columna");
                column = sc.nextInt();
            }
            //aseguramos que sean fias de verdad
            System.out.println("Elige la fila");
            int fila = sc.nextInt();
            while (fila>3 || fila<0){
                System.out.println("un numero entre 1 y 3"
                        + "\nElige una fila");
                fila = sc.nextInt();
            }
            //ajustamos columnas porque la matriz es mas grande
            if (column==2) {
                column=3;
            }
            if (column==3) {
                column=5;
            }
            //ajustamos a filas porque la matriz es mas grande
            if (fila==2) {
                fila=3;
            }
            if (fila==3) {
                fila=5;
            }
            
            
            if (tablero_juego.hayAlgo(column, fila)) {
                System.out.println("ya hay una ficha ahí");
            }else turnofin=false;
            
            //colocamos la ficha ahí
            if (turnofin) {
                
            }
            
        };
        
    }
    public void cambioTurno(){
            turno = !turno;
        }
}
