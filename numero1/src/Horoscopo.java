//Ejercicio 1: Generador de Horóscopo
//Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
//imprima su signo del zodiaco y un mensaje de horóscopo correspondiente

import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (DD/MM/AAAA):");
        String fecha = sc.nextLine();

        String[] partes = fecha.split("/");


        if (partes.length != 3) {
            System.out.println("Formato de fecha incorrecto. Debe ser DD/MM/AAAA.");
            sc.close();
            return;
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);


        if (mes == 1) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Tu signo zodiacal es Capricornio.");
            } else {
                System.out.println("Tu signo zodiacal es Acuario.");
            }
        } else if (mes == 2) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Tu signo zodiacal es Acuario.");
            } else {
                System.out.println("Tu signo zodiacal es Piscis.");
            }
        } else if (mes == 3) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Tu signo zodiacal es Piscis.");
            } else {
                System.out.println("Tu signo zodiacal es Aries.");
            }
        } else if (mes == 4) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Tu signo zodiacal es Aries.");
            } else {
                System.out.println("Tu signo zodiacal es Tauro.");
            }
        } else if (mes == 5) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Tu signo zodiacal es Tauro.");
            } else {
                System.out.println("Tu signo zodiacal es Géminis.");
            }
        } else if (mes == 6) {
            if (dia >= 1 && dia <= 21) {
                System.out.println("Tu signo zodiacal es Géminis.");
            } else {
                System.out.println("Tu signo zodiacal es Cáncer.");
            }
        } else if (mes == 7) {
            if (dia >= 1 && dia <= 22) {
                System.out.println("Tu signo zodiacal es Cáncer.");
            } else {
                System.out.println("Tu signo zodiacal es Leo.");
            }
        } else if (mes == 8) {
            if (dia >= 1 && dia <= 23) {
                System.out.println("Tu signo zodiacal es Leo.");
            } else {
                System.out.println("Tu signo zodiacal es Virgo.");
            }
        } else if (mes == 9) {
            if (dia >= 1 && dia <= 22) {
                System.out.println("Tu signo zodiacal es Virgo.");
            } else {
                System.out.println("Tu signo zodiacal es Libra.");
            }
        } else if (mes == 10) {
            if (dia >= 1 && dia <= 23) {
                System.out.println("Tu signo zodiacal es Libra.");
            } else {
                System.out.println("Tu signo zodiacal es Escorpio.");
            }
        } else if (mes == 11) {
            if (dia >= 1 && dia <= 21) {
                System.out.println("Tu signo zodiacal es Escorpio.");
            } else {
                System.out.println("Tu signo zodiacal es Sagitario.");
            }
        } else if (mes == 12) {
            if (dia >= 1 && dia <= 21) {
                System.out.println("Tu signo zodiacal es Sagitario.");
            } else {
                System.out.println("Tu signo zodiacal es Capricornio.");
            }
        } else {
            System.out.println("Mes no válido. Por favor, ingrese un mes entre 1 y 12.");
        }

        sc.close();
    }
}

