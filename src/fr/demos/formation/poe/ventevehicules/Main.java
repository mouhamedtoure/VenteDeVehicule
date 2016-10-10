package fr.demos.formation.poe.ventevehicules;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VeloElectrique ve1= new VeloElectrique(500,new Modele("btwin","b500"), 2010, Etat.BON, "rouge") ;
		ve1.setAutonomie(300);
		
		Velo v1= new Velo(300,new Modele("decathlon","d800"), 2005, Etat.MAUVAIS, "bleu") ;
		
//	
//		v.setBatterie("vp120");
//		v.setBonus(100);
//		v.setOptions(options);
//		v.setPrixHT(prixHT);
//		v.setTempsCharge(tempsCharge);
		
	
// Essai de Hashmap		
		
		HashMap<String,Voiture> listeVoitures= new HashMap<>();
		
  		Voiture vo1=new Voiture(9000, new Modele("peugeot","206"), 2005, Etat.MAUVAIS, "rouge", "AC285BC");
  		Voiture vo2=new Voiture(15000, new Modele("reneault","laguna"), 2001, Etat.BON, "rouge", "KI166PM");
  		Voiture vo3=new Voiture(30000, new Modele("Dacia","steway"), 2010, Etat.NEUF, "rouge", "LN512JK");
  		
  		listeVoitures.put(vo1.getImmatriculation(), vo1);
  		listeVoitures.put(vo2.getImmatriculation(), vo2);
  		listeVoitures.put(vo3.getImmatriculation(), vo3);
  		
  		
  		Voiture vo4= listeVoitures.get("AC285BC");
  		
  		System.out.println(vo4);
  		
  		System.out.println(listeVoitures);
  		
  		// Je cree un garage de velo
  		
  		Garage<Velo> garage = new Garage<>("Vente de velos");
  		
  		garage.ajouter(ve1);
  		garage.ajouter(v1);
  		
  		for(Velo v:garage){
  			System.out.println(v);
  		}
  		
  		
  		
	}
 		
  		
}