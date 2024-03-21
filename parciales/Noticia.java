package parciales;

import java.util.ArrayList;

public class Noticia extends Elemento{
    private String titulo,autor, contenido;
    private ArrayList<String> claves;
    public Noticia(String titulo, String categoria, String contenido, String autor){
        super(categoria);
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
        this.claves = new ArrayList<>();
    }
    public ArrayList<String> getClaves(){
        ArrayList<String> aux = claves;
        return aux;
    }
    public Noticia getCopia(){
        Noticia copia = new Noticia(this.titulo,this.categoria,this.contenido,this.autor);
        copia.claves = this.claves;
        return copia;
    }
    @Override
    public ArrayList<Elemento> buscarNoticia(Condicion c) {
        ArrayList<Elemento> aux = new ArrayList<>();
        if(c.cumple(this)){
            aux.add(this.getCopia());
        }
        return aux;
    }

    @Override
    public String getCategoria() {
        
        return super.categoria;
    }

   
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    @Override
    public String toString() {
        return "Noticia [titulo=" + titulo + "]";
    }
    public void addClave(String clave){
        claves.add(clave);
    }
    public void addClaveXCond(Condicion c,String clave){
        if(c.cumple(this)){
        this.claves.add(clave);
        }
    }
    @Override
    public int compareTo(Elemento e) {
        return this.getCategoria().compareTo(e.getCategoria());
    }
}
