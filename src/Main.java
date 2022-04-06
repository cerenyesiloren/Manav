import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, total;
        double kgArmut =2.14, kgElma=3.67, kgDomates=1.11, kgMuz=0.95, kgPatlican=5 ;

        Scanner read = new Scanner(System.in);
        System.out.println("Armut kaç kilo ?");
        armut=read.nextDouble();

        System.out.println("Elma kaç kilo ?");
        elma = read.nextDouble();

        System.out.println("Domates kaç kilo ?");
        domates = read.nextDouble();

        System.out.println("Muz kaç kilo ?");
        muz= read.nextDouble();

        System.out.println("Patlıcan kaç kilo ?");
        patlican = read.nextDouble();

        total = (armut*kgArmut) + (elma*kgElma) + (domates*kgDomates) + (muz*kgMuz) + (patlican*kgPatlican);

        System.out.println("Toplam Tutar : " + total + "TL");

    }
}
