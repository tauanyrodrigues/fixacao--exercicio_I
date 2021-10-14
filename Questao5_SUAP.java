public class Questao5_SUAP {

    public static void main(String[] args){

        double m;

        Questao5_discente TauanyKarlla = new Questao5_discente("Karlla Tauany da Silva Rodrigues", "095.354.996-18");

        TauanyKarlla.n1 = 9;
        TauanyKarlla.n2 = 0;
        TauanyKarlla.n3 = 9;

        m = TauanyKarlla.media();
        System.out.println("Media da aluna (o): "+m);

        TauanyKarlla.n2 = 10;
        m = TauanyKarlla.media();
        System.out.println("Media da aluna (o): "+m);
    }
}
