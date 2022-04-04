import java.util.Scanner;
public class Capicua {
    public static void main(String[] args){
        String num;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es capicua: ");
        num = prompt.next();
        char chArray[] = num.toCharArray();
        String inverso = "";
        for(int i = chArray.length - 1; i >= 0; i--) inverso += chArray[i];
        if(num.equals(inverso)) System.out.println("El número es capicua.");
        else System.out.println("El número no es capicua.");
    }
}
