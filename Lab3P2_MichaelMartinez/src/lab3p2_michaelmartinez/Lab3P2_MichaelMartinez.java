/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_michaelmartinez;

import java.util.ArrayList;
import java.util.Random;
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
        Random random=new Random();
        ArrayList <pokemon> listaPokemones=new ArrayList();
        ArrayList <pokeball> listaPokeballs=new ArrayList();
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
                    System.out.println("1. FireType");
                    System.out.println("2. WaterType");
                    System.out.println("3. GrassType");
                    System.out.print("Que tipo desea agregar: ");
                    int opcion=entrada.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el nombre del pokemon: ");
                            String nombre=entrada.next();
                            System.out.print("Ingrese el numero de entrada a la Pokedex: ");
                            int numeroEntrada=entrada.nextInt();
                            System.out.print("Ingrese la naturaleza del pokemon (Timido, energetico o misterioso): ");
                            String naturaleza=entrada.next();
                            System.out.print("Ingrese la potencia de sus llamas: ");
                            int potencia=entrada.nextInt();
                            boolean atrapado=false;
                            pokeball pokebola=new pokeball();
                            pokemon nuevoFire=new fireType(potencia, nombre, numeroEntrada, naturaleza, atrapado, pokebola);
                            listaPokemones.add(nuevoFire);
                            break;
                        case 2:
                            System.out.print("Ingrese el nombre del pokemon: ");
                            String nombre2=entrada.next();
                            System.out.print("Ingrese el numero de entrada a la Pokedex: ");
                            int numeroEntrada2=entrada.nextInt();
                            System.out.print("Ingrese la naturaleza del pokemon (Timido, energetico o misterioso): ");
                            String naturaleza2=entrada.next();
                            System.out.print("¿Puede vivir fuera del agua? si/no: ");
                            String supervivencia=entrada.next();
                            boolean vivir=false;
                            if (supervivencia.equalsIgnoreCase("si")) {
                                vivir=true;
                            }
                            System.out.print("Ingrese la rapidez al nadar: ");
                            int rapidez=entrada.nextInt();
                            boolean atrapado2=false;
                            pokeball pokebola2=new pokeball();
                            pokemon nuevoWater=new waterType(vivir, rapidez, nombre2, numeroEntrada2, naturaleza2, atrapado2, pokebola2);
                            listaPokemones.add(nuevoWater);
                            
                            break;
                        case 3:
                            System.out.print("Ingrese el nombre del pokemon: ");
                            String nombre3=entrada.next();
                            System.out.print("Ingrese el numero de entrada a la Pokedex: ");
                            int numeroEntrada3=entrada.nextInt();
                            System.out.print("Ingrese la naturaleza del pokemon (Timido, energetico o misterioso): ");
                            String naturaleza3=entrada.next();
                            System.out.print("Ingrese el habitat del pokemon: ");
                            String habitat=entrada.next();
                            System.out.print("Ingresen su dominio sobre las plantas (1-100): ");
                            int dominio=entrada.nextInt();
                            boolean atrapado3=false;
                            pokeball pokebola3=new pokeball();
                            if (dominio>100 || dominio<1) {
                                System.out.println("Dominio incorrecto");
                            }else{
                                pokemon nuevoGrass=new grassType(habitat, dominio, nombre3, numeroEntrada3, naturaleza3, atrapado3, pokebola3);
                                listaPokemones.add(nuevoGrass);
                            }
                            
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    
                    break;
                case 2:
                    System.out.print("Ingrese el color de la pokebola: ");
                    String color=entrada.next();
                    System.out.print("Ingrese el numero de serie: ");
                    int serie=entrada.nextInt();
                    System.out.print("Ingrese la eficiencia de atrapado: ");
                    int eficiencia=entrada.nextInt();
                    int contador=0;
                    for (int i = 0; i <listaPokeballs.size(); i++) {
                        if (serie==listaPokeballs.get(i).serie) {
                           contador++;
                        }
                    }
                    if (contador!=0) {
                        System.out.println("Serie ya existe");
                    }else{
                        if (eficiencia==1 || eficiencia==2 || eficiencia==3) {
                            pokeball nuevaPokeball=new pokeball(color, serie, eficiencia);
                            listaPokeballs.add(nuevaPokeball);
                        }
                    }
                    
                    break;
                case 3:
                    System.out.println("---POKEMONES---");
                    for (pokemon p : listaPokemones) {
                        if (p instanceof fireType) {
                            System.out.println(p);
                        }
                    }
                    for (pokemon p : listaPokemones) {
                        if (p instanceof waterType) {
                            System.out.println(p);
                        }
                    }
                    
                    for (pokemon p : listaPokemones) {
                        if (p instanceof grassType) {
                            System.out.println(p);
                        }
                    }
                    
                    break;
                case 4:
                    System.out.println("1. FireType");
                    System.out.println("2. WaterType");
                    System.out.println("3. GrassType");
                    System.out.print("Que tipo desea eliminar: ");
                    int op=entrada.nextInt();
                    switch (op) {
                        case 1:
                            if (listaPokemones.size() != 0) {
                                int conta=0;
                                for (int i = 0; i < listaPokemones.size(); i++) {
                                    if (listaPokemones.get(i) instanceof fireType) {
                                        System.out.println(i+ " )"+listaPokemones.get(i));
                                        conta++;
                                    }
                                }
                                if (conta!=0) {
                                    System.out.print("Ingrese la posicion del pokemon a eliminar: ");
                                    int eliminar=entrada.nextInt();
                                    if (listaPokemones.get(eliminar) instanceof fireType) {
                                        listaPokemones.remove(eliminar);
                                    }else{
                                        System.out.println("El numero elegido no está listado");
                                    }
                                    
                                }else{
                                    System.out.println("No hay pokemones de ese tipo en la lista");
                                }
                                
                            }else{
                                 System.out.println("La lista está vacía");
                            }
                            break;
                        case 2:
                             if (listaPokemones.size() != 0) {
                                int conta=0;
                                for (int i = 0; i < listaPokemones.size(); i++) {
                                    if (listaPokemones.get(i) instanceof waterType) {
                                        System.out.println(i+ " )"+listaPokemones.get(i));
                                        conta++;
                                    }
                                }
                                if (conta!=0) {
                                    System.out.print("Ingrese la posicion del pokemon a eliminar: ");
                                    int eliminar=entrada.nextInt();
                                    if (listaPokemones.get(eliminar) instanceof waterType) {
                                        listaPokemones.remove(eliminar);
                                    }else{
                                        System.out.println("El numero elegido no está listado");
                                    }
                                    
                                }else{
                                    System.out.println("No hay pokemones de ese tipo en la lista");
                                }
                                
                            }else{
                                 System.out.println("La lista está vacía");
                            }
                            
                            break;
                        case 3:
                             if (listaPokemones.size() != 0) {
                                int conta=0;
                                for (int i = 0; i < listaPokemones.size(); i++) {
                                    if (listaPokemones.get(i) instanceof grassType) {
                                        System.out.println(i+ " )"+listaPokemones.get(i));
                                        conta++;
                                    }
                                }
                                if (conta!=0) {
                                    System.out.print("Ingrese la posicion del pokemon a eliminar: ");
                                    int eliminar=entrada.nextInt();
                                    if (listaPokemones.get(eliminar) instanceof grassType) {
                                        listaPokemones.remove(eliminar);
                                    }else{
                                        System.out.println("El numero elegido no está listado");
                                    }
                                    
                                }else{
                                    System.out.println("No hay pokemones de ese tipo en la lista");
                                }
                                
                            }else{
                                 System.out.println("La lista está vacía");
                            }
                            
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    
                    
                    break;
                case 5:
                    if (listaPokeballs.isEmpty()) {
                        System.out.println("No hay pokebolas");
                    } else {
                        for (int i = 0; i < listaPokeballs.size(); i++) {
                            System.out.println(i + " )" + listaPokeballs.get(i));
                        }
                        System.out.print("Elija la posicion de una pokebola: ");
                        int posi = entrada.nextInt();
                        int numeroRandom = random.nextInt(0, listaPokemones.size() - 1);
                        if (((pokemon) listaPokemones.get(numeroRandom)).atrapado) {
                            System.out.println("El pokemon ya está atrapado");
                        } else {
                            System.out.println("Ha aparecido el pokemon " + ((pokemon) listaPokemones.get(numeroRandom)).nombre);
                            System.out.println("1. Huir");
                            System.out.println("2. Atraparlo");
                            System.out.print("Elija una opcion: ");
                            int elegir = entrada.nextInt();
                            switch (elegir) {
                                case 1:

                                    break;
                                case 2:
                                    int numero = random.nextInt(1, 4);
                                    System.out.print("Random de eficiencia " + numero);
                                    if (((pokeball) listaPokeballs.get(posi)).eficiencia == 3) {
                                        System.out.println("Pokemon atrapado");
                                        ((pokemon) listaPokemones.get(numeroRandom)).setPokeball(listaPokeballs.get(posi));
                                        ((pokemon) listaPokemones.get(numeroRandom)).setAtrapado(true);
                                        listaPokeballs.remove(posi);
                                    } else if (((pokeball) listaPokeballs.get(posi)).eficiencia == 2 || ((pokeball) listaPokeballs.get(posi)).eficiencia == 1
                                            && numero == 1 || numero == 2) {
                                        System.out.println("Pokemon atrapado");
                                        ((pokemon) listaPokemones.get(numeroRandom)).setPokeball(listaPokeballs.get(posi));
                                        ((pokemon) listaPokemones.get(numeroRandom)).setAtrapado(true);
                                        listaPokeballs.remove(posi);
                                    } else if (((pokeball) listaPokeballs.get(posi)).eficiencia == 1 && numero == 1) {
                                        System.out.println("Pokemon atrapado");
                                        ((pokemon) listaPokemones.get(numeroRandom)).setPokeball(listaPokeballs.get(posi));
                                        ((pokemon) listaPokemones.get(numeroRandom)).setAtrapado(true);
                                        listaPokeballs.remove(posi);
                                    } else {
                                        System.out.println("El pokemon escapó");
                                        listaPokeballs.remove(posi);
                                    }

                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");
                            }

                        }

                    }
                    
                    
                    break;
                case 6:
                    System.out.println("1. FireType");
                    System.out.println("2. WaterType");
                    System.out.println("3. GrassType");
                    System.out.print("Que tipo desea eliminar: ");
                    int opcionModificar=entrada.nextInt();
                    switch (opcionModificar) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    
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
