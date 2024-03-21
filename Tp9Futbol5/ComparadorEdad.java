package Tp9Futbol5;
import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		// TODO Auto-generated method stub
		return o1.getEdad() - (o2.getEdad());
	}
	

}
