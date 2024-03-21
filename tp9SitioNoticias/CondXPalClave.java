package tp9SitioNoticias;


public class CondXPalClave implements Condicion{
    private String palabra;

    public CondXPalClave(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia not) {
        return not.getPalabrasClaves().contains(palabra);
    }

 /*   public boolean cumple(Noticia not) {
        for(int i = 0; i < not.palClaves().size(); i++){
            String palabra = not.palClaves().get(i);
            if(palabra.equals(this.palabra)){
            return true;
            }
            }
        return false;
    }
    */



}