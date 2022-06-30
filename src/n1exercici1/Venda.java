package n1exercici1;

import java.util.ArrayList;

public class Venda {
	//Atributos
	private double precioTotal;
	static ArrayList<Producte> productes = new ArrayList <Producte>();

	//Constructor
	public Venda(double precioTotal, ArrayList<Producte> productes) {
		this.precioTotal = precioTotal;
		Venda.productes = productes;
	}
	
	//Getter
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public ArrayList<Producte> getProductes() {
		return Venda.productes;
	}
		
	//Setter
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public void setProductes(ArrayList<Producte> productes) {
		Venda.productes = productes;
	}

	
	public static void calcularTotal() /*throws VendaBuidaException*/ {
		double precioTotal = 0;

		try {
			if (productes.size() > 0) {
				for(Producte producte : productes) {
				precioTotal += producte.getPreu();
				}
				//Comprobar si añade los precios
				System.out.println(precioTotal);
		
			}else {
			throw new VendaBuidaException ("Per fer una venda primer has d’afegir productes");
			}
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
	}
}