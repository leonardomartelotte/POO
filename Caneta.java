public class Caneta {

	// criação de atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void rabiscar() {
		if(tampada)
			System.out.println("Erro! A caneta está tampada!");
		else
			System.out.println("Rabiscando...");

	}

	void tampar() {
		tampada = true;

	}

	void destampar() {
		tampada = false;
	}
	
	void status() {
		System.out.println("Classe Caneta");
		System.out.println("Cor: " + cor);
		System.out.println("Tampada: " + tampada);
		System.out.println("Modelo: " + modelo);
	}

}
