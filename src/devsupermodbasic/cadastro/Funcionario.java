package devsupermodbasic.cadastro;

public class Funcionario {
    private String nome;
    private String cpf;
    private String profissao;
    private String endereco;

    //Construtores
   public Funcionario(){

    }
    public Funcionario(String nome, String cpf, String profissao, String endereco){
       this.nome = nome;
       this.cpf = cpf;
       this.profissao = profissao;
       this.endereco = endereco;
    }

    //Geters e Seters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //to String
public String toString(){
       StringBuilder st = new StringBuilder();
       st.append(nome).append("\n");
       st.append("CPF funcionario: ").append(cpf).append("\n");
       st.append("Profissão funcionário: ").append(profissao).append("\n");
       st.append("Endereco Funcionário: ").append(endereco).append("\n");
      return st.toString();
}

}
