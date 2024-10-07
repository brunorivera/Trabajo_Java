
import java.util.Scanner;


public class Calculo_descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio de un producto");
        float precio = sc.nextFloat();
        System.out.println("Ingrese la categoria de cliente,1-estudiante,2-adulto,3-jubilado");
        int categoria = sc.nextInt();
        if(categoria==1){
            float descuento = (10/precio) * 100;
            float total= precio - descuento;
            System.out.println("el precio final es"+ total);
        }else if (categoria== 2){
            float descuento = (5/precio) * 100;
            float total= precio - descuento;
            System.out.println("el precio final es"+ total);
        }else if(categoria==3){
            float descuento = (15/precio) * 100;
            float total= precio - descuento;
            System.out.println("el precio final es"+ total);
        }else {
            System.out.println("Categoria no registrada");
        }
    }
}
