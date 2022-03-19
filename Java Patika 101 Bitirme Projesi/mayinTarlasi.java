package PatikaJava;

import java.util.*;

public class mayinTarlasi {

    public static void main(String[] args) {
        System.out.println("MAYIN TARLASI OYUNUNA HOŞGELDİNİZ !");
        Scanner scan = new Scanner(System.in);


        System.out.println("Mayın tarlası için Satır Giriniz : ");
        int row = scan.nextInt();
        System.out.println("Mayın tarlası için Sütun Giriniz : ");
        int col = scan.nextInt();

        MineSweeper mine=new MineSweeper(row,col);
        mine.run();
    }
}
