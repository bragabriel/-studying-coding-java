package OPP.associationsBetweenObjects;

public class Principal {

	public static void main(String[] args) {
		
		// Exemplo de Agrega��o
		// Os objetos (jogador, tecnico, estadio e presidente) estao agregando valor ao time.
		// Na agrega��o o objeto todo nao pode existir sem o objeto
		//  parte, porem a parte pode existir sem o todo.

		//objeto parte
		Jogador jogador = new Jogador();
		jogador.setNome("Neymar");
		jogador.setIdade(29);
		
		Tecnico tecnico = new Tecnico();
		tecnico.setNome("Mauricio Pochettino");
		tecnico.setIdade(49);
		
		Estadio parc_des_princes = new Estadio();
		parc_des_princes.setNome("Parc des Princes");
		parc_des_princes.setCidade("Paris");
		parc_des_princes.setCapacidade(48000);
		
		Presidente presidente = new Presidente();
		presidente.setNome("Nasser Al-Khela�fi");
		presidente.setIdade(47);
								
		//objeto todo
		Time psg = new Time("Paris Saint-Germain", "Azul, Vermelho e Branco", parc_des_princes, jogador, tecnico, presidente);	

		psg.exibirTime();
	}
}