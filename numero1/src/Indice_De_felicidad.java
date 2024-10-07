import java.util.Scanner;

public class Indice_De_felicidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero del 1 al 10 de su nivel de felicidad");
      int nivel= sc.nextInt();

      if (nivel>=1 & nivel<=4){
          System.out.println("Su estado es infeliz");

      }else if (nivel>=5 & nivel <=7){
          System.out.println("Es feliz");
      } else if (nivel>=8 & nivel<=10) {
          System.out.println("Muy feliz");

      }else{
          System.out.println("Ingreso un numero invadilo");
      }
    }
}
