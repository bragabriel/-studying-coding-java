package OPP.polymorphism;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pokemon> listaPokemons = new ArrayList<Pokemon>();
		
		Pokemon p1 = new Pikachu("Pikachu", "El�trico", "Choque do Trov�o", 100, "Cauda de Ferro");
		
		Pokemon p2 = new Bulbassauro("Bulbassauro", "Planta", "Chicotes de Vinha", 98, "Folhas de Navalha");
		
		Pokemon p3 = new Charmander("Charmander", "Fogo", "Presas de Fogo", 99, "Lan�a-Chamas");
	
		Pokemon p4 = new Squirtle("Squirtle", "�gua", "Rajada de Bolhas", 97, "Jato d'�gua");
		
		listaPokemons.add(p1);
		
		listaPokemons.add(p2);
		
		listaPokemons.add(p3);
		
		listaPokemons.add(p4);
		
		
		for(int i = 0; i < listaPokemons.size(); i++) {
			System.out.println((i+1) + "� Pokemon: ");
			listaPokemons.get(i).imprimirPokemon();
			System.out.println("------------------");
		}
		
		
		for(int i = 0; i < listaPokemons.size(); i++) {
			System.out.println(listaPokemons.get(i).getNome() + " use sua habilidade! ");
			System.out.println("vvvvvvvvvvvvvvvv");
			System.out.println(listaPokemons.get(i).getHabilidade());
			System.out.println("^^^^^^^^^^^^^^^^\n");
		}
		
		
		
	}

}
