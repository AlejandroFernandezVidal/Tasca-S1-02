package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comentar la creación de objetos para obtener el mensaje de VendaBuidaException.
		Producte productos = new Producte("Patatas",1.20);
		Venda.productes.add(productos);
		Producte productos1 = new Producte("Zumo",1.50);
		Venda.productes.add(productos1);
		Producte productos2 = new Producte("Galletas", 2.50);
		Venda.productes.add(productos2);
		
		System.out.println(productos.getNom());
		System.out.println(productos1.getNom());
		System.out.println(productos2.getNom());
		System.out.println(productos.getPreu());
		System.out.println(productos1.getPreu());
		System.out.println(productos2.getPreu());
		
		Venda.calcularTotal();
		
		//for para recorrer la ArrayList y capturar el IndexOutOfBoundsException.
		try {
			for (int i = 0; i <= Venda.productes.size(); i++) {
				System.out.println(Venda.productes.get(i).getNom());
				}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Excede del tamaño de la ArrayList");
		}
	}
}