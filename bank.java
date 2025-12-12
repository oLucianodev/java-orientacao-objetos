import java.util.Scanner;
public class bank {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta c1 = new Conta(8888,8,"JU","463576566-00");
	
		double valor;
		int opcao;
		do {
			System.out.println("* conta do J *");
			System.out.println("1 - extrato / 2 - deposito / 3 - saque / -1 - encerrar");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(c1.exibirinfo());
				break;
			case 2:
				System.out.println("digite o valor a depositar");
				valor = teclado.nextDouble();
				c1.depositar(valor);
				break;
			case 3:
				System.out.println("digite o valor do saque:");
				valor = teclado.nextDouble();
			    if (c1.sacar(valor)) {
					 System.out.println("saque outorizado");
				 }
				 else {
					 System.out.println("saldo insuficiente");
				 }
			    break;
			case -1:
				System.out.println("obrigado por utilizar nossos servicos");
			default:
				System.out.println("opcao invalida");
				
			}
		} while(opcao != -1);
		teclado.close();
	}

}