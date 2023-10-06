//raccolgo, cerco di capire la lunghezza massima, e il numero di spazi lo calcolo con lunghezza stringa massima - lunghezza stringa attuale, questo è il numero di spazi

//quando leggiamo dal flusso di ingresso possiamo segnalare al terminale la terminazione del flusso "CTRL-D". 
//scanner fatto per leggere stringhe hasNext per leggere le stringhe, next per leggere la stringa! 
//scanner in grado anche di fare conversioni 
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Soluzione{
	public static void main(String[] args){
		try (Scanner s = new Scanner(System.in)){
			List<String> parole = new ArrayList<>();
			int maxLen = 0; 
			while(s.hasNext()){
				String parola = s.next();

				if(parola.length() > maxLen) maxLen = parola.length();
				parole.add(parola);
			}
			for(String parola : parole){
				int spazi = maxLen - parola.length();
				while(spazi-- > 0 ) System.out.print(" ");
				System.out.println(parola);
			}
		}
	}
}