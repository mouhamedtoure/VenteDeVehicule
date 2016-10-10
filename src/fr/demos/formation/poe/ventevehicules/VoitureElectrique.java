package fr.demos.formation.poe.ventevehicules;

public class VoitureElectrique extends Voiture implements Electrique {

	public VoitureElectrique(double prixHT, Modele modele, int annee, Etat etat, String couleur,
			String immatriculation) {
		super(prixHT, modele, annee, etat, couleur, immatriculation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAutonomie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTempsCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTypeBatterie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBonusEcologique() {
		// TODO Auto-generated method stub
		return 0;
	}

}
