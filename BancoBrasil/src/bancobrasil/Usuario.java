
package bancobrasil;

import java.util.Date;


public class Usuario {
    // Atributos da Classe
  String nome;
  String sobrenome;
  String telefone;
 
    //Construtores
    public Usuario(){};
    public Usuario (String n, String s, String t){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone  = telefone;   
    }
    // get e set
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String s){
        this.sobrenome = s;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String t){
        this.telefone = t;
    }
    
    
   public String imprimirInfo(){
    return String.format("nome: %s\n Sobrenome: %s\n Telefone: %s Data Registro: %s",this.nome, this.sobrenome, this.telefone);
    
    }
}
