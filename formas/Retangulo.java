import java.util.InputMismatchException;
import java.util.Scanner;

public class Retangulo implements IShape,IShow{

	private float base;
	private float altura;
	
	public Retangulo(float base, float altura) {
		setBase(base);
		setAltura(altura);
	}
	
	@Override
	public float getArea() {
		return (this.base*this.altura);
	}

	@Override
	public float getPerimetro() {
		return (this.base*2)+(this.altura*2);
	}
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public void Imprimir() {
		System.out.println("Perimetro: " + getPerimetro());
		System.out.println("Base: " + getArea());	
	}

	public void calcular() {
		float perim1,area1;
		try{
			System.out.println("Informe a base: ");
			Scanner a = new Scanner(System.in);
			base = a.nextInt();
			System.out.println("Informe a Alturaura: ");
			altura = a.nextInt();
			area1 = base * altura;
			perim1 = base+altura+base+altura;
			System.out.println("Area: " + area1);	
			System.out.println("Perimetro: " + perim1);
		}
		catch (InputMismatchException e) {
			System.out.println("Ocorreu um erro. Voce deve digitar aspenas numeros.");
			calcular();
		}	
	}
}
