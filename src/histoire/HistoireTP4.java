package histoire;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		System.out.println(prof.getNom());
		System.out.println(prof.getArgent());
	}

}
