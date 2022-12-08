import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int as, es, ds, ms, ps;
        double  armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, tutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kac kilo ? : ");
        as = inp.nextInt();

        System.out.print("Elma kac kilo ? : ");
        es = inp.nextInt();

        System.out.print("Domates kac kilo ? : ");
        ds = inp.nextInt();

        System.out.print("Muz kac kilo ? : ");
        ms = inp.nextInt();

        System.out.print("Patlican kac kilo ? : ");
        ps = inp.nextInt();

        tutar = (as * armut) + (es * elma) + (ds * domates) + (ms * muz) + (ps * patlican);

        System.out.print("Toplam Tutar = " + tutar + "TL");
    }
}