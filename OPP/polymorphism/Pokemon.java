package OPP.polymorphism;

public class Pokemon {

	private String nome;
	private String tipo;
	private String habilidade;
	private int vida;
	
	public Pokemon(String nome, String tipo, String habilidade, int vida) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.habilidade = habilidade;
		this.vida = vida;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void ExecutarHabilidade() {	
		System.out.println(this.nome + "usou a habilidade " + this.habilidade);
	}
	
	public void imprimirPokemon() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Habilidade: " + this.habilidade);
		System.out.println("Pontos de vida: " + this.vida);
	}
}
