 //Un Zoólogo pretende determinar cuántos animales hay en las categorías de edades: menos de 5 años, y de 5 o más años. El zoológico todavía no está seguro del animal que va a estudiar. Si se decide por elefantes solo tomará una muestra de 5 de ellos; si se decide por jirafas, tomará 7 muestras y si son chimpancés tomará 8.

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        String animal = null;
        int cant_muestras;
        int edad = 0;
        int mayores = 0;
        int menores = 0;

        System.out.print("Ingrese el animal a escoger: ");
        animal = lectura.nextLine();

        System.out.println("\n RECUERDE QUE: \n Solo tomara muestra de 5 elefantes \n Solo tomara muestra de 7 jirafas \n solo tomara muestra de 8 chimpancés \n");

        System.out.print("Confirme el numero de muestras del animal " + animal + ": ");
        cant_muestras = lectura.nextInt();

        for (int i = 1; i < cant_muestras + 1; i++) {
            System.out.print("Ingrese la edad del " + animal + " " + i + ": ");
            edad = lectura.nextInt();

            if (edad < 5) {
                menores++;
            } else {
                mayores++;
            }
        
        }

        System.out.println("Hay " + menores + " " + animal + " menores a 5 años");
        System.out.println("Hay " + mayores + " " + animal + " mayores a 5 años");

        lectura.close();

    }
}