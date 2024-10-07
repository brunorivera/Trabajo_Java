//Ejercicio 4: Generador de Listas de Reproducción
       // Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
       // genere una lista de reproducción con canciones sugeridas para ese estado de ánimo
//Eye of the Tiger" - Survivor
//"Can't Hold Us" - Macklemore & Ryan Lewis
//"Stronger" - Kanye West
import java.util.Scanner;

public class Lista_Reproduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su estado de animado teniendo en cuenta las categorias");
        System.out.print("1-Feliz,2-Triste,3-energico,4-relajado");
        int estado= sc.nextInt();

        if (estado == 1){
            System.out.println("Las canciones son: Happy-Pharrell williams.Walking on sunshine-Katrina and Waves.Good as hell-Lizzo");
        }else if (estado ==2){
            System.out.println("Las canciones son: Someone Like You-Adele.Fix you-ColdPlay.Let her go-Passenger");
        }else if (estado ==3){
            System.out.println("Las canciones son: Break Stuff-Limp Bizkit.Killing in the name-rage against the machine.Numb-Linkin Park");
        }else if (estado == 4){
            System.out.println("Las canciones: Eye of the Tigger-Survivor.Cant hold us-Macklemore y Ryan lewis.Stronger-Kanye west");
        }else{
            System.out.println("ingreso un estado no registrado");
        }
    }
}
