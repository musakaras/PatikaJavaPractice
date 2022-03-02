package PatikaJava;



import java.util.Scanner;

public class CiftVeDordunKati  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number; int sum=0;
        do {
            System.out.println("Sayı giriniz: ");
            number = scanner.nextInt();

            if (number%4==0) {
                sum+=number;
            }

        } while (number % 2 == 0);
        System.out.println("Toplam: "+sum);
    }
}
