//Ejercicio 1: Sistema de Recomendación de Películas
//Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
//ciencia ficción) y luego recomiende una película basada en su elección

import java.util.Scanner;

public class Peliculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque su genero de pelicula favorito 1-accion,2-comedia,3-drama,4-ciencia ficcion");
        int eleccion = sc.nextByte();

        if (eleccion==1){
            System.out.println("Las peliculas que te recomiendo con el genero de accion son, Mad Max:Fury Road,John Wick");
        }else if (eleccion==2){
            System.out.println("Las peliculas que te recomiendo con categoria de comedia son, Superbad y The Hangover");
        }else if(eleccion==3){
            System.out.println("Las peliculas que te recomiendo de categoria Drama son, Forrest Gump y The pursuit of Happyness");
        }else if (eleccion==4){
            System.out.println("Las peliculas que te recomiendo de categoria Ciencia ficcion son, Inception y The matrix");
        }else {
            System.out.println("Error categoria no registrada");
        }
    }
}
