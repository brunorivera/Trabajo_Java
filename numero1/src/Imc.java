//Ejercicio 4: Calculadora de IMC con Recomendaciones
//Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
//calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
//peso, peso normal, sobrepeso, obesidad).



import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese su peso en kilogramos:");
        float peso = sc.nextFloat();
        System.out.println("Ingrese su altura en metros:");
        float altura = sc.nextFloat();


        float imc = peso / (altura * altura);


        System.out.printf("Tu IMC es: %.2f\n", imc);


        if (imc < 18.5) {
            System.out.println("Tienes bajo peso. Es recomendable que hables con un profesional de la salud.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Tienes un peso normal. ¡Sigue manteniéndote saludable!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Tienes sobrepeso. Considera llevar una dieta equilibrada y hacer ejercicio.");
        } else {
            System.out.println("Tienes obesidad. Es recomendable que consultes a un profesional de la salud.");
        }
    }
}
