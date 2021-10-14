public class Questao1_ClinicaDoPaciente {

    public static void main(String[] args){

        Questao1_Paciente paci_1 = new Questao1_Paciente( 89, "Karlla Tauany da Silva Rodrigues", "19/05/2004", "Feminina", "Abelha", "Plus ultra", "AB+");

        System.out.println("\n\nCodigo: "+paci_1.codigo);
        System.out.println("Nome: "+ paci_1.nome);
        System.out.println("Sexo: "+ paci_1.sexo);
        System.out.println("Data de Nascimento: "+ paci_1.dataNascimento);
        System.out.println("Tipo Sanguíneo: "+ paci_1.tipoSanguineo);
        System.out.println("Plano de saude: "+ paci_1.planoSaude);
        System.out.println("Alergia: "+ paci_1.alergia);

        paci_1.nome = "Carla Cássia Correia da Silva Rodrigues";
        paci_1.dataNascimento = "22/12/1985";
        paci_1.sexo = "Feminino";
        paci_1.alergia = "Abelha";
        paci_1.planoSaude = "Plus ultra";
        paci_1.tipoSanguineo = "AB-";
        paci_1.codigo = 90;

        System.out.println("\n\nCodigo: "+paci_1.codigo);
        System.out.println("Nome: "+ paci_1.nome);
        System.out.println("Sexo: "+ paci_1.sexo);
        System.out.println("Data de Nascimento: "+ paci_1.dataNascimento);
        System.out.println("Tipo Sanguíneo: "+ paci_1.tipoSanguineo);
        System.out.println("Plano de saude: "+ paci_1.planoSaude);
        System.out.println("Alergia: "+ paci_1.alergia);

    }
}
