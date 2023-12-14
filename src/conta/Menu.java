package conta;

import java.util.Scanner;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Conta conta1 = new Conta(5, 200, 2, "Teste", 20000.0f);
		conta1.visualizar();
		conta1.sacar(1000.0f);
		conta1.visualizar();
		conta1.depositar(3000.0f);
		conta1.visualizar();
		
		
		int opcao;
		
		while (true) {
			System.out.println("*******************************************");
			System.out.println("                                           ");
			System.out.println("			BANCO DO BRAZIL COM Z		   ");
			System.out.println("                                           ");                                             
			System.out.println("*******************************************");
			System.out.println("                                           ");
			System.out.println("		1 - Criar Conta                    ");
			System.out.println("		2 - Listar todas as contas         ");
			System.out.println("		3 - Buscar Conta por Numero        ");
			System.out.println("		4 - Atualizar Dados da Conta       ");
			System.out.println("		5 - Apagar Conta                   ");
			System.out.println("		6 - Sacar                          ");
			System.out.println("		7 - Depositar                      ");
			System.out.println("		8 - Transferir valores entra Contas");
			System.out.println("		0 - Sair                           ");
			System.out.println("*******************************************");
			System.out.println("Entre com a opção desejada:                ");
			System.out.println("                                           ");
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println("\nBanco do Brasil com Z - O seu futuro começa aqui! ");
				sobre();
				
                leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");

					break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");

					break;
				case 3:
					System.out.println("Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println("Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println("Saque\n\n");

					break;
				case 7:
					System.out.println("Depósito\n\n");

					break;
				case 8:
					System.out.println("Transferência entre Contas\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Eric Vieira Antunes");
		System.out.println("Eric Antunes - eric-antunes2006@hotmail.com");
		System.out.println("github.com/eric-vantunes");
		System.out.println("*********************************************************");
	}

}


