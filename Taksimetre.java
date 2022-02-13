package PatikaJava;

import java.util.*;
import java.io.*;
import java.util.Scanner;


public class Taksimetre {
    public static void main(String args[]) {

        int km;
        double ucret;

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen kaç km gittiğinizi giriniz:" );
        km=scanner.nextInt();

        ucret=10+2.20*km;
        if(ucret<20)
            ucret=20;

        System.out.println("Ödenecek tutar:"+ucret );


    }
}
