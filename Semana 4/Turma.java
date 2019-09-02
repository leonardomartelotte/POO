import java.util.ArrayList;
public class Turma {
	
	private int codigo;
	private String descricao;
	private ArrayList<Aluno> alunos;
	
	//CONSTRUTOR!
	public Turma(){
		alunos = new ArrayList<Aluno>();
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	//NOVOS METODOS
	public void adicionarAluno(Aluno novoAluno){
		alunos.add(novoAluno);
		System.out.println("Aluno inserido com sucesso.\n");
	}
	
	
	public void imprimirAlunos(){
		
		
		for(int i = 0 ; i < alunos.size() ; i++){
			Aluno al;
			al = alunos.get(i);
			System.out.println("Matricula = " + al.getMatricula());
			System.out.println("Nome = " + al.getNome());
			System.out.println("**********************");
		}
		
		/* AJUSTAR AQUI
		 for(Aluno al:aluno){
			System.out.println("Matricula = " + al.getMatricula());
			System.out.println("Nome = " + al.getNome());
			System.out.println("**********************");
		}
		*/
		
	}
	
	
	
	
	
}
