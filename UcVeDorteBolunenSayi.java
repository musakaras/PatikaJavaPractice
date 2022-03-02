package PatikaJava;


import java.util.Scanner;

public class UcVeDorteBolunenSayi  {
    public static void main(String[] args) {

        int sum =0; int valueNumber=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        for (int i=0; i<number;i++) {
            if (i%3==0 && i%4==0) {
                System.out.println(i);
                sum +=i;
                valueNumber++;
            }

        }

        System.out.println("Toplam: "+sum);
        double avarege= sum / valueNumber;
        System.out.print("Avarage: "+avarege);

    }
}