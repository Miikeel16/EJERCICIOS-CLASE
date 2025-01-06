import java.util.Locale;
public class Condicionales3 {
    public static void main(String[] args) throws Exception {
        // Si no queréis que se ejecute un método (ejercicio) en concreto comentadlo usando la barra de comentar --> // 
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
    }

    // A partir de este punto empiezan los ejercicios, los nombres de cada método indican a que ejercicio pertenecen.
    // Dadle caña y no dudeis en preguntar vuestras dudas :)

    private static void ejercicio1(){
        /*
            Programa java que printee en pantalla todos los números del 0 al 100, ambos incluídos.
       */  
        System.out.println("Ejercicio número 1");

        // Vuestro código va aquí
        int a = 9;
        int b = 15;

        if (a > b){
            System.out.println("El numero " + a + " es mayor que el numero " + b);
        }else if (b > a){
            System.out.println("El numero " + b + " es mayor que el numero " + a);
        }else{
            System.out.println("El numero " + a + " y el numero " + b + " son iguales");
        }

        //Final del ejercicio
        System.out.println("Final del ejercicio número 1");

    }

    private static void ejercicio2(){
        /* 
            Programa java que printee en pantalla únicamente los números pares que vayan del 0 al 100, ambos incluídos. 
            Recordad que el 0 es un número par. 
        */

        System.out.println("Ejercicio número 2");

        // Vuestro código va aquí
        int a = 15;
        int b = 3;
        float divi = 0;

        if (b == 0){
            System.out.println("No se ha podido realizar la division porque el divisor es 0");
        }else{
            divi = a / b;
            System.out.println("El resultado de la division es " + divi);
        }


        //Final del ejercicio
        System.out.println("Final del ejercicio número 2");
    }

    private static void ejercicio3(){
        /*
            Programa java que declare dos variables con un valor entero. La función de este programa es ir sumándole a la primera variable a 
            la segunda hasta que el valor de esta primera pase de 100, una vez pase de ese valor printear el valor final en la pantalla.
        */

        System.out.println("Ejercicio número 3");

        // Vuestro código va aquí
        double a = 90;
        double b = 90;
        double c = 60;

        if (a == b && a != c || a == c && a != b || b == c && b != a){
            System.out.println("El triangulo es isoscele");
        }else if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2)){
            System.out.println("El triangulo es rectangulo");
        }else if( a == b && a == c){
            System.out.println("El triangulo es equilatero");
        }else if( a != b && a != c && b != c){
            System.out.println("El triangulo es escaleno");
        }


        //Final del ejercicio
        System.out.println("Final del ejercicio número 3");
    }

    private static void ejercicio4(){
        /*
            Programa java que declare dos variables enteras, la idea para este proyecto es multiplicar el valor de la primera variable 
            por el de la segunda pero sin usar la multiplicación. Por ejemplo, si queremos hacer la operación 2 * 3 no podemos hacerla tal cual, 
            deberíamos sumar 2 en 3 ocasiones, o sea, 2 + 2 + 2.
        */

        System.out.println("Ejercicio número 4");

        // Vuestro código va aquí
        int año = 1988;

        if (año % 4 == 0){
            System.out.println("Es un año bisiesto");
        }else{
            System.out.println("No es un año bisiesto");
        }

        //Final del ejercicio
        System.out.println("Final del ejercicio número 4");
    }

    //Cambiar a partir de aquí

    private static void ejercicio5(){
        /*
            Programa que declare dos variables enteras, la idea de este programita es que saque el resultado de la potencia de esos dos valores introducidos 
            aunque no se puede utilizar el operador de la potencia. (Es muy parecido al ejercicio anterior).
        */

        System.out.println("Ejercicio número 5");

        // Vuestro código va aquí

        int semana = 6;

        if (semana > 0 && semana < 8){
            switch (semana) {
                case 1:
                    System.out.println("Es Lunes");
                    break;
                case 2:
                    System.out.println("Es Martes");
                    break;
                case 3:
                    System.out.println("Es Miercoles");
                    break;
                case 4:
                    System.out.println("Es Jueves");
                    break;
                case 5:
                    System.out.println("Es Viernes");
                    break;
                case 6:
                    System.out.println("Es Sabado");
                    break;
                case 7:
                    System.out.println("Es Domingo");
                    break;
            }
        }else{
            System.out.println("Has introducido un numero diferente al esperado pruebe otra vez");
        }
        //Final del ejercicio
        System.out.println("Final del ejercicio número 5");
    }

    private static void ejercicio6(){
        /*
            Como último ejercicio, para rizar el rizo vais declarar dos variables enteras y mezclar tanto el ejercicio 4 como el 5, o sea, 
            tenéis que conseguir el resultado de la potencia entre dos números pero sin usar ni el operador de la potencia ni el de la multiplicación, véase, 
            a base de puras sumas y bucles. 
        */

        System.out.println("Ejercicio número 6");

        // Vuestro código va aquí
        int mes = 7;
        int dias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 8:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }
        System.out.println("El mes " + mes + " Tiene " + dias + " dias");

        //Final del ejercicio
        System.out.println("Final del ejercicio número 6");
    }
    private static void ejercicio7(){
        /*
            Como último ejercicio, para rizar el rizo vais declarar dos variables enteras y mezclar tanto el ejercicio 4 como el 5, o sea, 
            tenéis que conseguir el resultado de la potencia entre dos números pero sin usar ni el operador de la potencia ni el de la multiplicación, véase, 
            a base de puras sumas y bucles. 
        */

        System.out.println("Ejercicio número 7");

        int num1 = 1690;
        int num2 = 2140;
        int num3 = 2120;

        if (num1 > num2 && num2 > num3){
            System.out.println(num1 + ", " + num2 + ", " + num3);
        }else if (num1 > num3 && num3 > num2){
            System.out.println(num1 + ", " + num3 + ", " + num2);
        }else if (num2 > num1 && num1 > num3){
            System.out.println(num2 + ", " + num1 + ", " + num3);
        }else if (num2 > num3 && num3 > num1){
            System.out.println(num2 + ", " + num3 + ", " + num1);
        }else if (num3 > num1 && num1 > num2){
            System.out.println(num3 + ", " + num1 + ", " + num2);
        }else{
            System.out.println(num3 + ", " + num2 + ", " + num1);
        }

        System.out.println("Final del ejercicio número 7");
    }
    private static void ejercicio8(){
        /*
            Como último ejercicio, para rizar el rizo vais declarar dos variables enteras y mezclar tanto el ejercicio 4 como el 5, o sea, 
            tenéis que conseguir el resultado de la potencia entre dos números pero sin usar ni el operador de la potencia ni el de la multiplicación, véase, 
            a base de puras sumas y bucles. 
       */

        System.out.println("Ejercicio número 8");

        // Vuestro código va aquí
        int num = 7;
        int tabla = 0;

        if (num >= 0 && num <= 10){
            tabla = num * 9;
            System.out.println(tabla);
        }else{
            System.out.println("Has introducido un numero incorrecto");
        }
        //Final del ejercicio
        System.out.println("Final del ejercicio número 8");
    }
    private static void ejercicio9(){
        /*
            Como último ejercicio, para rizar el rizo vais declarar dos variables enteras y mezclar tanto el ejercicio 4 como el 5, o sea, 
            tenéis que conseguir el resultado de la potencia entre dos números pero sin usar ni el operador de la potencia ni el de la multiplicación, véase, 
            a base de puras sumas y bucles. 
        */

        System.out.println("Ejercicio número 9");

        // Vuestro código va aquí
        double nota1 = 4;
        double nota2 = 3.5;
        double nota3 = 6;
        double nota4 = 8.5;
        double media = 0;

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("La media de estas 4 notas es: " + media);
        if (media >= 5) {
            System.out.println("APROBADO");
        }else{
            System.out.println("NO APROBADO");
        }


        //Final del ejercicio
        System.out.println("Final del ejercicio número 9");
    }
}