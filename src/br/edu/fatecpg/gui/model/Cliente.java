package br.edu.fatecpg.gui.model;

public class Cliente {
    private String nome;
    private int idade;
    private String sexo; 

    //construtor 

    public Cliente(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //getters e setters 
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getSexo(){
        return sexo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //metodo 

    public String informacoes(){
       return "Seu nome é: "+ getNome() + "\n Idade: "+ getIdade() + "\n Sexo: "+ getSexo();
    }
}
