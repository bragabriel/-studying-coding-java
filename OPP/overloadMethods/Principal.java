package OPP.overloadMethods;

public class Principal {

	public static void main(String[] args) {

		Datas Data = new Datas();
		
		Data.setDia(21);
		Data.setMes(12);
		Data.setAno(2021);
		
		Data.apresentaData();
		
		Data.apresentaData(true);
		
		Data.avancarDia();
		
		Data.avancarQtdDias(40);
		Data.apresentaData();
	}
}