
package bancobrasil;


public class ContaBancaria {
    //Atributos da Classe
    String agencia;
    String conta;
    double saldo;
    Usuario proprietario;
    
    //Construtores
    public ContaBancaria(){};
    public ContaBancaria(String a, String c, double s, Usuario p){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }
    
    // get e set
    public String getAgencia(){
        return this.agencia;
    }
    public void Setagencia(String a){
        this.agencia = a;
    }
    
    public String getConta(){
        return this.conta;
    }
    public void setConta (String c){
        this.conta = c;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }
    
    public Usuario getProprietario(){
        return this.proprietario;
    }
    
    
    public void setProprietario(Usuario p){
        this.proprietario = p;
    }
    
    //métodos(Comportamentos) da Classe
    void depositar(double valor){ //método com parametro
        this.saldo += valor;
    }
    
    void sacar(double valor){// Método com parametro
        
        if (saldo < valor){
           System.out.println("seu saldo é insuficiente para o saque");
        } else{
       this.saldo -= valor;
       
           
       }
    }
    
    void trasferir(ContaBancaria ContaBancaria, double valor){
        if(valor > saldo){
        this.sacar(valor);
          ContaBancaria.saldo += valor;
        } else{
            
        }
       
        
    }
    
    String consultarSaldo(){ // Método sem parametro
        // String.format() método da classe String para utilizar formatação
        // com identificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f",this.saldo);
    }
}
