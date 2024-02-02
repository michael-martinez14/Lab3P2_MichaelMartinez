/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_michaelmartinez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael Martínez
 */
public class Lab3P2_MichaelMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        ArrayList <pokemon> listaPokemones=new ArrayList();
        boolean bandera=true;
        int opcionMenu=0;
        while (bandera) {
            System.out.println("1. Crear pokemón");
            System.out.println("2. Crear pokebola");
            System.out.println("3. Listar Pokemon");
            System.out.println("4. Eliminar pokemon");
            System.out.println("5. Capturar pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opcion a ejecutar: ");
            opcionMenu=entrada.nextInt();
            switch (opcionMenu) {
                case 1:
                    
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
                    bandera=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            
            
        }
    }
    
}
