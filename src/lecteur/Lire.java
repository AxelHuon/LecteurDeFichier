package lecteur;
import java.io.*;

public class Lire {
	
	protected String file;
	protected String content = "";
	
	public void lire(String file) {
		FileInputStream in = null;
		File f = new File(file);
		if(file.indexOf("txt") != -1) {
			try {
				in = new FileInputStream(f);			
				int content;
				while ((content = in.read()) != -1) {
					// Convertir le numéro en une lettre
					this.content += (char)content;
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if (in != null)
						in.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}else {
			System.out.println("Le format du fichier n'est pas bon");
		}
	
	}	
	
}