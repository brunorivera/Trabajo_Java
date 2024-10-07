import java.util.Scanner;

//Ejercicio 6: Generador de Planes de Estudio
//Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
//plan de estudio semanal distribuyendo esas horas en diferentes materias.
public class Plan_De_Estudio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de horas que puede estudiar");
        int horas=sc.nextInt();
        System.out.println("ingrese la cantidad de materias");
        int materias=sc.nextInt();

        float hora_por_materia = (float) horas/materias;

        System.out.println("deberias estudiar "+ hora_por_materia + " por materia");

    }
}
