package parciales;

public class CondicionXTitulo implements Condicion {
    private String titulo;
    
    public CondicionXTitulo(String titulo){
        this.titulo = titulo;
    }
    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(titulo);
    }
    
}
