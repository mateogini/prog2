package tp5CooperativaAgricultores;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Lote lote2 = new Lote(50, false);
		lote2.addMineral("calcio");
		lote2.addMineral("calcho");
		
		
		Cereal trigo = new Cereal("Cosecha Fina", "Trigo");
		
		trigo.addMineral("calcho");
		trigo.addMineral("calcio");
		
		
		
		Pastura pastura = new Pastura ("Pastura","alfalfa");
		
		pastura.addMineral("calcio");
		
		// pregunta si un lote acepta dicho cereal;
		System.out.println(lote2.siembra(trigo));
		
		
		// pregunta si un cereal puede sembrarse dicho lote;
		System.out.println(trigo.sembrarse(lote2));
		
		
		// pregunta si la pastura puede sembrarse en dicho lote;
		System.out.println(pastura.sembrarse(lote2));
		
		lote2.setEspecial(true);
		
		System.out.println(lote2.isEspecial());
		
		
	}

}
