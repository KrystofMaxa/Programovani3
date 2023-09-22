public class Clovek {
    private String jmeno;
    private String prijmeni;
    private int rok;

    public Clovek(String jmeno, String prijmeni, int rok) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rok = rok;
    }
    public int getRok(){
        return rok;
    }
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

    @Override
    public String toString() {
        return "Clovek{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", rok=" + rok +
                '}';
    }
}
