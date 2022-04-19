package MonPackage;

public class Etudiant 
{
	
	// d�claration des attributs
	
	private String Nom; 
	private String DateNaissance;
	private double Moyenne;
	
	// M�thode Constructeur
	
	public Etudiant()
	{
		Nom = Saisie.lire_String("Quel est le nom de l'�tudiant");
		Nom = Nom.toLowerCase();
		DateNaissance = Saisie.lire_String("Quelle est la date de naissance de l'�tudiant");
		Moyenne = Saisie.lire_double("Quelle est la moyenne de l'�tudiant ?");
		
	}
	// Surcharger le constructeur
	
	public Etudiant (String NomSaisi, String DateNaisaisi, double MoySaisie)
	{
	  
	   Nom = NomSaisi;
	   DateNaissance = DateNaisaisi;
	   Moyenne = MoySaisie;
	}
	
	
	// M�thodes accesseurs
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public double getMoyenne() {
		return Moyenne;
	}
	public void setMoyenne(double moyenne) {
		Moyenne = moyenne;
	}
	
	// Autres m�thodes
	
	public void Afficher() {
		System.out.println("L'�tudiant " + Nom + " qui est n� le " + DateNaissance + " a une moyenne de " + Moyenne);
	}
	
	public void ModifierMoyenne(double NouvelleMoyenne) {
		Moyenne = NouvelleMoyenne;
		
	}
	
	public void SaisirEtudiant() {
		String NomBis, DateNaisBis;
		double MoyBis;
		NomBis = Saisie.lire_String("Veuillez saisir le nom de l'�tudiant :");
		DateNaisBis = Saisie.lire_String("La date de naissance de l'�tudiant :");
		MoyBis = Saisie.lire_double("Quelle est la moyenne de ce dernier ?");
	}
	
	
}
