package com.devsupermodbasic.cadastro;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empresa {

    SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
    private String nome;
    private String produto;
    private Date momento;

    //Asociação entre os objetos
    private Funcionario funcionario;

    //Lista para o objeto departamento
    List<Departamento> listaDepartamento = new ArrayList<>();

    //Construtores
    public Empresa(){

    }

    public Empresa(String nome, String produto, Date momento, Funcionario funcionario ){
        this.nome = nome;
        this.produto = produto;
        this.funcionario = funcionario;
        this.momento = momento;
    }

    //Geters e Seters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getProduto(){
        return produto;
    }

    public void setProduto(String produto){
        this.produto = produto;
    }

    public Date getMomento(){
        return momento;
    }

    public void setMomento(Date momento){
        this.momento = momento;
    }

    //Geter e Seter da asociação do objeto empresa
    public Funcionario getFuncionario(){
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }

    //Geter da lista de objeto
    public List<Departamento> getListaDapartamento(){
        return listaDepartamento;
    }

    //Método para adicionar os objetos na lista
    public void addlistaDepartamento(Departamento departamento){
        listaDepartamento.add(departamento);
    }

    //Método para remover um departamento da lista
    public void removeDepartamento(Departamento departamento){
        listaDepartamento.remove(departamento);
    }

    //Método toString com StringBuild



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nRelatórios:\n").append("Empresa:\n");
        sb.append("Nome da Empresa: ").append(nome).append("\n");
        sb.append("Início da Empresa: ").append(sdt.format(momento)).append("\n");
        sb.append("Produto Cadastrado: ").append(produto).append("\n\n").append("Funcionário:\n");
        sb.append("Nome Funcionário: ").append(funcionario).append("\n");
        sb.append("Departamento:\n");

        for (Departamento dep: listaDepartamento){
           sb.append(dep);
        }

        return sb.toString();
    }




}
