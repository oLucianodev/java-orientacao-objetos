public class Conta {
	private int numeroConta;
	private int digitoVeri;
	private String nome;
	private String Cpf;
	private double saldo;
	public Conta(int numeroConta,int digitoVeri,String nome,String Cpf) {
		
		this.numeroConta = numeroConta;
		this.digitoVeri = digitoVeri;
		this.nome = nome;
		this.Cpf = Cpf;
		this.saldo = 0.0;
		
		
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDigitoVeri() {
		return digitoVeri;
	}
	public void setDigitoVeri(int digitoVeri) {
		this.digitoVeri = digitoVeri;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public String exibirinfo() {
	   return "conta:" + numeroConta + "/" + digitoVeri + "-" + nome + "("+Cpf+") R$" + String.format("%.2f", this.saldo);
	}
   public void depositar (double valor) {
	   this.saldo += valor;
   }
   public boolean sacar(double valor) {
	   if (this.saldo >= valor) {
		   this.saldo -= valor;
		   return true;
	   }
	   return false;
   }
}