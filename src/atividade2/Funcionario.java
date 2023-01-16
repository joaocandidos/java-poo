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
