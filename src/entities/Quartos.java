package entities;

public class Quartos {
	private String nome;
	private String email;
	private int quarto;
	
	
	
	public Quartos(String nome, String email, int quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
	public String toString() {
		return quarto +": "+" "+nome +" "+ email;
		
	}
	

}
