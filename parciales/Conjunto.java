package parciales;

import java.util.ArrayList;

public class Conjunto extends Elemento implements Comparable<Elemento>{
    private ArrayList<Elemento>elementos;

    
    public Conjunto(String categoria){
    super(categoria);
    this.elementos = new ArrayList<>();
    }
    public void addElemento(Elemento e){
        int i = 0;
        while(i < elementos.size() && elementos.get(i).compareTo(e)>0){
            i++;
        }
        elementos.add(i, e);
    }
    public int compareTo(Elemento e){
    return this.getCategoria().compareTo(e.getCategoria());
    }

    @Override
    public ArrayList<Elemento> buscarNoticia(Condicion c) {
       ArrayList<Elemento> aux = new ArrayList<>();
        for(Elemento e:elementos){
            ArrayList<Elemento> result = e.buscarNoticia(c);
            aux.addAll(result);
        }
        return aux;
    }

    public String getCategoria() {
       return super.categoria;
    }

    @Override
    public ArrayList<String> getClaves() {
        ArrayList<String> aux = new ArrayList<>();
        for(Elemento e:elementos){
            if(!aux.containsAll(e.getClaves())){
                aux.addAll(e.getClaves());
            }
            for(int i = 0; i< e.getClaves().size();i++){
                String clave = e.getClaves().get(i);
                if(!aux.contains(clave)){
                    aux.add(clave);
                }
            }
        }
    return aux;
    }
    @Override
    public Elemento getCopia() {
        Conjunto copia = new Conjunto(this.categoria);
        for (Elemento elemento : elementos) {
            copia.addElemento(elemento.getCopia());
        }
        return copia;
    }
    
}
