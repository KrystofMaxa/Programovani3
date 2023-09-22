import java.util.ArrayList;

public class ClovekMain {
    private void prohod(Clovek[] pole, int x, int y){
        Clovek clovek = pole[x];
        pole[x] = pole[y];
        pole[y] = clovek;
    }

    private Boolean jeVetsi(Clovek a, Clovek b){
        if(a.getRok() > b.getRok())
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Clovek[] arr = {
                new Clovek("Adam", "Pytel", 222),
                new Clovek("Krys", "Maxa", 62),
                new Clovek("Nik", "Zaled", 3),
                new Clovek("Tobi", "Nuy", 21)
        };
        for (int k = 0; k < arr.length - 1; k++) {
              int i = 0;
            while (arr[i].getRok() > arr[i + 1].getRok()) {
                Clovek c1;
                i=0;
                while (arr[i].getRok() > arr[i + 1].getRok()) {
                    c1 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = c1;
                }
            }
        }
            for (int ik = 0; ik < arr.length; ik++) {
                System.out.println(arr[ik]);
            }
    }
}
