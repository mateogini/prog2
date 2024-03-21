package parcialejemplo;

import java.util.ArrayList;

public class Combo extends Producto{
    private Condicion condiciones;
    protected ArrayList<Producto> combos;
    private double descuentoTotal;
    private double descuentoXProd;

    public Combo(Condicion condiciones){
        this.descuentoTotal = 0.5;
        this.descuentoXProd = 0.0114;
        this.combos = new ArrayList<>();
        this.condiciones = condiciones;
    
    }

    public Condicion getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(Condicion condiciones) {
        this.condiciones = condiciones;
    }

    public double getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(double descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public double getDescuentoXProd() {
        return descuentoXProd;
    }

    public void setDescuentoXProd(double descuentoXProd) {
        this.descuentoXProd = descuentoXProd;
    }

    public double getPrecio(){
        double descuento = descuentoXProd * cantProd();
        if(descuento > descuentoTotal){
            descuento = descuentoTotal;
        }
        return sumaPrecio() - sumaPrecio() * descuento;
    }

    public double sumaPrecio(){
        double sumaTotalPrecios = 0.0;
        for(Producto elemento:combos){
            sumaTotalPrecios += elemento.getPrecio();
        }
    return sumaTotalPrecios;
    }

    public ArrayList<String> getCategorias(){
        ArrayList<String> aux = new ArrayList<>();
        for(Producto pp: combos){
            ArrayList<String> cats = pp.getCategorias();
            for(String ss:cats){
                if(!aux.contains(ss)){
                    aux.add(ss);
                }
            }
        }
    return aux;
    }
    
    public void addProducto(Producto pp){
        if(condiciones.cumple(pp)){
            combos.add(pp);
        }
    }

    public int cantProd(){
        int valor = 0;
        for(Producto pp:combos){
             valor += pp.cantProd();
        }
    return valor;
    }

    public double getPeso(){
        int peso = 0;
        for(Producto pp:combos){
            peso+=pp.getPeso();
        }
    return peso;
    }

    public Suelto menorPeso(){
        ArrayList<Suelto> aux = new ArrayList<>();
        int i = 0;
        while(i<combos.size()){
            if(i==0){
                    aux.add(i, combos.get(i).menorPeso());
                }
                if(aux.get(0).getPeso()<combos.get(i).menorPeso().getPeso()){
                    i++;
                }
                else{
                    aux.add(0, combos.get(i).menorPeso());
                    i++;
                }
            }
        return aux.get(0);
    }

    public Producto copiaRestringida(Condicion cc){
        ArrayList<Producto> hijosQueCumplen = new ArrayList<>();
        for(Producto pp:combos){
            Producto copiaHijo = pp.copiaRestringida(cc);
            if(copiaHijo!=null){
                hijosQueCumplen.add(copiaHijo);
            }
        }
        if(hijosQueCumplen.size()>0){
            Combo combo = new Combo(this.condiciones);
            for(Producto pp:hijosQueCumplen){
                combo.addProducto(pp.copiaRestringida(cc));
            }
        return combo;
        }
        else{
            return null;
        }
    }

    public ArrayList<Producto> buscar(Condicion cc){
        ArrayList<Producto> aux = new ArrayList<>();
        for(Producto pp:combos){
            if(cc.cumple(pp)){
                aux.add(pp);
            }
            else{
                aux.addAll(pp.buscar(cc));
            }
        }
        return aux;
    }
    public String toString(){
        return "combo "+ this.getPrecio();
    
    }
}
