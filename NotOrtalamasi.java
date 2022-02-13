package PatikaJava;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String args[]) {
        System.out.println("Please enter the grades" );

        Scanner scanner= new Scanner(System.in);

        int mat=0,fiz=0,kimya=0,tarih=0,turkce=0,muzik=0;

        System.out.println("Please enter the mat:" );
        mat=scanner.nextInt();
        System.out.println("Please enter the fiz:" );
        fiz=scanner.nextInt();
        System.out.println("Please enter the kimya:" );
        kimya=scanner.nextInt();
        System.out.println("Please enter the tarih:" );
        tarih=scanner.nextInt();
        System.out.println("Please enter the turkçe:" );
        turkce=scanner.nextInt();
        System.out.println("Please enter the muzik:" );
        muzik=scanner.nextInt();

        int toplam=mat+fiz+kimya+tarih+turkce+muzik;
        int average=toplam/6;

        System.out.println("ortalama:"+average);

        if(average>60)
            System.out.println("sınfı geçti");
        else
            System.out.println("sınıfta kaldı");



    }
}
