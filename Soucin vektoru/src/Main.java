import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("kolik dajmenzi");
        int dajmenze = sc.nextInt();

        Vektor v = new Vektor( new ArrayList<>());
        Vektor u = new Vektor(new ArrayList<>());



        //naplneni vektoru v a nasledne vektoru u (x,y,z) ...
            System.out.println("postupne napis souradnici pro prvni vektor");
        for (int i = 0; i < dajmenze; i++) {
            System.out.println(i+1 +". souradnici");
            int x = sc.nextInt();
            v.arr.add(x);
        }

        System.out.println("postupne napis souradnici pro druhy vektor");
        for (int i = 0; i < dajmenze; i++) {
            System.out.println(i+1 +". souradnici");
            int x = sc.nextInt();
            u.arr.add(x);
        }

    //u*v
        //spocitani vysledkuA
        int vysledekA = 0;
        for (int i = 0; i < v.arr.size(); i++) {
            vysledekA += v.arr.get(i) * u.arr.get(i);
        }
        System.out.println("Vysledna velikost pro u*v je: " + vysledekA);


    //v*u
        //spocitani vysledku B
        int vysledekB = 0;
        for (int i = 0; i < v.arr.size(); i++) {
            vysledekB += u.arr.get(i) * v.arr.get(i);
        }
        System.out.println("Vysledna velikost pro v*u je: " + vysledekB);

    //overeni komutativnosti
        if (vysledekA==vysledekB){
            System.out.println(vysledekA + "=" + vysledekB);
            System.out.println("Skalarni soucin je komutativni");
        }else {
            System.out.println("Skalarni soucin neni komutativni");
        }

    }
}
