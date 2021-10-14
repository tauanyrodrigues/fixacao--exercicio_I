public class Questao4_Postagem_Facebook {

    public static void main(String[] args){

        Questao4_Postagem Zoeira = new Questao4_Postagem("IFBA não presta, fujam, fujam.", "https://www.youtube.com");

        Zoeira.curtir();
        Zoeira.curtir();
        Zoeira.curtir();
        System.out.println("Quantia de curtidas: "+Zoeira.NumCurtidas);

        Zoeira.compartilhar();
        Zoeira.compartilhar();
        System.out.println("Quantia de compartilhamentos: "+Zoeira.NumCompartilhamento);

    }
}
