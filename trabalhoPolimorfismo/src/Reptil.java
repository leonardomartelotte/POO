public class Reptil extends Animal {
	
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Réptil andando");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void alimentar() {
		System.out.println("Réptil comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Réptil fazendo barulho");
	}
}