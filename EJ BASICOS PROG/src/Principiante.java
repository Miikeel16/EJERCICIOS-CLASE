import java.util.Scanner;
import java.util.Locale;

public class Principiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("US"));

        ejercicio1(sc);
        ejercicio2(sc);
        ejercicio3(sc);
        ejercicio4(sc);

        sc.close();
    }

    private static void ejercicio1(Scanner sc) {
        System.out.println("Dame el valor de la variable A: ");
        int A=sc.nextInt();

        System.out.println("Dame el valor de la variable B: ");
        int B=sc.nextInt();

        if(A==B){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");

        }
    }
    private static void ejercicio2(Scanner sc) {
        System.out.println("Dame una letra: ");
        char letra = sc.next().charAt(0);
    
      
        letra = Character.toLowerCase(letra);
    
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("No es una vocal.");
        }
    }
    private static void ejercicio3(Scanner sc) {
        System.out.println("Dame un numero: ");
        int x=sc.nextInt();

        System.out.println("Dame otro numero: ");
        int y=sc.nextInt();

        if (x>y) {
            System.out.println("La diferencia positiva es: "+Integer.toString(x-y));
        }else{
            System.out.println("La diferencia positiva es: "+Integer.toString(y-x));
        }
    }
    private static void ejercicio4(Scanner sc) {
        System.out.println("Dame el valor de la variable A: ");
        int A=sc.nextInt();

        System.out.println("Dame el valor de la variable B: ");
        int B=sc.nextInt();

        System.out.println("Dame el valor de la variable C: ");
        int C=sc.nextInt();

        if (A>B) {
            if (A>C) {
                System.out.println("La mayor es A");
            }
        }else if (B>C){
                System.out.println("La mayor es B");
        }else{
             System.out.println("La mayor es C: ");

        }
    }
}
   
    