import atividade1.Cliente;

public class Atividades1a3 {
    package atividade1;

    public class Cliente {
        private int id;
        private int idade;
        private int rg;
        private int cpf;
        private String nome;

        public Cliente(int id, int idade, int rg, int cpf, String nome) {
            this.id = id;
            this.idade = idade;
            this.rg = rg;
            this.cpf = cpf;
            this.nome = nome;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getRg() {
            return rg;
        }

        public void setRg(int rg) {
            this.rg = rg;
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void vusializar(){
            System.out.println("id: "+getId());
            System.out.println("nome: "+getNome());
            System.out.println("idade: "+getIdade());
            System.out.println("rg: "+getRg());
            System.out.println("cpf: "+getCpf());
            System.out.println("***********************************");

        }


    }

}
//////////////////////////////////////////////////////////////////
package atividade1;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(01,30,321666,291255,"João");
        Cliente cliente2 = new Cliente(02,35,321444,123456,"Maria");
        cliente1.vusializar();
        cliente2.vusializar();
    }
}
////////////////////////////////////////////////////////////////////////////////
package atividade2;

public class Funcionario {
    private int id;
    private int idade;
    private int rg;
    private int cpf;
    private String nome;

    public Funcionario(int id, int idade, int rg, int cpf, String nome) {
        this.id = id;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void vusializar(){
        System.out.println("id: "+getId());
        System.out.println("nome: "+getNome());
        System.out.println("idade: "+getIdade());
        System.out.println("rg: "+getRg());
        System.out.println("cpf: "+getCpf());
        System.out.println("***********************************");

    }


}
////////////////////////////////////////////////////////////////////////////
package atividade2;

public class TestaFuncionario {
    public static void main(String[] args) {
        atividade2.Funcionario funcionario1 = new atividade2.Funcionario(01,25,123456,321654,"Jorge");
        atividade2.Funcionario funcionario2 = new atividade2.Funcionario(02,22,125462,741852,"Maria");
        funcionario1.vusializar();
        funcionario2.vusializar();
    }
}
///////////////////////////////////////////////////////////////////////////////////
package atividade6;

public class Curso {
    private String nome;
    private int duracao;
    private float investimento;
    private int classificacao;
    private int parcelas;

    public Curso(String nome, int duracao, float investimento, int classificacao, int parcelas) {
        this.nome = nome;
        this.duracao = duracao;
        this.investimento = investimento;
        this.classificacao = classificacao;
        this.parcelas = parcelas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getInvestimento() {
        return investimento;
    }

    public void setInvestimento(float investimento) {
        this.investimento = investimento;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    public void vusializar(){

        System.out.println("nome: "+getNome());
        System.out.println("duração: "+getDuracao()+" meses");
        System.out.printf("total investido: %.2f \n",getInvestimento());
        System.out.println("classificacao do curso: "+getClassificacao());
        System.out.println("parcelamento: "+getParcelas()+" parcelas");

        System.out.println("***********************************");

    }

}
////////////////////////////////////////////////////////////////////////////////////
package atividade6;

public class TestaCurso {
    public static void main(String[] args) {
        atividade6.Curso curso1 = new atividade6.Curso("Introdução ao CSS",10,1000,9,12);
        atividade6.Curso curso2 = new atividade6.Curso("Introdução ao Desenvolvimento java",12,2500,10,10);
        curso1.vusializar();
        curso2.vusializar();
    }
}
//////////////////////////////////////////////////
