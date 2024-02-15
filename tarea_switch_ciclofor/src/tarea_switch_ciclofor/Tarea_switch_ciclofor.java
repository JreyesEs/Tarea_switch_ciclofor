/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_switch_ciclofor;
import java.util.Scanner;

public class Tarea_switch_ciclofor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;

        do {
            System.out.println("menu de la tarea de Switch y ciclo for");
            System.out.println("Estas son las opciones dadas");
            System.out.println("1) numeros pares e impares");
            System.out.println("2) Triangulos y más Triangulos");
            System.out.println("3) Anita lava la tina");
            System.out.println("4) Codigos secretos");
            System.out.println("5) Salir");
            menu = entrada.nextInt();

            System.out.println("");
            switch (menu) {
                
                case 1:
                    System.out.println("Selecciono numeros pares e impares");
                    System.out.print("Ingrese un numero: ");
                    int N = entrada.nextInt();

                    int pares = 0;
                    int impares = 0;

                    System.out.print("Entre 0 y " + N + " existen ");
                    for (int i = 0; i <= N; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + ", ");
                            pares++;
                        } else {
                            impares++;
                        }
                    }
                    System.out.println("que son los numeros pares.");

                    System.out.print("Entre 0 y " + N + " existen ");
                    for (int i = 0; i <= N; i++) {
                        if (i % 2 != 0) {
                            System.out.print(i + ", ");
                        }
                    }
                    System.out.println("que son los numeros impares.");
                    System.out.println("Son " + pares + " numeros pares y " + impares + " numeros impares.");
                    break;
                    
                case 2:
                    System.out.println("Selecciono triangulos y mas triangulos");
                    while (true) {
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Triángulo rectángulo");
                        System.out.println("2. Triángulo equilátero");
                        System.out.println("3. Salir");

                        int opcion = entrada.nextInt();
                        if (opcion == 3) {
                            System.out.println("Esta saliendo del subprograma");
                            break;
                        }

                        System.out.print("Ingrese la altura del triángulo: ");
                        int altura = entrada.nextInt();

                        switch (opcion) {
                            case 1:
                                for (int i = 1; i <= altura; i++) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 0; i < altura; i++) {
                                    for (int j = altura - i; j > 1; j--) {
                                        System.out.print(" ");
                                    }
                                    for (int j = 0; j <= i * 2; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Dato no valido, ingrese el numero nuevamente.");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Selecciono anita lava la tina");
                    entrada.nextLine(); 
                    System.out.print("Ingrese una palabra o frase: ");
                    String palabra = entrada.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");

                    int izquierda = 0;
                    int derecha = palabra.length() - 1;
                    boolean esPalindromo = true;

                    while (izquierda < derecha) {
                        if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                            esPalindromo = false;
                            break;
                        }
                        izquierda++;
                        derecha--;
                    }

                    if (esPalindromo) {
                        System.out.println("La palabra o frase es un palíndromo.");
                    } else {
                        System.out.println("La palabra o frase no es un palíndromo.");
                    }

                    break;
                    
                case 4:
                    System.out.println("Selecciono codigos secretos");
                    entrada.nextLine(); 
                    System.out.println("Ingrese el código secreto");
                    System.out.print("Entrada: ");
                    String codigo = entrada.nextLine();

                    String resultado = "";
                    for (int i = 0; i < codigo.length(); i += 2) {
                        char letra = codigo.charAt(i);
                        int repeticiones = codigo.charAt(i + 1) - '0';
                        for (int j = 0; j < repeticiones; j++) {
                            resultado += letra;
                        }
                    }

                    System.out.println("Salida esperada: " + resultado);

                    break;
                    
                case 5:
                    System.out.println("Esta saliendo del programa");
                    break;
                default:
                    System.out.println("Dato no valido, ingrese nuevamente el numero.");
            }
        } while (menu != 5);
    }
}

