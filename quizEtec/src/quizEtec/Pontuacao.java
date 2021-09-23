package quizEtec;

public class Pontuacao {
	static int acertos;
	static int erros;

	public static void setAcertos() {
		acertos++;
	}
	public static void setErros() {
		erros++;
	}
	
	public static int getAcertos() {
		return acertos;
	}
	public static int getErros() {
		return erros;
	}
}
