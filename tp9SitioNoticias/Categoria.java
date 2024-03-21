package tp9SitioNoticias;

import java.util.ArrayList;

import parcialejemplo.Voluntario;

public class Categoria extends Componente{
    private String descripcion;
    private String imagenAsos;
    private ArrayList<Componente>componentes;

    public Categoria(String descripcion, String imagenAsos){
        this.componentes = new ArrayList<>();
        this.descripcion = descripcion;
        this.imagenAsos = imagenAsos;
    }

    public void addComp(Componente a){
        componentes.add(a);
    }


    /*public Componente getContenedor() {
        if(contenedor!=null)
        return contenedor;
        else
        return this;
    }

    public void setContenedor(Componente contenedor) {
        this.contenedor = contenedor;
    }
    */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenAsos() {
        return imagenAsos;
    }

    public void setImagenAsos(String imagenAsos) {
        this.imagenAsos = imagenAsos;
    }
    
    public int cantNoticias(){
       int cant = 0;
       for(Componente c:componentes){
            int cantParcial = c.cantNoticias();
             cant= cant + cantParcial;
        }
        return cant;
    }

    public String toString(){
        return descripcion;
    }
   
    public ArrayList<Componente> buscar(Condicion c){
        ArrayList<Componente> aux = new ArrayList<>();
        for(Componente comp:componentes){
            aux.addAll(comp.buscar(c));
        }
        return aux;
    }

    public Componente copiaRestringida(Condicion c){
        ArrayList<Componente> hijosCumplen = new ArrayList<>();
        for(Componente hijo:componentes){
            Componente aux = hijo.copiaRestringida(c);
                if(aux!=null){
                    hijosCumplen.add(aux);
                }
        }

        if( hijosCumplen.size()>0){
            Categoria copia = new Categoria(this.descripcion, this.imagenAsos);
            for(Componente comp:hijosCumplen){
                copia.addComp(comp);
            }
            
           return copia; 
        }
        else
            return null;
        
    }
    

    public ArrayList<String> getPalabrasClaves(){
        ArrayList<String> aux = new ArrayList<>();
        for(Componente cc:componentes){
            ArrayList<String> auxi = cc.getPalabrasClaves();
                for(String pp:auxi){
                    if(!aux.contains(pp)){
                        aux.add(pp);
                    }
                }
        }
        return aux;

    }

    


}
