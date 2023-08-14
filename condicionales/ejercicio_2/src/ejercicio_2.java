//#Un proveedor de estéreos ofrece un descuento del 10% sobre el precio sin IVA de algún aparato si este cuesta $200.000 o más. Además, independientemente de esto, ofrece un 5% de descuento si la marca es NOSY. Determinar cuánto pagará, con IVA incluído, un cliente cualquiera por la compra de su estéreo. El IVA es del 16%.

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double descuento = 1;
        double iva = 1.16;
        int precio = 0;
        double total = 0;
        String marca = null;

        System.out.print("Digite la marca del estereo: ");
        marca = lectura.nextLine();

        System.out.print("Digite del precio el estereo: ");
        precio = lectura.nextInt();

        if (marca.equals("NOSY") && precio >= 200000) {
            descuento = 0.85f;
        } else if (marca.equals("NOSY")) {
            descuento = 0.95f;
        } else if (precio >= 200000) {
            descuento = 0.90f;
        } else if (precio < 200000) {
            descuento = 1;
        }

        total = descuento * precio * iva;

        System.out.println("El total de la compra del estereo es: " + Math.ceil(total));
        lectura.close();

    }
}
