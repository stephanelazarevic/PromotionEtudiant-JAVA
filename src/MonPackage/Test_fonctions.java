package MonPackage;

public class Test_fonctions {

	public static void main(String[] args) {
		
		int nb;
		nb = Saisie.lire_int("Combien d'étudiants souhaitez-vous ajouter ?");
		
		Promotion promo = new Promotion();
		
		promo.ajouterEtudiant(nb);
		
		promo.afficherTout();
		System.out.println();
		
		promo.calculerMoyenne(nb);
		
		String nom;
		System.out.println();
		nom = Saisie.lire_String("Vous allez modifier la moyenne d'un élève. Quel est le nom de l'élève dont vous souhaitez modifier la moyenne ?");
		nom = nom.toLowerCase();
		promo.modifierMoyenneEleve(nom);
		
		promo.afficherTout();
		System.out.println();	
		promo.calculerMoyenne(nb);
		
		// promo.ajouterEtudiant(nb);
		
		String nomb;
		
		nomb= Saisie.lire_String("vous allez supprimer un etudiant veuillez saisir son nom");
		promo.supprimerEtudiant(nomb);
		promo.afficherTout();
		
	}

}
