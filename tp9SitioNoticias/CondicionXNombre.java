package tp9SitioNoticias;

public class CondicionXNombre implements Condicion{
    private String autor;

    public CondicionXNombre(String ss){
        this.autor = ss;
    }
    public boolean cumple(Noticia ss){
        return ss.getAutor().contains(this.autor);
    }
}
