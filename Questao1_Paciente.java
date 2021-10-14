public class Questao1_Paciente {

    int codigo;
    String nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;

    public Questao1_Paciente(int codigo, String nome, String dataNascimento, String sexo, String alergia, String PlanodeSaude, String tipoSanguineo){

        this.codigo = codigo;
        this.planoSaude = PlanodeSaude;
        this.alergia = alergia;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.sexo = sexo;

    }
}
