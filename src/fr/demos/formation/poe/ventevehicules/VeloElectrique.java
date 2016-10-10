package fr.demos.formation.poe.ventevehicules;

public class VeloElectrique extends Velo implements Electrique {

	private int autonomie;
	private int tempsCharge;
	private String batterie;
	private double bonus;

	public VeloElectrique(double prixHT, Modele modele, int annee, Etat etat, String couleur) {
		super(prixHT, modele, annee, etat, couleur);
	

		// TODO Auto-generated constructor stub
	
	}

	@Override
	public int getAutonomie() {
		// TODO Auto-generated method stub
		return autonomie;
	}

	@Override
	public int getTempsCharge() {
		// TODO Auto-generated method stub
		return tempsCharge;
	}

	@Override
	public String getTypeBatterie() {
		// TODO Auto-generated method stub
		return batterie;
	}

	@Override
	public double getBonusEcologique() {
		// TODO Auto-generated method stub
		return bonus;
	}

	public String getBatterie() {
		return batterie;
	}

	public void setBatterie(String batterie) {
		this.batterie = batterie;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}

	public void setTempsCharge(int tempsCharge) {
		this.tempsCharge = tempsCharge;
	}
	

}
