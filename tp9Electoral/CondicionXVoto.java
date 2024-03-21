package tp9Electoral;

public class CondicionXVoto implements Condicion{
    private Votos cand;

    public CondicionXVoto(Votos c){
        this.cand = c;
    }

    @Override
    public boolean cumple(Votos c) {
       return cand.equals(c);
    }

    
    
}
