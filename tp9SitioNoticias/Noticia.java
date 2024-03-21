package tp9SitioNoticias;

import java.util.ArrayList;

public class Noticia extends Componente{
    private String titulo,introduccion,autor,link,texto;
    ArrayList<String>palabras;
    public Noticia(String titulo, String introduccion, String autor, String link, String texto) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.autor = autor;
        this.link = link;
        this.texto = texto;
        this.palabras = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIntroduccion() {
        return introduccion;
    }
    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void addClave(String p){
         int i = 0;
        while (i < palabras.size() && palabras.get(i).compareTo(p)<0){
            i++;
        }
        palabras.add(i, p);
    }

    public ArrayList<String> getPalabrasClaves(){
        ArrayList<String> aux = new ArrayList<>();
       
        aux.addAll(palabras);
        return aux;
    }

    public String toString(){
        return titulo + " ";
    }

    
    
    @Override
    public int cantNoticias() {
       return 1;
    }
    @Override
    public ArrayList<Componente> buscar(Condicion c) {
        ArrayList<Componente> aux = new ArrayList<>();
        if(c.cumple(this)){
            aux.add(new Noticia(this.titulo, this.introduccion, this.autor, this.link, this.texto));
        }
        return aux;
    }
    public Componente copiaRestringida(Condicion c){
        if(c.cumple(this)){
            return new Noticia(this.titulo, this.introduccion, this.autor, this.link, this.texto);
        }
        return null;
    
    }
}
