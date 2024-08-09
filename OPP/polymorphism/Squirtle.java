package OPP.polymorphism;

public class Squirtle extends Pokemon {

	private String ataqueEspecial;

	public Squirtle(String nome, String tipo, String habilidade, int vida, String ataqueEspecial) {
		super(nome, tipo, habilidade, vida);
		this.ataqueEspecial = ataqueEspecial;
	}

	public String getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(String ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}
	
	public void imprimirPokemon() {
		super.imprimirPokemon();
		System.out.println("Ataque especial: " + this.ataqueEspecial);
	}
}