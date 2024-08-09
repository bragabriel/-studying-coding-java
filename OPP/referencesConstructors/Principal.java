package OPP.referencesConstructors;

public class Principal {

	public static void main(String[] args) {

		Carros Casual = new Carros("Casual", "Amarelo", "Chevrolet Celta", 2);
		
		Carros Esporte = new Carros("Esporte", "Preto", "Ford Mustang", 2, true);
		
		Carros Luxo = new Carros("Luxo", "Branco", "Lamborghini Urus", 4, true, true, true);

		Casual.imprimir();
		Esporte.imprimir();
		Luxo.imprimir();
		
	}

}
