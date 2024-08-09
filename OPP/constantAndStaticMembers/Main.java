package OPP.constantAndStaticMembers;

public class Main {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Rua abc", "bairro dbd", "Pirassununga", "S�o Paulo", 2324242, "Perto do mercado abc");
		
		Proprietario proprietario1 = new Proprietario("Gabriel", 123123, 321321, endereco1);
		
		Marca marca1 = new Marca("Ferrari", 1, 2022, 123123);
		
		Carro carro1 = new Carro("458 spider", "Vermelha", 2022, marca1, "HelloWorld123",
				proprietario1, 400, 200, 2, true, 6, 6, true, 200);
		
		carro1.autonomia(50);
	}
	
		

}
