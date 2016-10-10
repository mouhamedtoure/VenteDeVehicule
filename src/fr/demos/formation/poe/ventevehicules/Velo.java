package fr.demos.formation.poe.ventevehicules;

public class Velo extends Vehicule {

	public Velo(double prixHT, Modele modele, int annee, Etat etat, String couleur) {

		super(prixHT, modele, annee, etat, couleur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Marque= " +this.getModele().getMarque() +"\n" +"Ref= " +this.getModele().getReference();
	}

}
