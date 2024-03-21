package parcialejemplo;

import java.util.ArrayList;

public class Suelto extends Producto{
    private double peso;
    private double precio;
    private ArrayList<String>categorias;


    public Suelto(double peso, double precio){
        this.precio = precio;
        this.peso = peso;
        this.categorias = new ArrayList<>();
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public ArrayList<String> getCategorias(){
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(categorias);
        return aux;
    }
    public int cantProd(){
        return 1;
    }

    public Suelto menorPeso(){        
        return new Suelto(this.peso, this.precio);
    }

    public String toString(){
        return " " + this.peso;
    }
    public Producto copiaRestringida(Condicion cc){
        if(cc.cumple(this)){
            return new Suelto(this.peso, this.precio);
        }
        return null;
    }
    public ArrayList<Producto> buscar(Condicion cc){
        ArrayList<Producto> aux = new ArrayList<>();
        if(cc.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

}

