package tp9Electoral;

import java.time.LocalDate;

public class  Votos{
    private Candidato c;
    private LocalDate fVoto;
    public Votos(Candidato c, LocalDate fVoto) {
        this.c = c;
        this.fVoto = fVoto;
    }
    public Candidato getC() {
        return c;
    }
    public void setC(Candidato c) {
        this.c = c;
    }
    public LocalDate getfVoto() {
        return fVoto;
    }
    public void setfVoto(LocalDate fVoto) {
        this.fVoto = fVoto;
    }
    public String toString(){
    return " " + c;
    }

    public boolean equals(Votos v){
    return this.c.equals(v.c);
    }
}
