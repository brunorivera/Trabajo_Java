//Ejercicio 3: Generador de Rutinas de Ejercicio
//Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
// avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y duraciones.
import java.util.Scanner;
public class Rutina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su experiencia en entrenamiento teniendo en cuenta lo sigueinte" +
                "1-principios,2-intermedio,3-avanzado");
        int entreno= sc.nextInt();

        if (entreno ==1){
            System.out.println("Para un novato en estas situaciones tu entrenamiento es el siguiente"
            + "sentallidas,flexiones y planchas. Repetir esto durante 3 series de 10-12 repeticiones"+
                    "y como cardio 20 minutos de caminata rapida");
        }else if (entreno ==2){
            System.out.println("Veo que estas en el punto medio tu entrenamiento es el siguiente"+
                    "sentadillas con mancuernas, estocadas,flexiones y planchas, repitiendolo por"+
                    "3-4 series de 12-15 repeticiones");
        }else if(entreno == 3){
            System.out.println("Tienes experencia eso veo, tus ejercicios son sentadilla con barra"+
                    "press de banca, peso muerto y planchas laterales, repitiendolo por 4 series"+
                    "de 8-10 repiticiones y de cardio  o trote de 30 minutos");
        }else{
            System.out.println("El numero ingresado no esta registrado en los niveles de entrenamiento");
        }

    }
}
