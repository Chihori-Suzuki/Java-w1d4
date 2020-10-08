// package week1.day4;

public class MultiTable {

    public static void main(String[] args) {
        System.out.println("     1  2  3  4  5  6  7  8  9");
        System.out.println("-------------------------------");

        for(int colm = 1; colm < 10; colm++){
            int num = 0;
            String strRow = "";
            for(int row = 1; row < 10; row++){
                num = colm * row;
                // strRow = Integer.toString(num);
                strRow = strRow + "  " + num;
            }
            System.out.print(colm + " |");
            System.out.println(strRow);
        }
    }

}