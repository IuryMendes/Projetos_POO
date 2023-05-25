package bancobrasil;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando um objeto do tipo ContBancaria e referenciando nas
        //Variaveis ContaBancaria1 e ContaBancaria2
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        Usuario user1 = new Usuario();
        int qtdCadastro = 0;
        /*
     Uso nas versões mais atuais da jdk
     Var contaBancaria = new ContaBancaria();
     
     
     //Atribuido Valores ao nosso objeto
    contaBancaria1.agencia = "0001";
    contaBancaria1.conta = "12344";
    contaBancaria1.proprietario = "Junior";
    contaBancaria1.saldo = 1.99;
    
    //Exibindo os Valores atribuidos
    System.out.println(contaBancaria1.agencia+"\n"
            + contaBancaria1.conta + "\n"
            + contaBancaria1.proprietario + "\n"
            + contaBancaria1.saldo);
    
         */
 /*
     Scanner scan = new Scanner (System.in);
     
     System.out.println("BEM-VINDO AO BANCO BRASIL");
     System.out.println("CADASTRO DE CONTAS");
     System.out.println("Digite a agência -> ");
     contaBancaria1.agencia = scan.next();
     System.out.println("\nDigite a conta -> ");
     contaBancaria1.conta = scan.next();
     //Contrução e Inserção de dados do usuario
     System.out.println("\nDados do usuario");
     System.out.print("Digite o nome do cliente ->");
     user1.setNome(scan.next());
     System.out.print("Digite o sobrenome do cliente ->");
     user1.setSobrenome(scan.next());
     System.out.print("Digite o telefone do cliente -> ");
     user1.telefone = scan.next();
     contaBancaria1.proprietario = user1;
     System.out.println("\nDigite o valor de deposito -> ");
     contaBancaria1.depositar(scan.nextDouble());
        
        System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimirInfo() + "\n"
                + contaBancaria1.consultarSaldo());
        
        System.out.print("\n\n Digite o valor para saque ->");
                contaBancaria1.sacar(scan.nextDouble());
                
        System.out.println(contaBancaria1.consultarSaldo());
         */
        Scanner scan = new Scanner(System.in);
        boolean existe = false;
        int opcao = 0;
        boolean isLogin = false;
        Usuario user;
        ArrayList<Usuario> users = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ContaBancaria conta = new ContaBancaria();
        GerenteRepositorio db_gerente = new GerenteRepositorio();
        
        do{
        System.out.println("-----SEJA BEM VINDO AO BANCO BRASIL-----");
        System.out.print("LOGIN: ");
        String login = scan.next();
        System.out.print("PASSWORD: ");
        String password = scan.next();
        
        for(Gerente g : gerentes){
            if(g.getLogin().equals(login ) && g.getPassword().equals(password)){
                isLogin = true;
                
            }
        } 
        
        }while (isLogin != true);
        
        if(isLogin == false){
            System.out.println("Login ou senha inválida");
        }
        1
        
        while (opcao != 3) {
            //1° tela
            System.out.println("=======================");
            System.out.println("-----BANCO BRASIL-----");
            System.out.println("=======================");
            System.out.println("\n1-Cadastro de Cliente");
            System.out.println("2-  Cadastro de Conta");
            System.out.println("3 - Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1- \nCADASTRO DE CLIENTE\n");
                    System.out.println("Quantidade de cadastros");
                    qtdCadastro = scan.nextInt();

                    for (int i = 0; i < qtdCadastro; i++) {
                        user = new Cliente();
                        System.out.println("Nome: ");
                        user.setNome(scan.next());
                        System.out.println("Sobrenome: ");
                        user.setSobrenome(scan.next());
                        System.out.println("Telefone");
                        user.setTelefone(scan.next());
                        user = new Usuario();
                    }
                    break;

                case 2:
                    System.out.println("-----CADASTRO DE CONTA-----");
                    System.out.print("Agencia:");
                    conta.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");
                    //Será listados os clientes cadastrados
                    if (users.size() != 0) {
                        for (int i = 0; i < qtdCadastro; i++) {
                            System.out.printf("\n%d- %s %s", (i + 1), users.get(i).getNome(), users.get(i).getSobrenome());
                        }
                        System.out.print("\nSelecione o Cliente: ");
                        int userOpcao = scan.nextInt();
                        for (int i = 0; i < qtdCadastro; i++) {
                            if (userOpcao - 1 == i) {
                                conta.setProprietario(users.get(userOpcao - 1));
                                existe = true;
                            }

                        }
                        if (existe == false) {
                            System.out.println("Cliente nao existe");
                            break;
                        }
                    } else {
                        System.out.println("Nenhum cliente Cadastrado!" + "");
                    }

                case 3:
                    System.out.println("---- Saida ------");
                    break;
                default:
                    System.out.println("-----Operação inválida-----");

            }
        }
    }

}
