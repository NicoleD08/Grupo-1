/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo_1;

/**
 *
 * @author DAVID
 */
public class Grupo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("====== MENÚ ======");
            System.out.println("1. Verificar si un número es perfecto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número entero positivo: ");
                    int numero = scanner.nextInt();
                    if (esPerfecto(numero)) {
                        System.out.println(numero + " es un número perfecto.");
                    } else {
                        System.out.println(numero + " no es un número perfecto.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }

    public static boolean esPerfecto(int numero) {
        if (numero <= 0) return false;
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
    }
}
