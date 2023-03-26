import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double celsius;
        double fara;
       Scanner scanner = new Scanner(System.in);
       int choice;
       do {
           System.out.println("menu");
           System.out.println("1. c to f");
           System.out.println("2.f to c");
           System.out.println("0. exit");
           System.out.println("chon chuong trinh");
           choice = scanner.nextInt();
           switch (choice){
               case 1:
                   System.out.println("nhap do c");
                   celsius = scanner.nextDouble();
                   System.out.println(" do F la; " + cToF(celsius));
                    break;
               case 2:
                   System.out.println("nhap do F");
                   fara = scanner.nextDouble();
                   System.out.println(" do C la: "+ fToC(fara));
                   break;
               case 0:
                   System.exit(0);
           }
       }while ( choice!= 0 );

    }
    public static double cToF(double celsius){
        double fara = (9.0 / 5) * celsius + 32;
        return fara;
    }
    public static double fToC( double fara){
        double celsius = (5.0 / 9) * (fara - 32);
        return celsius;
    }
}