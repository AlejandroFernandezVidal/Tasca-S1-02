package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comentar la creación de objetos para obtener el mensaje de VendaBuidaException.
		Venda listaProductos = new Venda();
		Producte productos0 = new Producte("Patatas",1.20);
		listaProductos.getProductes().add(productos0);
		Producte productos1 = new Producte("Zumo",1.50);
		listaProductos.getProductes().add(productos1);
		Producte productos2 = new Producte("Galletas", 2.50);
		listaProductos.getProductes().add(productos2);
		
		System.out.println(productos0.getNom());
		System.out.println(productos1.getNom());
		System.out.println(productos2.getNom());
		System.out.println(productos0.getPreu());
		System.out.println(productos1.getPreu());
		System.out.println(productos2.getPreu());
		
		listaProductos.calcularTotal();
		
		//for para recorrer la ArrayList y capturar el IndexOutOfBoundsException.
		try {
			for (int i = 0; i <= listaProductos.getProductes().size(); i++) {
				System.out.println(listaProductos.getProductes().get(i).getNom());
				}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Excede del tamaño de la ArrayList");
		}
	}
}