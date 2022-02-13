package PatikaJava;
import java.util.*;
import java.io.*;
import java.util.Scanner;


public class KDV {
    public static void main(String args[]) {


        Scanner scanner= new Scanner(System.in);
        double kdv,anapara,guncel;

        System.out.println("Lutfen yatırılacak parayı giriniz:" );
        anapara=scanner.nextInt();

        if(anapara<0)
            System.out.println("Error!! Para değeri negatif olamaz." );
        if(anapara<1000){
            kdv=anapara * 0.18;
            guncel=anapara+kdv;
            System.out.println("KDVsiz fiyat:"+anapara );
            System.out.println("KDV:"+kdv );
            System.out.println("KDVli fiyat:"+guncel );
        }
        else{
                kdv=anapara*0.08;
                guncel=anapara+kdv;
                System.out.println("KDVsiz fiyat:"+anapara );
                System.out.println("KDV:"+kdv );
                System.out.println("KDVli fiyat:"+guncel );

        }



    }

}
