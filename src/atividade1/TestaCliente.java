package atividade1;

public class TestaCliente {
    public static void main(String[] args) {
       Cliente cliente1 = new Cliente(01,22,123,"rua goias","joao");
       Cliente cliente2 = new Cliente(01,26,1234,"rua maranhao","maria");
       cliente1.visualizar();
       cliente2.visualizar();

       PessoaJuridica pj1 = new PessoaJuridica(03,45,147,"rua sao paulo","jaco",123);
       PessoaJuridica pj2 = new PessoaJuridica(04,44,456,"rua sao joao","leonardo",587);
       pj1.visualizar();
       pj2.visualizar();



    }
}
