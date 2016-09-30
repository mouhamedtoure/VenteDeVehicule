package fr.demos.formation.poe.ventevehicules;

public abstract class Vehicule {

	private double prixHT;
	private String options;
	private Modele modele;
	private int annee;
	private Etat etat;
	private String couleur;

	public Vehicule(double prixHT, Modele modele, int annee, Etat etat, String couleur) {
		super();
		this.prixHT = prixHT;
		this.modele = modele;
		this.annee = annee;
		this.etat = etat;
		this.couleur = couleur;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getOptions() {
		return options;
	}

	public Modele getModele() {
		return modele;
	}

	public int getAnnee() {
		return annee;
	}

	public String getCouleur() {
		return couleur;
	}

	public void addOptions(String autreOption) {

		// Possibilite de rentrer une option sans tout resaisir

		// En supposant que le delimiteur est ;

		if (this.options != null) {

			this.options = this.options + ";" + autreOption;

		} else {
			this.options = autreOption;
		}

	}

	public String getEtat() {
		return etat.name();
	}

	@Override
	public String toString() {
		return "Vehicule [prixHT=" + prixHT + ", modele=" + modele + ", annee=" + annee + ", etat=" + etat
				+ ", couleur=" + couleur + "]";
	}
	
	

}
