//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//mspsaapsakaokoapk
public class Main {
    public static void main(String[] args) {
        int numero1,numero2,resultado;
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        numero1=lectura.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2=lectura.nextInt();
        resultado= numero1 + numero2;
        System.out.println("La suma es "+resultado);



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Mi primer programa en Java");


    }
}