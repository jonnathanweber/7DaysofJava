package java7days.java;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
        String stringJSON = new APIClient("https://imdb-api.com/en/API/InTheaters/k_3kgap4j6").coletaJSON();
        JSONArray jsonFilmes  = new JSONObject(stringJSON).getJSONArray("items");
        
        Set<Filme> listaFilmes = new HashSet<>();
        for (Object a : jsonFilmes) {
        	String titulo = ((JSONObject) a).getString("title");
        	String imagem = ((JSONObject) a).getString("image");
        	String ano = ((JSONObject) a).getString("year");
        	String nota = ((JSONObject) a).getString("imDbRating");
        	
        	listaFilmes.add(new Filme(titulo,imagem,ano,nota));
        }
        
        HtmlGenerator html = new HtmlGenerator(listaFilmes);
        html.generateHtml();
     
    }
}

