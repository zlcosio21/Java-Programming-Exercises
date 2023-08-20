import java.util.Scanner;

public class ejercicio_1_condicionales {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int num_computadoras;
        float descuento = 0;
        float total;

        System.out.print("Ingrese el numero de computadoras a comprar: ");
        num_computadoras = lectura.nextInt();

        if (num_computadoras < 5) {
            descuento = 0.9f;
        } else if (num_computadoras >= 5 && num_computadoras < 10) {
            descuento = 0.8f;
        } else if (num_computadoras > 10) {
            descuento = 0.6f;
        }

        total = 1000000 * num_computadoras * descuento;
        lectura.close();

        System.out.println("El total de la compra es: " + total);

    }
}
