package PatikaJava;

import java.util.*;
import java.io.*;
import java.util.Scanner;


public class DaireDilimiAlanı {
    public static void main(String args[]) {
        double r,aci,alan;
        double pi=3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen dairenin yarıçapını girin:" );
        r=scanner.nextInt();
        System.out.println("lutfen daire diliminin merkez ölçüsünü girin:" );
        aci=scanner.nextInt();

        alan=(pi * (r*r) * aci) / 360;



        System.out.println("daire dilimi alanı:"+alan );


    }

}
