//Ejercicio 5: Juego de Piedra, Papel o Tijera
//Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
//elige una opción al azar y determina quién gana. Imprime el resultado del juego


import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        String[] opciones = {"piedra", "papel", "tijera"};


        System.out.println("Elige entre piedra, papel o tijera:");
        String eleccionUsuario = sc.nextLine().toLowerCase();


        String eleccionComputadora = opciones[random.nextInt(opciones.length)];


        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);


        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Has ganado!");
        } else {
            System.out.println("¡Has perdido!");
        }
    }
}
