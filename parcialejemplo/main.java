package parcialejemplo;

public class main {
    public static void main(String []args){
        Suelto suelto = new Suelto(25.5, 300);
        Suelto suelto1 = new Suelto(26.2, 300);
        Suelto suelto2 = new Suelto(29.5, 300);
        Condicion XPeso = new CondicionXPeso(20.5);
        Condicion XPrecio = new CondicionXPrecio(2);

        Combo combo1 = new Combo(XPeso);
        Combo combo2 = new Combo(XPeso);


        combo1.addProducto(suelto);
        combo1.addProducto(suelto1);
        combo1.addProducto(suelto2);

        combo2.addProducto(combo1);

        
        Combo express = new ComboPromocional(XPeso);
        express.addProducto(suelto);
        express.addProducto(suelto2);


        System.out.println(express.getDescuentoTotal());
        
    }
}
