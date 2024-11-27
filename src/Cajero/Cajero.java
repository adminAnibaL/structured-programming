package Cajero;

/*
Nivel Alto
Problema:
Escribe un programa que simule un sistema de cajero automático con las siguientes funcionalidades:

Solicitar al usuario el monto que desea retirar (en múltiplos de 10).
Validar que el monto solicitado no exceda el saldo disponible.
Calcular y mostrar cuántos billetes de cada denominación se entregarán (100, 50, 20, 10).
Mostrar el saldo restante después del retiro.
Condiciones adicionales:

Si el monto solicitado no es válido (no múltiplo de 10 o excede el saldo), debe mostrar un mensaje de error y permitir intentar nuevamente.
Supón que el saldo inicial del cajero es de $5,000 y el usuario puede retirar hasta esa cantidad.
Optimiza la cantidad de billetes entregados, priorizando los de mayor denominación.
Restricciones:

Usa estructuras de control (if, while) y arreglos para manejar las denominaciones.
No uses funciones avanzadas o bibliotecas externas; el enfoque debe ser estructurado.
 */

//PROGRAM - ESTRUCTURADA

import java.util.Scanner;

public class Cajero {

    static double saldoTotal = 0.0;

    public static void main(String[] args) {

        menuCajero();


    }

    public static void menuCajero() {
        int opcionElegida;

        String[] menu = {
                "1.- Ingresar Dinero",
                "2.- Retirar Dinero",
                "3.- Consultar Saldo",
                "4.- Salir"
        };
        //recorrido menu
        do {
            System.out.println(" ********* Mi Cajero automático *******");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i] + " ");
            }


            Scanner sc = new Scanner(System.in);
            System.out.print("Elija Opción → ");

            if ((!sc.hasNextInt())) {
                System.out.println("Error, elija (1/4)");
            }
            opcionElegida = sc.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.println("Ha elegido Ingresar dinero");
                    double ingreso = ingresDinero();
                    saldoTotal += ingreso;
                    System.out.println("Su saldo actual es " + saldoTotal);
                    break;
                case 2:
                    System.out.println("Ha elegido Retirar dinero");
                    break;
                case 3:
                    System.out.println("Ha elegido Consultar saldo");
                    System.out.println("Su saldo actual es " + saldoTotal);
                    break;
                case 4:
                    System.out.println("Gracias ☻ ♥ → por utilizar nuestros cajeros  ");
                    break;
            }
        } while (opcionElegida != 4);
    }//end--------------Menu

    public static double ingresDinero() {
        Scanner sc = new Scanner(System.in);
        double ingreso = 0.0;

        while (true) {
            System.out.println("Ingrese dinero ");
            if (!sc.hasNextDouble()) {
                System.out.println("Error");
                sc.next();
                continue;
            }
            ingreso = sc.nextDouble();

            if (ingreso >= 0) {

                break;
            } else {
                System.out.println("error 2");
            }
        }
        return ingreso;
    }
}


