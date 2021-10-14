public class Questao2_Clinica_Medico {

    public static void main(String[] args) {

     Questao2_endereco endereco = new Questao2_endereco("142", "48520000", "Castelo Branco", "Rua do Jucelino CubeCheck", "Caixa dagua", "Canudos", "BA");
     Questao2_medico medico1 = new Questao2_medico(1231, "Joedson Dhomini Andrade de Souza", "Masculino", "urologista", endereco);

     System.out.println("\n\nInformações do Medico:");
     System.out.println("Sexo: " + medico1.sexo);
     System.out.println("Codigo: " + medico1.codigo);
     System.out.println("Nome: " + medico1.nome);
     System.out.println("Especialidade: " + medico1.especialidade);
     System.out.println("Endereco do medico abaixo");
     endereco.EnderecoMedico();

     endereco.numero = "192";
     endereco.cep = "482332321";
     endereco.rua = "Presidente imprudente";
     endereco.complemento = "Sem";
     endereco.bairro = "Canche";
     endereco.cidade = "Rio de Janeiro";
     endereco.uf = "RJ";
     medico1.codigo = 1321;
     medico1.nome = "Brena Gomes de Souza";
     medico1.sexo = "Feminino";
     medico1.especialidade = "Pneumologista";

     System.out.println("\n\nInformações do Medico:");
     System.out.println("Sexo: " + medico1.sexo);
     System.out.println("Codigo: " + medico1.codigo);
     System.out.println("Nome: " + medico1.nome);
     System.out.println("Especialidade: " + medico1.especialidade);
     System.out.println("Endereco do medico abaixo");
     endereco.EnderecoMedico();
    }
}
