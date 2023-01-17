package atividade1;

public class Cliente {
    private int id;
    private int idade;
    private int rg;
    private String endereco;
    private String nome;

    public Cliente(int id, int idade, int rg, String endereco, String nome) {
        this.id = id;
        this.idade = idade;
        this.rg = rg;
        this.endereco = endereco;
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

    public String getCpf() {
        return endereco;
    }

    public void setCpf(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void visualizar(){
        System.out.println("****************************************");
        System.out.println("id: "+ this.id);
        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        System.out.println("rg: "+this.rg);
        System.out.println("endereco: "+this.endereco);


    }


}
