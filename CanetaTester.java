public class CanetaTester {

	public static void main(String[] args) {

		Caneta c1;
		
		c1 = new Caneta();
		c1.cor = "vermelho";
		c1.modelo = "BIC";
		c1.tampada = false;
		
		Caneta c2 = new Caneta();
		c2.cor = "azul";
		c2.modelo = "Paper Mate";
		c2.tampada = true;
		
		c1.status();
		c1.rabiscar();
		
		c2.status();
		c2.rabiscar();
		
	}

}
