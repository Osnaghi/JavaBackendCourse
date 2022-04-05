public class Minusculas {
    public static void main(String[] args) {
        for(char letra = 'a'; letra <= 'z'; letra++) {
			if (letra != 'z') System.out.print(letra + ", ");
            else System.out.print(letra);
		}
        System.out.println();
        
    }
}
