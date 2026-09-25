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
     static Scanner leer = new Scanner(System.in);
     static ArrayList <Nave> navesDisponibles = new ArrayList<>();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
            
            
            
            switch(opc){
                case 1:
                    crearNave();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
    
    public static void crearNave(){
        System.out.println("Ha elegido la opcion de crear una nave porfavor aporte la informacion solicitada. ");
        System.out.println("Ingrese el nombre de la nave: ");
        String nombre = leer.nextLine();
        
        String tipoNave = "";
        while (!tipoNave.equalsIgnoreCase("Ataque") && tipoNave.equalsIgnoreCase("Defensa") ) {
            System.out.println("Ingrese el tipo de ataque (Ataque/Defensa)");
            tipoNave = leer.nextLine();
            
            if (!tipoNave.equalsIgnoreCase("Ataque") && tipoNave.equalsIgnoreCase("Defensiva")) {
                System.out.println("Error: El tipo solo puede ser 'Ataque' o 'Defensiva'.");     
            tipoNave = tipoNave.substring(0, 1).toUpperCase() + tipoNave.substring(1).toLowerCase();

        
        }
        
        }
    }
}
    

