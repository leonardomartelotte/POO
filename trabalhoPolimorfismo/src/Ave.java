public class Ave extends Animal {
	
	private String corPena;
	public void fazerNinho() {
		System.out.println("Pássaro construindo ninho");
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Pássaro comendo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Pássaro fazendo barulho");
	}
	
	public String getCorPena() {
		return corPena;
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}