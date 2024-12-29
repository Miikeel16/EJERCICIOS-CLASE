import java.util.Locale;
import java.util.Scanner;

public class BuclesExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("US"));

        ejercicio1(sc);
        ejercicio2(sc);
        ejercicio3(sc);
        ejercicio4(sc);
        ejercicio5(sc);

        sc.close();
    } 
    private static void ejercicio1(Scanner sc) {
        // Escribe un programa que solicite al usuario una lista de 10 números enteros.
        // Luego, el programa debe calcular el número impar más alto, el número impar
        // más bajo y la media de los números impares.
        System.out.println("Ejercicio 1");

        int max=-999999999;
        int min=999999999;
        for (int cont=0; cont <= 10 ; cont++){

        System.out.println("Dame un numero");
        int num=sc.nextInt();

            if (num % 2 != 0) {
                if (num>=max) {
                    max=num;
                }
                if (num<=min) {
                    min=num;
                }
            }
    }
    }
    private static void ejercicio2(Scanner sc) {
       
        // Escribe un programa que solicite al usuario ingresar la temperatura diaria de
        // una semana (7 días). El programa debe calcular la temperatura máxima, la
        // mínima y la temperatura media de la semana.

        System.out.println("Ejercicio 2");
        
    }
    private static void ejercicio3(Scanner sc) {
        
        // Escribe un programa que pida al usuario ingresar una serie de números
        // hasta que se ingrese un cero. El programa debe calcular la media de los
        // números ingresados y luego determinar cuál es el número máximo, el mínimo
        // y la diferencia entre los dos.


        System.out.println("Ejercicio 3");
        
    }
    private static void ejercicio4(Scanner sc) {
        
        // Escribe un programa que solicite las alturas (en cm) de un grupo de
        // estudiantes. El número de estudiantes no es conocido de antemano, pero el
        // ingreso se detiene cuando el usuario ingresa una altura negativa. El
        // programa debe calcular la altura máxima, mínima y la media de las alturas
        // ingresadas.


        System.out.println("Ejercicio 4");
        
    }
    private static void ejercicio5(Scanner sc) {
        
        // Escribe un programa que solicite al usuario ingresar las ventas mensuales de
        // una empresa durante un año (12 meses). El programa debe dividir las ventas
        // en 4 trimestres y calcular lo siguiente:
        //     ■ La venta máxima y mínima de cada trimestre.
        //     ■ La media de ventas por trimestre.
        //     ■ El trimestre con la mayor venta media.

        System.out.println("Ejercicio 5");
        
    }
}
