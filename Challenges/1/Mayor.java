import java.util.Scanner;

public class Mayor {
    public static void main (String[] args){
        int num1, num2, num3;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = prompt.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = prompt.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = prompt.nextInt();
        if(num1 > num2 && num1 > num3) System.out.println("El número " + num1 + " es mayor que " + num2 + " y " + num3);
        else if(num2 > num1 && num2 > num3) System.out.println("El número " + num2 + " es mayor que " + num1 + " y " + num3);
        else System.out.println("El número " + num3 + " es mayor que " + num1 + " y " + num2);
    }
}