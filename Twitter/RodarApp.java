/*
LEONARDO MARTELOTTE
0050015200
*/
public class RodarApp {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setNome("Leonardo");
		usuario.setUsuario("@leomartelotte");
		
		usuario.Login();
		
		Tweet tweet = new Tweet();
		tweet.Tweetar(usuario);
		usuario.imprimirTweet();
		usuario.Logout();
	}
}
