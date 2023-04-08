import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args) {
        int a;
        System.out.println("mời người dùng nhập số");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a <= 10) {
            switch (a) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    System.out.println(" Không xác định");
                    break;
            }
        }

        if (a > 10 && a < 20) {
            switch (a) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("Không xác định");
                    break;

            }
        }
        if (a >= 20 && a < 100) {
            int chuc, vi;
            String tenchuc = null, tenvi = null;
            chuc = (a % 100) / 10;
            vi = (a % 100) % 10;
            switch (chuc) {
                case 2:
                    tenchuc = "Twenty";
                    break;
                case 3:
                    tenchuc = "Threety";
                    break;
                case 4:
                    tenchuc = "Fourty";
                    break;
                case 5:
                    tenchuc = "Fivety";
                    break;
                case 6:
                    tenchuc = "Sixty";
                    break;
                case 7:
                    tenchuc = "Seventy";
                    break;
                case 8:
                    tenchuc = "eighty";
                    break;
                case 9:
                    tenchuc = "Ninety";
                    break;

            }
            switch (vi) {
                case 1:
                    tenvi = "One";
                    break;
                case 2:
                    tenvi = "Two";
                    break;
                case 3:
                    tenvi = "Three";
                    break;
                case 4:
                    tenvi = "Four";
                    break;
                case 5:
                    tenvi = "Five";
                    break;
                case 6:
                    tenvi = "Six";
                    break;
                case 7:
                    tenvi = "Seven";
                    break;
                case 8:
                    tenvi = "eight";
                    break;
                case 9:
                    tenvi = "Nine";
                    break;
            }
            System.out.println(tenchuc + "-" + tenvi);
        }
        if (a > 100) {
            int tram, chuc, vi;
            String tenchuc = null, tenvi = null, tentram = null;
            tram = a / 100;
            chuc = (a % 100) / 10;
            vi = (a % 100) % 10;
            switch (chuc) {
                case 1:
                    tenchuc = "eleven";
                    break;
                case 2:
                    tenchuc = "Twenty";
                    break;
                case 3:
                    tenchuc = "Threety";
                    break;
                case 4:
                    tenchuc = "Fourty";
                    break;
                case 5:
                    tenchuc = "Fivety";
                    break;
                case 6:
                    tenchuc = "Sixty";
                    break;
                case 7:
                    tenchuc = "Seventy";
                    break;
                case 8:
                    tenchuc = "eighty";
                    break;
                case 9:
                    tenchuc = "Ninety";
                    break;
            }
            switch (tram) {

                case 1:
                    tentram = "one hundered ";
                    break;
                case 2:
                    tentram = "Two hundered  ";
                    break;
                case 3:
                    tentram = "Three hundered ";
                    break;
                case 4:
                    tentram = "Four hundered ";
                    break;
                case 5:
                    tentram = "Five hundered ";
                    break;
                case 6:
                    tentram = "Six hundered ";
                    break;
                case 7:
                    tentram = "Seven hundered ";
                    break;
                case 8:
                    tentram = "eigh hundered ";
                    break;
                case 9:
                    tentram = "Nine hundered ";
                    break;

            }
            switch (vi) {
                case 1:
                    tenvi = "One";
                    break;
                case 2:
                    tenvi = "Two";
                    break;
                case 3:
                    tenvi = "Three";
                    break;
                case 4:
                    tenvi = "Four";
                    break;
                case 5:
                    tenvi = "Five";
                    break;
                case 6:
                    tenvi = "Six";
                    break;
                case 7:
                    tenvi = "Seven";
                    break;
                case 8:
                    tenvi = "eight";
                    break;
                case 9:
                    tenvi = "Nine";
                    break;
            }
            System.out.println(tentram + tenchuc + "-" + tenvi);
        }

    }
}