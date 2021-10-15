package lecteur;
import java.io.*;

public class LecteurPalindrome extends Lire implements InterfaceLecteur {
	
	
	public LecteurPalindrome(String file) {
		super.file = file;
	}

	@Override
	public void lire() {

        // On teste si mot2 est un palindrôme
        int leftPos = 0;
        int rightPos = super.file.length() - 1;
        boolean palindrome=true;
        while ((leftPos < rightPos) && palindrome) {
            if (super.file.charAt(leftPos) != super.file.charAt(rightPos)) {
                palindrome=false;
            }
            leftPos++;
            rightPos--;
        }

        if (palindrome) {
            System.out.println("C'est un palindrôme !");
        } else {
            System.out.println("Non, ce n'est pas un palindrôme.");
        }
    	
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}
	

}
