package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando um objeto do tipo ContBancaria e referenciando nas
        //Variaveis ContaBancaria1 e ContaBancaria2
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        Usuario user1 = new Usuario();
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
        Usuario user;
        Usuario[] users = new Usuario[5];
        ContaBancaria conta = new ContaBancaria();

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
                    for (int i = 0; i < users.length; i++) {
                        user = new Usuario();
                        System.out.println("1- \nCADASTRO DE CLIENTE\n");
                        System.out.println("Nome: ");
                        user.setNome(scan.next());
                        System.out.println("Sobrenome: ");
                        user.setSobrenome(scan.next());
                        System.out.println("Telefone");
                        user.setTelefone(scan.next());
                        users[i] = user;

                    }
                    break;

                case 2:
                    System.out.println("2- CADASTRO DE CONTA");
                    System.out.print("Agencia:");
                    conta.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");
                    for (int i = 0; i < users.length; i++) {
                        System.out.printf("\n%d- %s %s", (i + 1), users[i].getNome(), users[i].getSobrenome());
                    }
                    System.out.print("\nSelecione o Cliente: ");
                    int userOpcao = scan.nextInt();
                    for (int i = 0; i < users.length; i++) {
                        if (userOpcao - 1 == i) {
                            conta.setProprietario(users[userOpcao - 1]);
                            existe = true;
                        }

                    }
                    if (existe == false) {
                        System.out.println("Cliente nao existe");
                        break;
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
