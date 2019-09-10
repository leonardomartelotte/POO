import java.util.Date;
import java.util.Scanner;

public class Tweet {
	
	private String texto;
	private Date horario;
	
	public String getTexto() { return texto; }
	
	public void setTexto(String texto) { this.texto = texto; }
	
	public Date getHorario() { return horario; }
	
	public void setHorario(Date horario) { this.horario = horario; }

	public void  Tweetar(Usuario usuario1) {
		String postarMais = "s";
		while(postarMais.equals("s")) {
			if(usuario1.getLogado()) {
				Date data = new Date(); 
				this.horario = data;
				Scanner dados = new Scanner(System.in);
				System.out.print("Digite o Tweet: ");
				String tweet = dados.nextLine();
				if(tweet.length() >= 140) {
					System.out.println("O número máximo de 140 caracteres por Tweet!\n");
				} else {
					Tweet t2 = new Tweet();
					t2.setTexto(tweet);
					t2.setHorario(horario);
					usuario1.adicionarTweet(t2);
					System.out.println("Tweet enviado!");
					System.out.print("Enviar mais um Tweet? (s/n) ");
					postarMais = dados.next();
				}
			} else {
				System.out.println("Você precisa acessar para Tweetar!");
				break;
			}
		}
		System.out.println("\n");
	}
}