package tp9Electoral;

import java.time.LocalDate;

public class menu {
    

    public static void main (String args[]){
        Candidato massa = new Candidato("massa", "kichnerista", "union por la patria");
        Candidato milei = new Candidato("Milei", "libertad", "LLA");
        Votos voto1 = new Votos(milei, LocalDate.of(2023, 10, 22));
        Votos voto2 = new Votos(massa, LocalDate.of(2023, 10, 22));


        Mesa mesa1 = new Mesa();
        mesa1.addPadron(45460217);
        Mesa mesa2 = new Mesa();
        mesa2.addPadron(45460217);


        mesa1.addVoto(voto1, 45460217);
        mesa1.addVoto(voto2,45460217);

        mesa2.addVoto(voto2, 45460217); 


        Condicion votoA = new CondicionXVoto(voto2);

        Lugar tandil = new Lugar("tandil");  
        Lugar vela = new Lugar("vela");
        Lugar gardey = new Lugar("gardey");
        gardey.addMesa(mesa1);
        tandil.addLugar(vela);
        vela.addMesa(mesa1);
        tandil.addLugar(gardey);

        System.out.println(tandil.cantVotos(votoA));

    }
}
