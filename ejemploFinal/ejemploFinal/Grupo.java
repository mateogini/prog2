package ejemploFinal;

import java.util.ArrayList;

import parcialejemplo.Combo;

public class Grupo extends Elemento{
    String titulo;
    int añoPubli;
    Persona editor;
    ArrayList<Elemento>contenido;
    
    public Grupo(String titulo, int añoPubli, Persona editor){
        this.titulo = titulo;
        this.añoPubli = añoPubli;
        this.editor = editor;
        this.contenido =new ArrayList<>();
    }

    public ArrayList<Persona> getRevisor(){
        ArrayList<Persona> aux = new ArrayList<>();
        for(int i = 0; i<contenido.size(); i++){
        Elemento elem = contenido.get(i);
            for(int j = 0; j<elem.getRevisor().size();j++){
            Persona per = elem.getRevisor().get(i);
                if(!aux.contains(per)){
                    aux.add(per);
                }
            }
        }
        return aux;
    }
        // Copia
    public Elemento copiaElem(Condicion cc){
        ArrayList<Elemento> hijosQueCumplen = new ArrayList<>();
        for(Elemento pp:contenido){
            Elemento copiaHijo = pp.copiaElem(cc);
            if(copiaHijo!=null){
                hijosQueCumplen.add(copiaHijo);
            }
        }
        if(hijosQueCumplen.size()>0){
            Grupo grupo = new Grupo(this.titulo, this.añoPubli, this.editor);
            for(Elemento pp:hijosQueCumplen){
                grupo.addContenido(pp.copiaElem(cc));
            }
        return grupo;
        }
        else{
            return null;
        }
    }
    public void addContenido(Elemento ele){
        contenido.add(ele);
    }
    public ArrayList<Persona> getAutor(){
        ArrayList<Persona> aux = new ArrayList<>();
        aux.add(editor);
        for(int i = 0; i<contenido.size(); i++){
        Elemento elem = contenido.get(i);
            for(int j = 0; j<elem.getAutor().size();j++){
            Persona per = elem.getAutor().get(i);
                if(!aux.contains(per)){
                    aux.add(per);
                }
            }
        }
        return aux;

    
    }

    public ArrayList<String> getTitulo() {
        ArrayList<String> aux = new ArrayList<>();
        for(int i = 0; i<contenido.size(); i++){
            Elemento h = contenido.get(i);
            for( int j = 0; j<h.getTitulo().size();j++){
                String str = h.getTitulo().get(i);
                if(!aux.contains(str)){
                    aux.add(str);
                }
            }
        }
        return aux;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPubli() {
        return añoPubli;
    }

    public void setAñoPubli(int añoPubli) {
        this.añoPubli = añoPubli;
    }


    public void setEditor(Persona editor) {
        this.editor = editor;
    }

    public Persona getEditor(){
        return new Persona(editor.getNombre(), editor.getApellido(), editor.getEmail());
    }
    public int cantPaginas(){
        int i = 0;
        for(int j = 0; j<contenido.size();j++){
            Elemento h = contenido.get(j);
            i += h.cantPaginas();
        }
        return i;
    }
    
}
