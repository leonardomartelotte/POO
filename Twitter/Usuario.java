/*
LEONARDO MARTELOTTE
0050015200
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String usuario;
	private String nome;
	private ArrayList<Tweet> tweets;
	private boolean logado;
	
	public boolean getLogado() { return logado; }

	public void setLogado(boolean logado) { this.logado = logado; }

	public Usuario(){ tweets = new ArrayList<Tweet>(); }
		
	public void Login() {
		Scanner dados = new Scanner(System.in);
		System.out.print("Digite o Login: ");
		String login = dados.next();
		System.out.print("Digite a Senha: ");
		String senha = dados.next();
		if(senha.equals("poo"))
		{
			logado = true;
			System.out.println("\nSeja bem vindo, "+nome+"!\n\n");
		} else {
			System.out.println("\nSenha incorreta! Tentar novamente? (s/n):");
			String confirmacao = dados.next();
			if(confirmacao.equals("s")) {
				System.out.println("\r\n");
				Login();
			}
		}
	}
	
	public void Logout() {
		if(logado) {
			logado=false;
			System.out.println("\nVocê está deslogado.");
		}
	}

	public String getUsuario() { return usuario; }

	public void setUsuario(String usuario) { this.usuario = usuario; }

	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public ArrayList<Tweet> getTweets() { return tweets; }
	
	public void setTweets(ArrayList<Tweet> tweets) { this.tweets = tweets; }
	
	public void adicionarTweet(Tweet novoTweet) {
		if (logado) 
			tweets.add(novoTweet);
		else 
			System.out.println("É preciso estar logado para Tweetar.");
	}
	
	public void imprimirTweet() {
		for(int i = 0 ; i < tweets.size() ; i++) {
			Tweet tweet1;
			tweet1 = tweets.get(i);
			System.out.println(
			"********************************************************\nTweet "
			+ i + " enviado em "+ tweet1.getHorario() 
			+ ":\n=> " + tweet1.getTexto()
			);
		}
	}
}