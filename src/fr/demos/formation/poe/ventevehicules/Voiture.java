package fr.demos.formation.poe.ventevehicules;

public class Voiture extends VehiculeMoteur {

	private int kilometrage;
	private String immatriculation;
	private String puissance;

	public Voiture(double prixHT, Modele modele, int annee, Etat etat, String couleur, String immatriculation) {

		super(prixHT, modele, annee, etat, couleur);
		// TODO Auto-generated constructor stub

		this.immatriculation = immatriculation;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		if (immatriculation == null) {
			if (other.immatriculation != null)
				return false;
		} else if (!immatriculation.equals(other.immatriculation))
			return false;
		if (kilometrage != other.kilometrage)
			return false;
		 return true;
	
	}
	

}
