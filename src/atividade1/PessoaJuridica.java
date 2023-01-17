package atividade1;

public class PessoaJuridica extends Cliente {
    private int cnpj;

    public PessoaJuridica(int id, int idade, int rg, String endereco, String nome,int cnpj) {
        super(id, idade, rg, endereco, nome);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public void visualizar(){
        super.visualizar();

        System.out.println("cnpj: "+this.cnpj);


    }


}
