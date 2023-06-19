package example;

import java.util.Scanner;

public class MiClase {

    public static int numMayor(int a,int b, int c){
        /*Scanner sc;
        int a, b, c;
        sc = new Scanner(System.in);

        System.out.println("Ingrese el primero numero");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        c = sc.nextInt();*/
        if (a > b && a > c) {
            System.out.println("El numero mayor es A: " + a);
            return a;
        } else if (c > b) {
            System.out.println("El numero mayor es C: " + c);
            return c;
        } else {
            System.out.println("El numero mayor es B: " + b);
            return b;
        }
    }
    public static void main(String[] args) {

        numMayor(5,6,7);
    }


}
