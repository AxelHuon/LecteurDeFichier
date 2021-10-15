package lecteur;

public class Main
{

		public static void main(String[] args){
			
			InterfaceLecteur FichierClassique = new lecteurClassique("fichier.txt");
			FichierClassique.lire();
			FichierClassique.afficher();
			System.out.println();
	
			
			InterfaceLecteur FichierReverse = new LecteurReverse("fichier.txt");
			FichierReverse.lire();
			FichierReverse.afficher();
			System.out.println();
			
			
			InterfaceLecteur VerifPalindrome = new LecteurPalindrome("fichier.txt");
			VerifPalindrome.lire();
			VerifPalindrome.afficher();
			System.out.println();
			
		
		}
		
		
		
		
		
}