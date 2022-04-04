
import java.util.Scanner; 
public class EsPrimo {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 14 para saber si es primo: ");
        int numero = prompt.nextInt();
        while (true) {
            if (numero > 14 || numero < 1) {
                System.out.println("Debe ingresar un número del 1 al 14 para saber si es primo: ");
                numero = prompt.nextInt();
            }
            else break;
        }
        
        switch(numero){
            case 2:
                System.out.println("El numero " + numero + " es primo");
                break;
            
            case 3:
                System.out.println("El numero " + numero + " es primo");
                break;

            case 5:
                System.out.println("El numero " + numero + " es primo");
                break;

            case 7:
                System.out.println("El numero " + numero + " es primo");
                break;

            case 11:
                System.out.println("El numero " + numero + " es primo");
                break;
            case 13:
                System.out.println("El numero " + numero + " es primo");
                break;
            default:
                System.out.println("El numero " + numero + " no es primo");
        }

    }
    
}
