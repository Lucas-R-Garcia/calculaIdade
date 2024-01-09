public class Pessoa {
    //Atributos
    int idade;
    int dia_nasci;
    int mes_nasci;
    int ano_nasci;
    String nome;


        //metodos
        public void calculaIdade(int dia, int mes, int ano) {

            if (mes < this.mes_nasci || mes - this.mes_nasci == 0 && dia < this.dia_nasci)
                this.idade = (ano - this.ano_nasci) - 1;

            else
             this.idade = (ano - this.ano_nasci);
    }

        //get para pegar a idade, utilizado mais abaixo
        public int getIdade(){
            return this.idade;
        }

    public void informaIdade(){
            getIdade();
        System.out.println("Minha idade seria: " + getIdade());

    }

    //retorno da String
    public String informaNome(){
        return ("Nome: " + nome);
    }

    public void ajustaDataDeNascimento( int dia, int mes, int ano ){

            this.dia_nasci = dia;
            this.mes_nasci = mes;
            this.ano_nasci = ano;

    }

}
