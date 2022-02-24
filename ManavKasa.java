

package PatikaJava;

import java.util.*;
import java.io.*;
import java.util.Scanner;


public class ManavKasa {
    public static void main(String args[]) {
        int armut,elma,domates,muz,patlican;
        double toplam=0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? " );
        armut=scanner.nextInt();
        System.out.println("elma Kaç Kilo ? " );
        elma=scanner.nextInt();
        System.out.println("domates Kaç Kilo ? " );
        domates=scanner.nextInt();
        System.out.println("muz Kaç Kilo ? " );
        muz=scanner.nextInt();
        System.out.println("patlıcan Kaç Kilo ? " );
        patlican=scanner.nextInt();
        
        toplam= 2.14 * armut + 3.67*elma + 1.11* domates + 0.95 * muz + 5 * patlican;

        System.out.println("Toplam tutar:"+toplam +"TL" );


    }

}
