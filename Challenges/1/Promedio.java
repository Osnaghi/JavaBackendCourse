import java.util.Scanner;

public class Promedio {
    public static void main(String[]args) {
        int primerNota, segundaNota, tercerNota;
        float promedio;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Ingrese la primer nota: ");
        primerNota = prompt.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        segundaNota = prompt.nextInt();
        System.out.println("Ingrese la tercer nota: ");
        tercerNota = prompt.nextInt();
        promedio = (primerNota + segundaNota + tercerNota)/3;
        System.out.println("El promedio de las 3 notas es: " + promedio);

        if(promedio < 10) System.out.println("Usted ha sido reprobado");
        else if(promedio >= 10 && promedio <= 15) System.out.println("Usted ha sido aprobado");
        else if(promedio > 15) System.out.println("Usted ha sido eximido");

    }
}
