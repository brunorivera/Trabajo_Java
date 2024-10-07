//Ejercicio 7: Sistema de Recomendación de Actividades
//Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//recomiende una actividad basada en su estado de ánimo.



import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el estado de ánimo al usuario
        System.out.print("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = sc.nextLine().toLowerCase();

        // Recomendación basada en el estado de ánimo
        System.out.println("\nRecomendación de actividad:");

        switch (estadoAnimo) {
            case "feliz" ->
                    System.out.println("¡Genial! Disfruta de una caminata al aire libre o organiza una salida con amigos.");
            case "triste" ->
                    System.out.println("Es normal sentirse así. ¿Por qué no ves una película divertida o escuchas tu música favorita?");
            case "enérgico" ->
                    System.out.println("¡Perfecto! Sal a hacer ejercicio, ve al gimnasio o haz una carrera.");
            case "relajado" ->
                    System.out.println("Excelente. Dedica tiempo a meditar, leer un libro o practicar yoga.");
            default ->
                    System.out.println("Estado de ánimo no reconocido. Por favor, elige entre feliz, triste, enérgico o relajado.");
        }
    }
}
