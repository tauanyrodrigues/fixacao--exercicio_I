public class Questao4_Postagem {

    String text, link;
    int NumCurtidas, NumCompartilhamento;

    public Questao4_Postagem(String text, String link){

        this.text = text;
        this.link = link;

    }
    public void curtir(){
        this.NumCurtidas = this.NumCurtidas + 1;
    }
    public void compartilhar(){
        this.NumCompartilhamento = this.NumCompartilhamento + 1;
    }
}
