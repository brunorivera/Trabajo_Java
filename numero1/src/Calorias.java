//Ejercicio 2: Calculadora de Calorías Quemadas
//Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
//minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
//calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de ejercicio

import java.util.Scanner;

public class Calorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos");
        int kg = sc.nextInt();
        System.out.println("ingrese la duracion del ejercicio en minutos");
        int minutos = sc.nextInt();
        System.out.println("ingrese el tipo de ejercicio(1-correr,2-nadar,3-" +
                "andar en bicicleta)");
        int ejercicio = sc.nextInt();

        //float calorias_quemadas=  kg * (minutos/60);

        if (ejercicio == 1) {
            float calorias_quemadas = 8 * kg * (minutos / 60f);
            System.out.println("las calorias quemadas fueron" + calorias_quemadas);

        } else if (ejercicio == 2) {
            float calorias_quemadas = 6 * kg * (minutos / 60f);
            System.out.println("las calorias quemadas fueron" + calorias_quemadas);
        } else if (ejercicio == 3) {
            float calorias_quemadas = 6 * kg * (minutos / 60f);
            System.out.println("las calorias quemadas fueron" + calorias_quemadas);
        } else {
            System.out.println("el numero ingresado no estaba registrado");
        }
    }
}



