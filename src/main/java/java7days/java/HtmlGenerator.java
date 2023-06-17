package java7days.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;


public class HtmlGenerator {

	Set<Filme> listaFilme;
	public HtmlGenerator(Set<Filme> listaFilme) {
		this.listaFilme = listaFilme;
	}
	
	public void generateHtml() throws IOException {
		String html = "";
		for (Filme l : this.listaFilme) {
			html += "<div>\n"
					+ "<img src="+l.getImagem()+"+align=\"left\" height=\"200\" "
					+ "width=\"180\"><br>"
					+ ""+l.getTitulo()+" ("+l.getAno()+") | Nota: "+l.getNota()
					+ "</div>";
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("filmes.html"))) {
			writer.write(html);
			System.out.println("html gerado");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
