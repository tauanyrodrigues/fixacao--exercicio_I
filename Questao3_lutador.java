public class Questao3_lutador {

    int energia, forca;
    int ForcaDoGolpe;
    String nome;

    public Questao3_lutador(int energia, int forca, String nome) {

        this.energia = energia;
        this.forca = forca;
        this.nome = nome;
    }

    public void aplicarGolpe(Questao3_lutador lutador1){

        lutador1.ForcaDoGolpe = this.forca;
        lutador1.reduzirEnergia();

    }
    public void reduzirEnergia(){
       this.energia = this.energia - this.ForcaDoGolpe;
    }
}
