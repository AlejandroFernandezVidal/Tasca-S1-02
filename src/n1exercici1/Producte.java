package n1exercici1;

public class Producte {
	//Atributos
	private String nom;
	private double preu;
	
	//Constructor
	public Producte(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	//Getter
	public String getNom() {
		return this.nom;
	}
	public double getPreu() {
		return this.preu;
	}
	
	//Setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPreu(double preu) {
		this.preu = preu;
	}
}