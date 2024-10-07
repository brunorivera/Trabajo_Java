//Ejercicio 3: Sistema de Recomendación de Libros
//Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
//ciencia ficción) y luego recomiende un libro basado en su elección.

import java.util.Scanner;

public class Libros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Elige tu género de libro favorito (fantasía, misterio, romance, ciencia ficción):");
        String genero = sc.nextLine().toLowerCase();

        switch (genero) {
            case "fantasía":
                System.out.println("Te recomendamos leer 'El Hobbit' de J.R.R. Tolkien.");
                break;
            case "misterio":
                System.out.println("Te recomendamos leer 'El Código Da Vinci' de Dan Brown.");
                break;
            case "romance":
                System.out.println("Te recomendamos leer 'Orgullo y Prejuicio' de Jane Austen.");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos leer '1984' de George Orwell.");
                break;
            default:
                System.out.println("No tenemos recomendaciones para ese género.");
                break;
        }
    }
}



