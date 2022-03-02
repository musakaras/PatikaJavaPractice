package PatikaJava;

import java.io.*;
import java.util.*;
import java.util.Scanner;


/*
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
        Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
        İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
        Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
        Toplam Tutar = (135-27)* 2 = 216 TL


        Mesafeyi km türünden giriniz : 1500
        Yaşınızı giriniz : 20
        Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

        Toplam Tutar = 216 TL

*/
public class UcakBileti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int km, yas, yolculuktipi;
        double ucret = 0.0;
        System.out.println("Mesafeyi km türünden giriniz : ");
        km=scn.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        yas=scn.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculuktipi=scn.nextInt();

        if(km<=0 || yas<=0 || !(yolculuktipi==1 || yolculuktipi==2)  )
            System.out.println("Hatalı Veri Girdiniz ! ");

        else {

            double normalucret = km * 0.10;

            if (yas < 12)
                ucret = normalucret * 0.50;
            else if (yas >= 12 && yas <= 24)
                ucret = normalucret * 0.90;
            else if (yas > 65)
                ucret = normalucret * 0.70;


            if (yolculuktipi == 2)
                ucret = normalucret * 0.80;

            if(ucret==0.0)
                System.out.println("Toplam tutar : "+ normalucret +"TL");
            else
                System.out.println("Toplam tutar : "+ ucret +"TL");
        }



    }
}
