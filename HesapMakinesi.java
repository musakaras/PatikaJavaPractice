package PatikaJava;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE CALCULATOR\n");
        System.out.println("Please write two number");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        System.out.println("The numbers are:" + n1 + "," + n2);
        System.out.println("write 1 for addition(+) ");
        System.out.println("write 2 for substraction(-) ");
        System.out.println("write 3 for multiplication(x)");
        System.out.println("write 4 for division(/)");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
                break;
            case 2:
                System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
                break;
            case 3:
                System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
                } else
                    System.out.println("Number cannot be divided by zero");
                break;
            default:
                System.out.println("WRONG SELECT");
        }


    }
}
