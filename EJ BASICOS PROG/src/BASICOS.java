import java.util.Scanner;
import java.util.Locale;

public class BASICOS {
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
        System.out.println("Ejercicio numero 1:");

        System.out.print("Introduce un numero entero: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce un numero con comas: ");
        double numero2 = sc.nextDouble();

        System.out.println("Los numeros que has introducido son: " + numero1 + " y " + numero2);

        System.out.println("Fin ejercicio numero 1");
    }

    private static void ejercicio2(Scanner sc) {
        System.out.println("Ejercicio numero 2");

        System.out.println("Introduce el radio del circulo y te calcularé su área:");
        double radio = sc.nextDouble();

        double area = Math.PI * (radio * radio); 
        System.out.println("El área del círculo es: " + area);

        System.out.println("Fin ejercicio numero 2");
    }

    private static void ejercicio3(Scanner sc) {
        System.out.println("Ejercicio numero 3");

        System.out.println("Para calcuar las raices de un polinomio necesito que me des su a, b y c");
        System.out.println("Primero dame su a: ");
        int a = sc.nextInt();
        System.out.println("A continuación dame su b: ");
        int b = sc.nextInt();
        System.out.println("Por ultimo dame su c: ");
        int c = sc.nextInt();

        double raiz1 = (-b + Math.sqrt((b * b) -4 * a * c)) / (2 * a);
        double raiz2 = (-b + Math.sqrt((b * b) -4 * a * c)) / (2 * a);

        System.out.println("Las raices de este polinomio son: " + raiz1 + " y " + raiz2 );

        System.out.println("Fin ejercicio numero 3");
    }

    private static void ejercicio4(Scanner sc) {
        System.out.println("Ejercicio numero 4");

        System.out.println("Dime tu nombre por favor :");
        String nombre = sc.next();
        System.out.println("Ahora dame tu edad por favor :");
        int edad = sc.nextInt();
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");


        System.out.println("Fin ejercicio numero 4");
    }

    private static void ejercicio5(Scanner sc) {
        System.out.println("Ejercicio numero 5");

        int cont2 = 0;
        int cont1 = 0;
        int cont50 = 0;
        int cont20 = 0;
        int cont10 = 0;
        int cont05 = 0;
        int cont02 = 0;
        int cont01 = 0;

        System.out.println("Dame tu dinero en monedas :");
        int dinero = sc.nextInt();

        cont2 = dinero / 200;
        dinero = dinero % 200;
        cont1 = dinero / 100;
        dinero = dinero % 100;
        cont50 = dinero / 50;
        dinero = dinero % 50;
        cont20 = dinero / 20;
        dinero = dinero % 20;
        cont10 = dinero / 10;
        dinero = dinero % 10;
        cont05 = dinero / 5;
        dinero = dinero % 5;
        cont02 = dinero / 2;
        dinero = dinero % 2;
        cont01 = dinero / 1;
        dinero = dinero % 1;

        System.out.println("Tienes de vuelta " + cont2 + " monedas de 2 euros, " + cont1 + " de 1 euro, " + cont50 + " monedas de 50 centimos, " + cont20 + " monedas de 20 centimos, " + cont10 + " monedas de 10 centimos, " + cont05 + " monedas de 5 centimos, " + cont02 + " monedas de 2 centimos y por ultimo " + cont01 + " monedas de 1 centimo.");

        System.out.println("Fin ejercicio numero 5");
    }
}