package App;

public class Livro {

	private int idLivro;
	private String titulo;
	private String autor;
	private int ano;
	private int paginas;
	
	public Livro(String titulo, String autor, int ano, int paginas) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAno(ano);
		this.setPaginas(paginas);
	}
	public Livro(int id, String titulo, String autor, int ano, int paginas) {
		this.setIdLivro(id);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAno(ano);
		this.setPaginas(paginas);
	}
	
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
	
	
}
