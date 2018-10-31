package entities;

public class Operacoes {
	public static final double taxa = 5.0;

	private String nome;
	private double saldo;
	private int conta;

	public Operacoes(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public Operacoes(String nome, double saldoInicial, int conta) {
		this.nome = nome;
		this.conta = conta;
		deposito(saldoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getConta() {
		return conta;
	}

	public void deposito(double qtd) {
		saldo += qtd;
	}

	public void saque(double qtd) {
		saldo -= qtd + taxa;
	}

	public String toString() {
		return "Conta: " + conta + " ,Nome: " + nome + " ,Saldo:" + String.format("%.2f", saldo);
	}

}
