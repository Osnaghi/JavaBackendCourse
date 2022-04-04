
// Recibe la medida de los lados y devuelve que tipo de triangulo es Escaleno, Isoceles o Equilatero

public class Triangulo {

    private float lado1;
    private float lado2;
    private float lado3;

    // Constructor
    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Get
    public void getTipo() {
        if (lado1 == lado2 && lado2 == lado3) System.out.println("El triangulo es equilatero");
        else if (lado1 != lado2 && lado2 != lado3) System.out.println("El triangulo es escaleno");
        else System.out.println("El triangulo es isóceles");
    }


}
