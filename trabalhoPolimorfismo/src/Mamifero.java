public class Mamifero extends Animal {
	private String corPelo;
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Mamífero em locomoção");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamífero comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Mamífero fazendo barulho");
	}
}