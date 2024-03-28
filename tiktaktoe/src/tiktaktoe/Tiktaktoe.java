
package tiktaktoe;
import java.util.Scanner;


public class Tiktaktoe {
    static Scanner sc = new Scanner(System.in);
    static Tablero tablero_partida;
    static boolean turno= true;
    static boolean partida = true;


    public static void main(String[] args) {
        
        boolean fin = false;
        
        do{
            //creamos el tablero
            tablero_partida = new Tablero();
            
            //opciones del juego
            System.out.println("Elige la opcion: "
                    + "\n[1] 1 Jugador"
                    + "\n[2] 2 Jugadores"
                    + "\n[3] Salir");
            int opc = sc.nextInt();
            switch (opc){
                case 1: 
                    //partida con el bot
                    while (partida ==true){
                    
                        //turno jugador 1
                        System.out.println("Turno jugador");
                    while(turno==true){
                    //jugar solo
                    //mostramos el tablero
                    tablero_partida.mostrar();
                    //
                    Tiktaktoe.turno();
                    //mostrar tablero despues de poner ficha
                    tablero_partida.mostrar();
                    //al finalizar se cambia de turno
                    turno = false;
                        }
                    
                    //si despues de poner la ficha gana entonces salimos del bucle partida
                        if (tablero_partida.victoria()) {
                            System.out.println("El jugador gano la partida, Bien jugado\nFin de la partida\n");
                            break;
                        }
                    
                    //turno del bot
                    //Turno del bot
                    while (!turno){
                        System.out.println("Turno del Bot");
                    
                    //se genera la posicion del turno aleatorio
                    int a1 = (int) (Math.random()*3);
                    int a2 = (int) (Math.random()*3);
                    
                    //chequeamos que la posicion no este ya ocupada
                    while(tablero_partida.hayAlgo(a1, a2)){
                         a1 = (int) (Math.random()*3);
                         a2 = (int) (Math.random()*3);
                    }
                    //ponemos la ficha
                    tablero_partida.ponerFicha(a1, a2, turno);
                    
                    //mostramos el turno del bot
                    tablero_partida.mostrar();
                    
                    //al finalizar se cambia de turno
                    turno = true;
                    }
                    //si despues de poner la ficha gana entonces salimos del bucle partida
                        if (tablero_partida.victoria()) {
                            System.out.println("El Bot gano la partida\nFin de la partida\n");
                            break;
                        }
                    }
                 
                    break; 
                case 2: 
                    //2Jugadres
                    while (partida ==true){
                        
                    //turno jugador 1                    
                    while(turno==true){
                    System.out.println("Turno jugador 1");
                    
                    //mostramos el tablero
                    tablero_partida.mostrar();
                    //
                    Tiktaktoe.turno();
                    //mostrar tablero despues de poner ficha
                    tablero_partida.mostrar();
                    //al finalizar se cambia de turno
                    turno = false;
                        }
                    
                    //si es empate se sale
                        if (tablero_partida.empate()) {
                             System.out.println("Empate, Ningun jugador ha ganado\nFin de la partida\n");
                            break;
                        }
                    
                    //si despues de poner la ficha gana entonces salimos del bucle partida
                        if (tablero_partida.victoria()) {
                            System.out.println("El jugador 1 gano la partida, Bien jugado\nFin de la partida\n");
                            break;
                        }
                    
                    //turno del J2
                    
                    while(turno==false){
                    System.out.println("Turno jugador 2");
                        
                    //mostramos el tablero
                    tablero_partida.mostrar();
                    //Turno del jugador 2
                    Tiktaktoe.turno();
                    //mostrar tablero despues de poner ficha
                    tablero_partida.mostrar();
                    //al finalizar se cambia de turno
                    turno = true;
                        }
                    
                    //si despues de poner la ficha gana entonces salimos del bucle partida
                        if (tablero_partida.victoria()) {
                            System.out.println("El Jugador 2 gano la partida, Bien jugado\nFin de la partida\n");
                            break;
                        }
                    }
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
        int fila=0;
        int column=0;
        
        while(turnofin){
            //aseguramos que sean columnas
            System.out.println("Elige una columna");
            column = sc.nextInt();
            
            while (column>2 || column<0){
                System.out.println("un numero entre 0 y 2"
                        + "\nElige una columna");
                column = sc.nextInt();
            }
            //aseguramos que sean fias de verdad
            System.out.println("Elige la fila");
            fila = sc.nextInt();
            
            while (fila>2 || fila<0){
                System.out.println("un numero entre 0 y 2"
                        + "\nElige una fila");
                fila = sc.nextInt();
            }           
            
            if (tablero_partida.hayAlgo(fila, column)) {
                System.out.println("ya hay una ficha ahí");
                //
            }else{
            //colocamos la ficha ahí
            tablero_partida.ponerFicha(fila, column, turno);
            //terminar turno
                turnofin=false;             
            }
        }
        
        
    }
    static public void cambioTurno(){
            turno = !turno;
        }
}
