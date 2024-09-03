package devsupermodbasic.cadastro;

public class Departamento {
    private String nome;

    //Construtores
   public Departamento(){

    }
    public Departamento(String nome){
       this.nome = nome;
    }
    //Geters e Seters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    //to String

    public String toString(){
       StringBuilder st = new  StringBuilder();
           st.append("Departamento: ").append(nome).append("\n");

       return st.toString();
    }

}
