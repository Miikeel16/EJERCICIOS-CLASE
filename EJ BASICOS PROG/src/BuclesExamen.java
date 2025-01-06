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

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma=0;
        int contimp=0;

        for (int cont=1; cont <= 10 ; cont++){

        System.out.println("Dame un numero");
        int num=sc.nextInt();
        

            if (num % 2 != 0) {
                if (num>max) {
                    max=num;
                }
                if (num<min) {
                    min=num;
                }
                contimp=contimp+1;
                suma=suma+num;
            }
            
            }
            if (contimp>0) {
                System.out.println("El impar mas alto es: " +max);
                System.out.println("El impar mas bajo es: " +min);
                System.out.println("Media impares: " +(double)suma/contimp);
            }else{
                System.out.println("No hay impares");
            }
            
    }

    private static void ejercicio2(Scanner sc) {
       
        // Escribe un programa que solicite al usuario ingresar la temperatura diaria de
        // una semana (7 días). El programa debe calcular la temperatura máxima, la
        // mínima y la temperatura media de la semana.

        System.out.println("Ejercicio 2");
        int cont=1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int suma=0;

        while (cont<=7) {
        System.out.println("Dame la temperatura del dia");
        int temp=sc.nextInt();
            suma=suma + temp;
            if (temp>max) {
                max=temp;
            }else if (temp<min) {
                min=temp;
            }

        cont=cont+1;
        }
        System.out.println("Max temperatura: "+max);
        System.out.println("Min temperatura: "+min);
        System.out.println("Media temperatura: "+(double)suma/cont);

        
        
    }
    private static void ejercicio3(Scanner sc) {
        
        // Escribe un programa que pida al usuario ingresar una serie de números
        // hasta que se ingrese un cero. El programa debe calcular la media de los
        // números ingresados y luego determinar cuál es el número máximo, el mínimo
        // y la diferencia entre los dos.

        System.out.println("Ejercicio 3");

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        System.out.println("Dame un numero, si escribes 0 termina");
        int num=sc.nextInt();

        while (num!=0) {
            if (num>max) {
                max=num;
            }else if (num<min) {
                min=num;
            }
            System.out.println("Dame un numero, si escribes 0 termina");
            num=sc.nextInt();
        }
        double diferencia=max-min;
            System.out.println("Max num: "+max);
        System.out.println("Min num: "+min);
        System.out.println("Diferencia: "+(double)diferencia);
    }
    private static void ejercicio4(Scanner sc) {
        
        // Escribe un programa que solicite las alturas (en cm) de un grupo de
        // estudiantes. El número de estudiantes no es conocido de antemano, pero el
        // ingreso se detiene cuando el usuario ingresa una altura negativa. El
        // programa debe calcular la altura máxima, mínima y la media de las alturas
        // ingresadas.


        System.out.println("Ejercicio 4");
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int suma=0;
        int cont=0;

        System.out.println("Dame una altura en cm, si es negativa termina");
        int alt=sc.nextInt();

        while (alt>0) {
            suma =suma+alt;
            if (alt>max) {
                max=alt;
            }
            if (alt<min) {
                min=alt;
            }
        System.out.println("Dame una altura en cm, si es negativa termina");
        alt=sc.nextInt();
            cont=cont+1;
        }
        
            System.out.println("Max altura: "+max);
            System.out.println("Min altura "+min);
            System.out.println("Media altura: "+(double)suma/cont);
    }
    private static void ejercicio5(Scanner sc) {
        
        // Escribe un programa que solicite al usuario ingresar las ventas mensuales de
        // una empresa durante un año (12 meses). El programa debe dividir las ventas
        // en 4 trimestres y calcular lo siguiente:
        //     ■ La venta máxima y mínima de cada trimestre.
        //     ■ La media de ventas por trimestre.
        //     ■ El trimestre con la mayor venta media.

        System.out.println("Ejercicio 5");
        
       int cont=1;
       int maxpri= Integer.MIN_VALUE;
       int minpri= Integer.MAX_VALUE;
       double medpri= 0;
       int sumapri=0;
       int maxsec= Integer.MIN_VALUE;
       int minsec= Integer.MAX_VALUE;
       double medsec= 0;
       int sumasec=0;
       int maxter= Integer.MIN_VALUE;
       int minter= Integer.MAX_VALUE;
       double medter= 0;
       int sumater=0;
       int maxcua= Integer.MIN_VALUE;
       int mincua= Integer.MAX_VALUE;
       double medcua= 0;
       int sumacua=0;

       while (cont<=12) {
        System.out.println("Dame la venta de los 12 meses");
        int venta=sc.nextInt();
        if (cont>=1 && cont<=3) {
            
            if (venta<minpri) {
                minpri=venta;
            }
            if (venta>maxpri) {
                maxpri=venta;
            }
            sumapri= sumapri+venta;
            medpri= sumapri/cont;
        }
        if (cont>=4 && cont<=6) {
            
            if (venta<minsec) {
                minsec=venta;
            }
            if (venta>maxsec) {
                maxsec=venta;
            }
            sumasec= sumasec+venta;
            medsec= sumasec/cont;
        }
        if (cont>=7 && cont<=9) {
        
            if (venta<minter) {
                minter=venta;
            }
            if (venta>maxter) {
                maxter=venta;
            }
            sumater= sumater+venta;
            medter= sumater/cont;
        }
        if (cont>=10 && cont<=12) {
            
            if (venta<mincua) {
                mincua=venta;
            }
            if (venta>maxcua) {
                maxcua=venta;
            }
            sumacua= sumacua+venta;
            medcua= sumacua/cont;
        }
        cont=cont+1;
       }
       System.out.println("Primer Trimestre: ");
       System.out.println("Max venta: "+maxpri+" Min venta: "+minpri+" Media ventas: "+(double)medpri);
       System.out.println("Segundo Trimestre: ");
       System.out.println("Max venta: "+maxsec+" Min venta: "+minsec+" Media ventas: "+(double)medsec);
       System.out.println("Tercer Trimestre: ");
       System.out.println("Max venta: "+maxter+" Min venta: "+minter+" Media ventas: "+(double)medter);
       System.out.println("Cuarto Trimestre: ");
       System.out.println("Max venta: "+maxcua+" Min venta: "+mincua+" Media ventas: "+(double)medcua);

       System.out.println("Trimestre con mayor venta media: ");
       if (medpri>medsec && medpri>medter && medpri>medcua) {
            System.out.println("Primer Trimestre: " +(double)medpri);
       }else if (medsec>medpri && medsec>medter && medsec>medcua) {
            System.out.println("Segundo Trimestre: " +(double)medsec);
       }else if (medter>medpri && medter>medsec && medter>medcua) {
            System.out.println("Tercer Trimestre: " +(double)medter);
       }else{
            System.out.println("Cuarto Trimestre: " +(double)medcua);
       }
}
}