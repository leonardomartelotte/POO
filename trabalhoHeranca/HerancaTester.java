
public class HerancaTester {

	public static void main(String[] args) {

		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		Professor p1 = new Professor();
		Tecnico t1 = new Tecnico();

		v1.setNome("Visitante");
		v1.setIdade(32);
		v1.setSexo("M");
		
		p1.setNome("Jair");
		p1.setEspecialidade("Culinária");
		p1.setIdade(82);
		p1.setSalario(1200);
		p1.setSexo("M");
		p1.receberAumento();

		t1.setNome("João Fortunado");
		t1.setMatricula(5489498);
		t1.setCurso("Engenharia de Computadores");
		t1.setIdade(44);		
		t1.setSexo("M");
		t1.Praticar();
		t1.PagarMensalidade();
		t1.setRegistroProfissional("Doutor em engenharia de computadores");

		a1.setNome("Leonardo");
		a1.setMatricula(50015200);
		a1.setCurso("Direito");
		a1.setIdade(21);		
		a1.setSexo("M");
		a1.PagarMensalidade();

		b1.setNome("Cremilda");
		b1.setMatricula(50048744);
		b1.setBolsa(300);
		b1.setCurso("Sociologia");
		b1.setIdade(45);
		b1.setSexo("F");
		b1.PagarMensalidade();
	}
}