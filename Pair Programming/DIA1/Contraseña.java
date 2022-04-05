//Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera. Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones, recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario presione una tecla, luego de esto se cerrará el programa.
import java.util.Scanner;
public class Contraseña {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su contraseña: ");
        String contraseña1 = scan.next();
        boolean flag = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su contraseña nuevamente: ");
            String contraseña2 = scan.next();
            if (contraseña1.equals(contraseña2)) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Felicitaciones, recordás tu contraseña");
        else System.out.println("Tenes que ejercitar la memoria");
    }
}
