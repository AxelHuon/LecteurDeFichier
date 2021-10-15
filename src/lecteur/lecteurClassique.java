package lecteur;
import java.io.*;

public class lecteurClassique extends Lire implements InterfaceLecteur {

	public lecteurClassique(String file) {
		super.file = file;
	}
	
	public void afficher() {
		System.out.println(content);
	}

	public void lire() {
		super.lire(file);		
	}
	
}
