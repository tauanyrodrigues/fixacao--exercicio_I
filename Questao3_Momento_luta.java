public class Questao3_Momento_luta {

    public static void main(String[] args){

        Questao3_lutador person1 = new Questao3_lutador(100, 10, "Ryu");
        Questao3_lutador person2 = new Questao3_lutador(100, 12, "Bison");

        person1.aplicarGolpe(person2);
        person1.aplicarGolpe(person2);
        person1.aplicarGolpe(person2);
        System.out.println(person2.nome+"Energia: "+person2.energia);

        person2.aplicarGolpe(person1);
        person2.aplicarGolpe(person1);
        person2.aplicarGolpe(person1);
        person2.aplicarGolpe(person1);
        person2.aplicarGolpe(person1);
        person2.aplicarGolpe(person1);
        person2.aplicarGolpe(person1);
        person2.aplicarGolpe(person1);
        System.out.println(person1.nome+" Energia: "+person1.energia);
    }
}
