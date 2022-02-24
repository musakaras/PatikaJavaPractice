

package PatikaJava;

        import java.util.*;
        import java.io.*;
        import java.util.Scanner;


public class VucutKitleIndeks {
    public static void main(String args[]) {
        double boy,indeks;
        int kilo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen boyunuzu(metre olarak) giriniz:" );
        boy=scanner.nextDouble();
        System.out.println("lutfen kilonuzu  girin:" );
        kilo=scanner.nextInt();

        indeks=kilo/(boy*boy);



        System.out.println("vücut kitle indeksiniz:"+indeks );


    }

}