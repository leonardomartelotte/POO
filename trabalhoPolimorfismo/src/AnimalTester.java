public class AnimalTester {

	public static void main(String[] args) {

		Ave Ave1 = new Ave();
		Mamifero Mamifero1 = new Mamifero();
		Peixe Peixe1 = new Peixe();
		Reptil Reptil1 = new Reptil();
		
		Ave1.setCorPena("Marrom");
		Ave1.setIdade(3);
		Ave1.setMembros(2);
		Ave1.setPeso(3);
		Ave1.fazerNinho();
		Ave1.alimentar();
		Ave1.emitirSom();
		Ave1.locomover();
		System.out.println("******************************************");
		
		Mamifero1.setIdade(6);
		Mamifero1.setMembros(4);
		Mamifero1.setPeso(30);
		Mamifero1.setCorPelo("Preto");
		Mamifero1.alimentar();
		Mamifero1.emitirSom();
		Mamifero1.locomover();
		System.out.println("******************************************");
		
		Peixe1.setCorEscama("Prata");
		Peixe1.setMembros(3);
		Peixe1.setIdade(1);
		Peixe1.setPeso(1);
		Peixe1.soltarBolha();
		Peixe1.alimentar();
		Peixe1.emitirSom();
		Peixe1.locomover();
		System.out.println("******************************************");
		
		Reptil1.setIdade(4);
		Reptil1.setMembros(5);
		Reptil1.setPeso(10);
		Reptil1.setCorEscama("Marrom");
		Reptil1.alimentar();
		Reptil1.emitirSom();
		Reptil1.locomover();
		System.out.println("******************************************");
	}
}