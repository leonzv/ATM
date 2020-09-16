import java.util.*;

public class Main {

    @SuppressWarnings("empty-statement")
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);

        String cpf;  //variavel para definir se o cpf está certo
        String senha; //variavel para definir se a senha está certa
        double saldo = 1000.00; //saldo do cliente
        int tentativa = 2; //variavel para diminuir as chances de tentar uma senha
        double saque; //variavel para subtrair o saldo quando fazer o saque

        System.out.print("Digite seu CPF(com pontos): "); 
        cpf = scan.nextLine();  
        if (cpf.equals("123.456.789-00") == true) {   
            do {    
                System.out.print("Digite sua senha: ");
                senha = scan.nextLine();

                if (senha.equals("01020304") == true) {
                    System.out.println("===================");
                    System.out.println("1- Saldo");
                    System.out.println("2- Depósito");
                    System.out.println("3- Saque");
                    System.out.println("0- Sair");
                    System.out.println("===================");

                    switch (scan.nextLine()) {
                        case "1":
                            System.out.print("Seu saldo é: " + saldo);
                            break;
                        case "2":
                            System.out.print("Quanto você deseja depositar?: ");
                            saldo = saldo + scan.nextDouble();
                            System.out.print("Saldo atual: " + saldo);
                            break;
                        case "3":
                            System.out.print("Quanto você deseja sacar?: ");
                                if (scan.nextDouble() > saldo) {
                                    System.out.println("Seu saque é maior que o saldo");
                                } else {
                                    System.out.print("Digite novamente para confirmar: ");
                                    saldo = saldo - scan.nextDouble();
                                    System.out.print("Saldo atual: " + saldo);
                                    break;
                                }

                        case "0":
                            break;

                        default:
                            break;
                    }
                    break;
                } else {

                    if (tentativa == 0) {
                        System.out.print("Conta Bloqueada");
                        break;
                    }
                    tentativa--;
                    System.out.println("Tentativas restantes " + tentativa);
                }
            } while (tentativa > 0);
        } else {
            System.out.print("Tela de acesso não permitido.");

        }
    }
}
