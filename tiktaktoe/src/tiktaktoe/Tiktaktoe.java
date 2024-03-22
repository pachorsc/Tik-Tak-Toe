
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
                    //
                    turno();
                    //mostrar tablero despues de poner ficha
                    tablero_juego.mostrar();
                    //al finalizar se cambia de turno
                    turno = !turno;
                                       
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
    static public void turno(){
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
            
            if (tablero_juego.hayAlgo(fila, column)) {
                System.out.println("ya hay una ficha ahí");
                //
            }else
                
            
            //colocamos la ficha ahí
            tablero_juego.ponerFicha(fila, column, turno);
            //terminar turno
                turnofin=false;
        }
        
    }
    public void cambioTurno(){
            turno = !turno;
        }
}
