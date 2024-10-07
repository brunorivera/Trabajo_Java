//Ejercicio 5: Calculadora de Costo de Viaje
//Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
//combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
//calcule e imprima el costo total del viaje

import java.util.Scanner;

public class Calculo_Combustible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la distancia en kilometros");
        float km= sc.nextFloat();
        System.out.println("ingrese el consumo de combustible");
        float consumo= sc.nextFloat();
        System.out.println("y finalmente el costo del combustible");
        float costo = sc.nextFloat();

        float consumo_km=consumo/km;
        float total = km * costo * consumo_km;

        System.out.println("se gasto"+total+ "$");

    }
}
