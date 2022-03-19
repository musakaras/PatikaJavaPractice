package PatikaJava;

import java.util.*;

public class MineSweeper {

    int row;
    int col;
    int totalMineCount;
    String[][] mine = new String[row][col];
    String[][] map = new String[row][col];


    String diff   = "* ";
    String normal = "- ";


    /* Constructor*/
    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new String[row][col];
        this.mine = new String[row][col];
        this.totalMineCount = (this.row * this.col) / 4;
    }



    /* map ve mine stringlerinin başlangıç halini oluşturuyoruz */
    public void initiliaze() {

        for (int i = 0; i < mine.length; i++) {
            for (int j = 0; j < mine[0].length; j++) {
                mine[i][j] = "- ";
                map[i][j] = "- ";
            }
        }
    }



    /* parametre olarak gelen 2  boyutlu array print ediliyor */
    public void print(String[][] prints) {
        System.out.println("================================");
        for (int i = 0; i < prints.length; i++) {
            for (int j = 0; j < prints[0].length; j++) {
                System.out.print(prints[i][j]);
                if (prints[0].length - 1 == j)
                    System.out.println();
            }
        }
    }



    /* mayınlar için rastgele koordinat oluşturup map stringine yerleştiriliyor. */
    public void createRand() {
        Random random = new Random();
        int randRow;
        int randCol;
        int temp = totalMineCount;

        while (temp > 0) {
            randRow = (int) (Math.random() * (row));
            randCol = (int) (Math.random() * (col));
            map[randRow][randCol] = "* ";
            temp--;
        }
    }




    /* kullanıcının girdiği koordinatın çevresindeki hücrelerin mayın sayısını bulu return eder. */
    public int calculateMines(int satir, int sutun) {
        int minSatir = satir - 1;
        int minSutun = sutun - 1;
        int maxSatir = satir + 1;
        int maxSutun = sutun + 1;


        int counter = 0;

        if (satir == 0)
            minSatir = 0;
        if (satir == this.row-1)
            maxSatir = this.row-1;

        if (sutun == 0)
            minSutun = 0;
        if (sutun == this.col-1)
            maxSutun = this.col-1;


        for (int i = minSatir; i <= maxSatir; i++) {
            for (int j = minSutun; j <= maxSutun; j++) {
                if (map[i][j].equals(diff)) {
                    counter++;
                }
            }
        }

        return counter;
    }






    /* kullanıcının girdiği koordinatta mayın olup olmadığı kontrolü sonucunu return eder*/
    public boolean isFail(int satir, int sutun) {
        if (map[satir][sutun].equals(diff))
            return true;
        else
            return false;
    }






    /* mayın olmayan tüm koordinatlar seçilip seçilmediğinin sonucunu return eder */
    public boolean isWin() {
        int target=(this.row*this.col)-totalMineCount;
        int counter=0;

        for (int i = 0; i < mine.length; i++) {
            for (int j = 0; j < mine[0].length; j++) {
                if(  (! mine[i][j].equals(normal) )  &&  (! mine[i][j].equals(diff) ) )
                    counter++;
            }
        }
        if(counter==target)
            return true;
        else
            return false;

    }




    /* Driver fonksiyondur.Yardımcı fonksiyonları çağırıp oyunun oynandığı yerdir. */
    public void run() {
        Scanner scan = new Scanner(System.in);

        int selectedRow;
        int selectedCol;
        int cellMinecount;
        initiliaze();
        createRand();

        //print(map);

        while (true) {

            print(mine);
            System.out.println("Satır Giriniz : ");
            selectedRow = scan.nextInt();
            System.out.println("Sütun Giriniz : ");
            selectedCol = scan.nextInt();

            while(selectedCol<0 || selectedCol >= this.col || selectedRow<0  || selectedRow >= this.row){
                System.out.println("MAYIN TARLASI SINIRLARI DIŞINDA SAYI GİRDİNİZ.LUTFEN TEKRAR SAYI GİRİN !");
                print(mine);
                System.out.println("Satır Giriniz : ");
                selectedRow = scan.nextInt();
                System.out.println("Sütun Giriniz : ");
                selectedCol = scan.nextInt();
            }

            if ( isFail(selectedRow, selectedCol) ){
                System.out.println("GAME OVER");
                print(map);
                break;
            }

            cellMinecount = calculateMines(selectedRow, selectedCol);
            mine[selectedRow][selectedCol] = +cellMinecount + " ";

            if( isWin()){
                System.out.println("TEBRİKLER OYUNU KAZANDINIZ!");
                print(mine);
                break;
            }
        }
    }

}