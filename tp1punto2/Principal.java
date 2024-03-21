package tp1punto2;

public class Principal {

	public static void main(String[] args) {
			Electrodomestico a = new Electrodomestico("n");
			Electrodomestico b = new Electrodomestico("n", 200, 100, 200);

			
			//System.out.println(b.bajoConsumo());
			System.out.println(b.balance());
			System.out.println(b.altaGama());


		}


}
