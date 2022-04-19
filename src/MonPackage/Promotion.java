package MonPackage;

import java.util.ArrayList;
import java.util.ListIterator;

public class Promotion {
	
	// Declaration des attributs 
	
	private ArrayList<Etudiant> Tab;
	private int NbEtudiants;
	
	// Definition des constructeurs
	
	public Promotion() 
	{
	Tab = new ArrayList<Etudiant>();
	NbEtudiants = 0;
	}
	
	// méthode pour ajouter un étudiant
	
	public void ajouterEtudiant(int nb) {
			for (int i=0; i<nb; i++) {
				Etudiant etudiant = new Etudiant();
				Tab.add(etudiant);
			}
	}
	
	public void supprimerEtudiant(String nomb) {
		String verifNom;
		double moyEtudiant;
		ListIterator it = Tab.listIterator();
		
		while (it.hasNext()) {
			Object Obj = it.next();
			Etudiant unEtudiant = (Etudiant) Obj;
			verifNom = unEtudiant.getNom();
			if (verifNom.equals(nomb)){
				Tab.remove(unEtudiant);
			}
		}
	}
	
	
	public void calculerMoyenne(int nb) {
		double moy = 0;
		ListIterator it = Tab.listIterator();
		
		while (it.hasNext()) {
				Object Obj = it.next();
				Etudiant unEtudiant = (Etudiant) Obj;
				moy = moy + unEtudiant.getMoyenne();
			}
		moy = moy / nb;
		moy = Math.round(moy*100.0)/100.0;
		System.out.println("La moyenne de la promo est de " + moy);
		
	}
	
	
	public void afficherTout() {
		System.out.println("Voici les infos concernant les étudiants de la promotion :");
		System.out.println();
		ListIterator it = Tab.listIterator();
		
		while (it.hasNext()) {
			Object Obj = it.next();
			Etudiant unEtudiant = (Etudiant) Obj;
			unEtudiant.Afficher();
		}
	}
	
	public void modifierMoyenneEleve(String nom) {
		String verifNom;
		double moyEtudiant;
		ListIterator it = Tab.listIterator();
		
		while (it.hasNext()) {
			Object Obj = it.next();
			Etudiant unEtudiant = (Etudiant) Obj;
			verifNom = unEtudiant.getNom();
			moyEtudiant = unEtudiant.getMoyenne();
			if (verifNom.equals(nom)) {
			moyEtudiant = Saisie.lire_double("Veuillez saisir une nouvelle moyenne pour l'étudiant");
			unEtudiant.setMoyenne(moyEtudiant);
			}
		}
	}
}
