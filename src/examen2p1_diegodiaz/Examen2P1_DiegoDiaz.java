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
                    modificarNave();
                    break;
                case 3:
                    listarNaves();
                    break;
                case 4:
                    eliminarNave();
                    break;
                case 5:
                    simulacionCombate();
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

        System.out.println("Ingrese el tipo de ataque (Ataque/Defensa)");
        tipoNave = leer.nextLine();
        if (!tipoNave.equalsIgnoreCase("Ataque") && !tipoNave.equalsIgnoreCase("Defensiva")) {
            System.out.println("Ingrese tipo valido Ataque o defensa)");
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
            if (velocidad < 100 || velocidad > 1000) {
                System.out.println("Ingrese velocidad entre (100 - 1000)");
            }
        }
        Nave nuevaNave = new Nave(nombre, tipoNave, vida, escudo, ataque, velocidad);
        navesDisponibles.add(nuevaNave);
        System.out.println("Nave creada existosamente !");

    }

    public static void modificarNave() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ha ingresado la opcion de modificar naves. Elija la nave que modificara ingresando el numero de su nave");
        listarNaves();
        int index = -1;
        while (index < 0 || index >= navesDisponibles.size()) {
            System.out.print("Nave :  ");
            index = leer.nextInt();
            leer.nextLine();

        }

        Nave nave = navesDisponibles.get(index);

        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = leer.nextLine();

        String nuevoTipo = "";

        System.out.print("Ingrese el nuevo tipo (Ataque/Defensiva): ");
        nuevoTipo = leer.nextLine();
        if (!nuevoTipo.equalsIgnoreCase("Ataque") && !nuevoTipo.equalsIgnoreCase("Defensiva")) {
            System.out.println("Solo puede seleccionar ataque o defensa");

        }
        int nuevoEscudo = 0;
        while (nuevoEscudo < 100 || nuevoEscudo > 500) {
            System.out.print("Ingrese el nuevo Escudo (100 - 500): ");
            nuevoEscudo = leer.nextInt();
            leer.nextLine();
            if (nuevoEscudo < 100 || nuevoEscudo > 500) {
                System.out.println("Ingrese un escudo valido entre (100 - 500 )");
            }
        }
        nave.setNombre(nuevoNombre);
        nave.setTipo(nuevoTipo);
        nave.setEscudo(nuevoEscudo);

        System.out.println("Nave modificada correctamente !! ");
    }

    public static void listarNaves() {
        System.out.println("Naves disponibles: \n\n");
        System.out.println("Naves disponibles: ");
        if (navesDisponibles.isEmpty()) {
            System.out.println("No hay naves en el sistema.");
            return;
        }

        for (int i = 0; i < navesDisponibles.size(); i++) {
            System.out.println("[" + i + "] " + navesDisponibles.get(i).toString() + "\n\n--------------------");
        }

    }

    public static void eliminarNave() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ha ingresado la opcion eliminar . Elija la nave que eliminara ingresando su numero de nave");
        if (navesDisponibles.isEmpty()) {
            System.out.println("No hay naves para eliminar.");
            return;
        }

        listarNaves();
        int naves = -1;
        while (naves < 0 || naves >= navesDisponibles.size()) {
            System.out.print("Nave: \t ");
            naves = leer.nextInt();
            leer.nextLine();
        }

        Nave eliminada = navesDisponibles.remove(naves);
        System.out.println("La nave a sido eliminada con exito");
    }

    public static void simulacionCombate() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ha ingresado la opcion de simulacion de combate. Elija la primera nave ingresando el numero de nave");

        listarNaves();

        int index1 = -1;
        while (index1 < 0 || index1 >= navesDisponibles.size()) {
            System.out.print("Seleccione la primera nave para el combate: ");
            index1 = leer.nextInt();
            leer.nextLine();

        }

        int index2 = -1;
        while (true) {
            System.out.print("Seleccione la segunda nave: ");
            index2 = leer.nextInt();
            leer.nextLine();
            
            if (index1 < 0  || index2 >= navesDisponibles.size()) {
                System.out.println("Ingrese valor valido");
            }else if (index2 == index1){
                System.out.println("Tienen que ser diferentes");
            }
            
            

            Nave Nave1 = navesDisponibles.get(index1);
            Nave Nave2 = navesDisponibles.get(index1);

            String nombre1 = Nave1.getNombre();
            int vida1 = Nave1.getVida();
            int escudo1 = Nave1.getEscudo();
            int ataque1 = Nave1.getPoderAtaque();

            String nombre2 = Nave2.getNombre();
            int vida2 = Nave2.getVida();
            int escudo2 = Nave2.getEscudo();
            int ataque2 = Nave2.getPoderAtaque();
            
            
            System.out.println(nombre1 + nombre2);

        }
        
        
    }
    public static void Historial(){
        
    }
}
