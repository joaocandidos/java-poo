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
