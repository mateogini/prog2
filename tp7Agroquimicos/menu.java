package tp7Agroquimicos;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa empre1 = new Empresa();
		Quimico quimico1 = new Quimico("QuimicoContiene");
		Quimico quimico2 = new Quimico("QuimicoNo");

		Elemento cultivo = new Elemento("maiz");
		Elemento cultivo2 = new Elemento ("cevada");
		
		Elemento enfermedad = new Elemento("cochinilla");
		Elemento enfermedad2 = new Elemento ("trikinozis");
		
		Elemento estadoATratar = new Elemento ("hojas rotas");
		Elemento estadoATratar2 = new Elemento ("secadura");
		Elemento estadoATratar3 = new Elemento ("caida de hojas");
		
		// agregga quimicos a la empresa
		empre1.addQ(quimico2);
		empre1.addQ(quimico1);
		// agrefa estados a tratrar a una enfermedad
		enfermedad.addEst(estadoATratar2);
		enfermedad.addEst(estadoATratar);
		
		enfermedad2.addEst(estadoATratar3);
		
		// agrega enfermedades que lo afectan
		cultivo.addEst(enfermedad2);
		// agrega estados y cultivos NO admitidos al quimico
		quimico1.addCult(cultivo2);
		quimico1.addEst(estadoATratar2);
		quimico1.addEst(estadoATratar);
		
		quimico2.addEst(estadoATratar3);

		
	
		System.out.println(empre1.puedeTratar(enfermedad2));
		
		
		System.out.println(empre1.puedeTratarEyC(enfermedad, cultivo));
		
		
		
	}

}
