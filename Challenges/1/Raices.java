import java.util.Scanner;
import java.lang.Math;

public class Raices{
    public static void main(String[] args){
        int a, b, c;
        float discriminante;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = prompt.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = prompt.nextInt();
        System.out.println("Ingrese el valor de c: ");
        c = prompt.nextInt();
        discriminante = ((int)Math.pow(b,2)) - (4*a*c);

        if(discriminante > 0) System.out.println("Las raices son reales y distintas" + discriminante);
        else if(discriminante == 0) System.out.println("Las raices son reales e iguales" + discriminante);
        else if(discriminante < 0) System.out.println("Las raices son imaginarias conjugadas" + discriminante);

    }
}