package java7days.java;

public class Filme {
	private String titulo;
	private String imagem;
	private String ano;
	private String nota;
	
	public Filme(String titulo,String imagem, String ano, String nota) {
		this.titulo = titulo;
		this.imagem = imagem;
		this.ano = ano;
		this.nota = nota;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getImagem() {
		return imagem;
	}

	public String getAno() {
		return ano;
	}

	public String getNota() {
		return nota;
	}
	
	@Override
	public String toString() {
		return "Nome do Filme: "+this.titulo;
	}
}
