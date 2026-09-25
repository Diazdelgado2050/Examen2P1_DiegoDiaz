/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2p1_diegodiaz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Examen2P1_DiegoDiaz {

    //uso metodos estaticos para poder llamarlos donde sea 
    static ArrayList<Nave> navesDisponibles = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Bienvenido al Gran Torneo AeroEspacial VI");
            System.out.println(" == Menu principal ==");
            System.out.println("1. CreaR Nave");
            System.out.println("2. Modificar Nave");
            System.out.println("3. Listar Naves Disponibles");
            System.out.println("4. Eliminar Nave");
            System.out.println("5. Simular Combate");
            System.out.println("6. Ver historial de combates");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    crearNave();
                    break;
                case 2:
                    break;
                case 3:
                    listarNaves();
                    break;
                case 4:
                    eliminarNave();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Fin de el programa...");
                    break;
                default:
                    break;

            }

        } while (opc != 7);
    }
    // creo un metodo auxiliar  para que si el usuario ingresa un dato afuera del rango por ejemplo vida ingresa 900 vuelva a preguntar 

    public static void crearNave() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ha elegido la opcion de crear una nave porfavor aporte la informacion solicitada. ");
        System.out.println("Ingrese el nombre de la nave: ");
        String nombre = leer.nextLine();

        String tipoNave = "";
        while (!tipoNave.equalsIgnoreCase("Ataque") && tipoNave.equalsIgnoreCase("Defensa")) {
            System.out.println("Ingrese el tipo de ataque (Ataque/Defensa)");
            tipoNave = leer.nextLine();
            if (!tipoNave.equalsIgnoreCase("Ataque") && !tipoNave.equalsIgnoreCase("Defensiva")) {
                System.out.println("Ingrese tipo valido Ataque o defensa)");
            }
        }
        

        int vida = 0;
        while (vida < 1000 || vida > 2000) {
            System.out.println("Ingrese vida (1000 - 2000)");
            vida = leer.nextInt();
            leer.nextLine();
            if (vida < 1000 || vida > 2000) {
                System.out.println("Ingrese una vida valida, entre (1000 - 2000) ");
            }
        }
            int escudo = 0;
            while (escudo < 100 || escudo > 500) {
                System.out.println("Ingrese el Escudo (100 - 500): ");
                escudo = leer.nextInt();
                leer.nextLine();
                if (escudo < 100 || escudo > 500) {
                    System.out.println("Ingrese un escudo valido entre (100 - 500) ");
                }
            }
                int ataque = 0;
        while (ataque < 4 || ataque > 10) {
            System.out.println("Ingrese el Poder de Ataque (4 - 10) : ");
            ataque = leer.nextInt();
            leer.nextLine();
            if (ataque < 4 || ataque > 10) {
                System.out.println("Ingrese poder valido entre (4 - 10)");
            }
        }

                int velocidad = 0;
                while (velocidad < 100 || velocidad > 1000) {
                    System.out.println("Ingrese velocidad (100 - 1000)");
                    velocidad = leer.nextInt();
                    leer.nextLine();
                    if (velocidad < 100 || velocidad > 1000 ) {
                        System.out.println("Ingrese velocidad entre (100 - 1000)");
                    }
                }
                Nave nuevaNave = new Nave(nombre, tipoNave, vida, escudo, ataque, velocidad);
                navesDisponibles.add(nuevaNave);
                System.out.println("Nave creada existosamente !");

            }
    public static void modificarNave(){
        
        
        
    }
    
    public static void listarNaves(){
        System.out.println("Naves disponibles: \n\n");
        System.out.println("Naves disponibles: ");
        if (navesDisponibles.isEmpty()) {
            System.out.println("No hay naves en el sistema.");
            return;
        }

        for (int i = 0; i < navesDisponibles.size(); i++) {
            System.out.println("[" + i + "] " + navesDisponibles.get(i).toString());
        }
       
    }
    public static void eliminarNave(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ha ingresado la opcion eliminar . Elija la nave que eliminara ingresando su numero de nave");
        if (navesDisponibles.isEmpty()) {
            System.out.println("No hay naves para eliminar.");
            return;
        }

        listarNaves();
        int naves = -1;
        while (naves  < 0 || naves >= navesDisponibles.size()) {
            System.out.print("Nave: \t ");
            naves = leer.nextInt();
            leer.nextLine();
        }

        Nave eliminada = navesDisponibles.remove(naves);
        System.out.println("La nave a sido eliminada con exito");
    }
    }
    

        

    
    

