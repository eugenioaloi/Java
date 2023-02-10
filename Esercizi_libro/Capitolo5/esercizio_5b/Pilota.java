package esercizio_5b;

public class Pilota {
	
	private String nome;
	
	public Pilota(String nome) {
		setNome(nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return  nome ;
	}

	
	
	

}
