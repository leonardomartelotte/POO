public class Ave extends Animal {
	
	private String corPena;
	public void fazerNinho() {
		System.out.println("P�ssaro construindo ninho");
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("P�ssaro comendo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("P�ssaro fazendo barulho");
	}
	
	public String getCorPena() {
		return corPena;
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}