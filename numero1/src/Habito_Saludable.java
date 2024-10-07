//Ejercicio 6: Evaluador de Hábitos Saludables
        //Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
       //ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
       // hábitos saludables basada en estos datos.

import java.util.Scanner;

public class Habito_Saludable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("¿Cuántas horas duerme al día? ");
        int horasSueno = sc.nextInt();

        System.out.print("¿Cuántas horas hace ejercicio al día? ");
        int horasEjercicio = sc.nextInt();

        System.out.print("¿Cuántas comidas saludables consume al día? ");
        int comidasSaludables = sc.nextInt();


        System.out.println("\nEvaluación de tus hábitos saludables:");

        if (horasSueno < 7) {
            System.out.println("Deberías dormir más de 7 horas para mejorar tu salud.");
        } else {
            System.out.println("¡Buen trabajo! Estás durmiendo lo suficiente.");
        }

        if (horasEjercicio < 1) {
            System.out.println("Intenta hacer al menos 1 hora de ejercicio al día.");
        } else {
            System.out.println("¡Excelente! Estás haciendo suficiente ejercicio.");
        }

        if (comidasSaludables < 3) {
            System.out.println("Intenta consumir al menos 3 comidas saludables al día.");
        } else {
            System.out.println("¡Genial! Estás consumiendo suficientes comidas saludables.");
        }

    }
}