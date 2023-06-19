package example;

import java.util.Scanner;

public class MiClase {
    public static void main(String[] args) {
        Scanner sc;
        int a,b,c;
        sc=new Scanner(System.in);

        System.out.println("Ingrese el primero numero");
            a=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
            b=sc.nextInt();
        System.out.println("Ingrese el tercer numero");
            c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("El numero mayor es: "+a);
        }else if(c>b){
            System.out.println("El numero mayor es: "+c);
        }else {
            System.out.println("El numero mayor es: "+b);
        }


    }


}
