package tp6Computos;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[]args) {
		CantMemoria pc1 = new CantMemoria(200, "pc1");
		CantMemoria pc2 = new CantMemoria(300, "pc2");
		CantMemoria pc3 = new CantMemoria(400, "pc3");
		
		
		pc1.add(pc1);
		pc1.add(pc2);

		pc1.add(pc3);
		System.out.println(pc1);

		
		
		
	}

}
