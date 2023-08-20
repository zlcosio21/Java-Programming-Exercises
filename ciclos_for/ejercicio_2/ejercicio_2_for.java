import java.util.Scanner;

public class ejercicio_2_for {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int cant_hombres = 0;
        int cant_mujeres = 0;
        int edad_hombres = 0;
        int edad_mujeres = 0;
        int sum_edad_hombres = 0;
        int sum_edad_mujeres = 0;
        int promedio_grupo = 0;
        float promedio_hombres = 0;
        float promedio_mujeres = 0;

        System.out.print("Ingrese la cantidad de hombres en el grupo: ");
        cant_hombres = lectura.nextInt();

        System.out.print("Ingrese la cantidad de mujeres en el grupo: ");
        cant_mujeres = lectura.nextInt();

        for (int h = 1; h < cant_hombres + 1; h++) {
            System.out.print("Ingrese la edad del hombre " + h + ": ");
            edad_hombres = lectura.nextInt();
            sum_edad_hombres += edad_hombres;
        }

        for (int m = 1; m < cant_mujeres + 1; m++) {
            System.out.print("Ingrese la edad de la mujer " + m + ": ");
            edad_mujeres = lectura.nextInt();
            sum_edad_mujeres += edad_mujeres;
        }

        promedio_grupo = (sum_edad_hombres + sum_edad_mujeres) / (cant_hombres + cant_mujeres);
        promedio_hombres = sum_edad_hombres / cant_hombres;
        promedio_mujeres = sum_edad_mujeres / cant_mujeres;
        
        System.out.println("El promedio del grupo de alumnos es de " + promedio_grupo);
        System.out.println("El promedio de las hombres es de " + promedio_hombres);
        System.out.println("El promedio de los mujeres es de " + promedio_mujeres);

        lectura.close();
        
    }
}