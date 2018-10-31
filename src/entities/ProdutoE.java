package entities;

public class ProdutoE {
	private String name;
	private double preco;
	private int qtd;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// Inserindo um Construtor
	public ProdutoE(String name,double preco,int qtd) {
		this.name = name;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	
	public ProdutoE(String name, double preco) {
		super();
		this.name = name;
		this.preco = preco;
	}

	public double totalEstoque() {
		return preco * qtd;
	}

	public void addEstoque(int qtd) {
		// Acessando atributo da classe
		this.qtd += qtd;
	}

	public void removeEstoque(int qtd) {
		// Acessando atributo da classe
		this.qtd -= qtd;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", preco) + ", " + qtd + " unidade(s), Total: $"
				+ String.format("%.2f", totalEstoque());
	}

}
