package parciales;

import java.util.ArrayList;
public abstract class Elemento{
        protected String categoria;
        public Elemento(String categoria){
        this.categoria = categoria;
        }
public abstract ArrayList<Elemento> buscarNoticia(Condicion c);
public abstract String getCategoria();
public abstract ArrayList<String> getClaves();
public abstract Elemento getCopia();
    public abstract int compareTo(Elemento e);
}