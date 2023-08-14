//En una fábrica de computadoras se planea ofrecer a los clientes un descuento que dependerá del número de computadoras que compren. Si las computadoras son menos de cinco se les dará un 10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual a cinco pero menos de diez se les otorga un 20% de descuento; y si son diez o más se les da un 40%. El precio de cada computadora es de $1.000.000

import java.util.Scanner;

public class ejercicio_1 {
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
