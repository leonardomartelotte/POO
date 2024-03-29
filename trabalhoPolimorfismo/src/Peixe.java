public class Peixe extends Animal {
	
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public void soltarBolha() {
		System.out.println("Peixe soltando bolhas");
	}
	
	@Override
	public void locomover() {
		System.out.println("Peixe nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Peixe comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe fazendo barulho");
	}
}