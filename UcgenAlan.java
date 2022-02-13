package PatikaJava;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class UcgenAlan {
    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        int a,b,c,cevre=0,u;
        double alan;

        System.out.println("Lutfen ucegenin kenarlarını giriniz:" );
        System.out.println("1.kenar:" );
        a=scanner.nextInt();
        System.out.println("2.kenar:" );
        b=scanner.nextInt();
        System.out.println("3.kenar:" );
        c=scanner.nextInt();

        u=(a + b + c)/2;
        double temp=u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(temp);

        System.out.println("Ucgenin alanı:"+alan );


    }
}
