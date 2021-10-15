package lecteur;
public class LecteurReverse extends Lire implements InterfaceLecteur {

	public LecteurReverse(String file) {
		super.file = file;
	}
	
	public void afficher() {
		for(int i=super.content.length()-1; i>= 0; i--) {
			if(content.charAt(i) != '\n') {
				System.out.print(super.content.charAt(i));
			}
		}
		System.out.println();
	}

	@Override
	public void lire() {
		super.lire(file);
	}


}