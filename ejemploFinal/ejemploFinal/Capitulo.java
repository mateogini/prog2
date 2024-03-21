package ejemploFinal;

import java.util.ArrayList;

public class Capitulo extends Elemento{
    ArrayList<Persona>escritor;
    Persona revisor;
    ArrayList<String> tema;
    int cantPaginas;

    public Capitulo(Persona revisor, int cantPaginas){
        this.cantPaginas = cantPaginas;
        this.tema = new ArrayList<>();
        this.revisor = revisor;
        this.escritor = new ArrayList<>();
    }

    public ArrayList<String> getTitulo() {
        return tema;
    }
    public ArrayList<Persona> getRevisor(){ //retorna un unico revisor 
        new Persona(revisor.getNombre(), revisor.getApellido(), revisor.getEmail());
        ArrayList<Persona> aux = new ArrayList<>();
        aux.add(new Persona(revisor.getNombre(), revisor.getApellido(), revisor.getEmail()));
        return aux;
    }

    public int cantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public ArrayList<Persona> getAutor(){
        ArrayList<Persona> aux = new ArrayList<>();
        aux.addAll(escritor);
        return aux;
    }

    public Elemento copiaElem(Condicion cc){
        if(cc.cumple(this)){
        
        return new Capitulo(this.revisor, this.cantPaginas);
        }
        else
            return null;
        
    }
    public void addEscritor(Persona p){
        if(!revisor.equals(p)){
            this.escritor.add(p);
        }
    }


}