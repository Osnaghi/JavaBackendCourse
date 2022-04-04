import java.util.Scanner;
import java.lang.Math;
public class IMC {
    public static void main(String[] args){
        float altura, peso, imc;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Ingrese su altura: ");
        altura = prompt.nextFloat();
        System.out.println("Ingrese su peso: ");
        peso = prompt.nextFloat();
        imc = peso/((int)Math.pow(altura, 2));
        System.out.println("Su índice de masa corporal es de: " + imc);
        System.out.println("Su diagnóstico es: ");
        if( imc < 20) System.out.println("Mal estado");
        else if(imc >= 20 && imc <= 22) System.out.println("Bajo de peso");
        else if(imc > 22 && imc <= 25) System.out.println("Peso normal");
        else if(imc > 25 && imc <= 30) System.out.println("Sobrepeso");
        else if(imc > 30 && imc <= 40) System.out.println("Sobrepeso crónico");
        else if(imc > 40) System.out.println("Hospitalizado");

    }
}