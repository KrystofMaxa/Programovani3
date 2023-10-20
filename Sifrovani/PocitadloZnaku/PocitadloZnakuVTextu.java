import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PocitadloZnakuVTextu implements Comparable {
    static HashMap<String, Integer> pocetPismen = new HashMap<String, Integer>();
    public static void main(String[] args) throws FileNotFoundException {

        //pRO CESTINU JSOU
        //vzit text, zacit pocitat pismenka
        //na vstupu textovzprogram kolikrat se opakujou jednotlivy pismenka
        //soubor ze ktereho beru jednotliva slova
        File file = new File("complet.txt");
        Scanner sc = new Scanner(file);

        //Hashmap pro ukladani pismen a jejich pocet vyskytnuti v text

        String slovo = sc.next();

        while (sc.hasNext()){
            int i = 0;
            while (i<slovo.length()) {
                //dostane pismeno ze stringu
                String w = String.valueOf(slovo.charAt(i));
                //kdyz znak existuje, prida 1 k celkovemu poctu daneho znaku
                //kdyz neexistuje, vytvori novy key-value
                if (pocetPismen.containsKey(w)){
                    pocetPismen.merge(w, 1, Integer::sum);
                    i++;
                }else{
                    pocetPismen.put(w,0);
                    pocetPismen.merge(w, 1, Integer::sum);
                    i++;
                }
            }
            slovo = sc.next();
            System.out.println(slovo);
        }
        System.out.println(pocetPismen);


    }

    @Override
    public int compareTo(Object o) {
        return pocetPismen.get(o.toString());
    }
}