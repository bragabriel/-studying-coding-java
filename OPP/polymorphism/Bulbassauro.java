package OPP.polymorphism;

public class Bulbassauro extends Pokemon {

	private String defesaEspecial;

	public Bulbassauro(String nome, String tipo, String habilidade, int vida, String defesaEspecial) {
		super(nome, tipo, habilidade, vida);
		this.defesaEspecial = defesaEspecial;
	}
	
	public String getDefesaEspecial() {
		return defesaEspecial;
	}

	public void setDefesaEspecial(String defesaEspecial) {
		this.defesaEspecial = defesaEspecial;
	}
	
	public void imprimirPokemon() {
		super.imprimirPokemon();
		System.out.println("Defesa especial: " + this.defesaEspecial);
	}

}
