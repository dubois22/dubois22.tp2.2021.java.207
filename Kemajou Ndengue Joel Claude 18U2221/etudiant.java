import java.util.*;
import java.io.*;


class etudiant{


	public static void main(String[] args) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (isr);


		System.out.println("\n\nentrer le nombre d'eleve");
		int total = sc.nextInt();

		int i;
		int som = 0;
		int sup = 0;
		int inf = 0;
		float moy = 0;

		String [] nom = new String [total+1];
		int [] note = new int [total+1];

		for (i = 1; i <= total; i++ ) {
			System.out.println("\n\nentrer le NOM de l'etudiant numero "+i);
			nom[i] = br.readLine();

			System.out.println("entrer le NOTE de l'etudiant "+nom[i]);
			note[i] = sc.nextInt();


			som = som + note[i];

			

			if (note[i] >= sup) {
				sup = note[i];
			}

			if (i == 1) {
				inf = note[i];
			}

			if (note[i] <= inf) {
				inf = note[i];
			}

		}


		moy = som / total;
		System.out.println("\n\n\tmoyenne de la classe : "+moy);


		System.out.println("\n\t etudiant ayant la meilleur note \n");

		for (i = 1; i <= total ; i++ ) {
			
			if (note[i] == sup) {
				System.out.println("nom : "+nom[i]+"\n note : "+note[i]+"\n");
			}
		}


		System.out.println("\n\t etudiant ayant la plus faible note \n");

		for (i = 1; i <= total ; i++ ) {
			
			if (note[i] == inf) {
				System.out.println("nom : "+nom[i]+"\n note : "+note[i]+"\n");
			}
		}	



		System.out.println("\n\t etudiant ayant une note en dessous de la moyenne \n");

		for (i = 1; i <= total ; i++ ) {
			
			if (note[i] < moy) {
				System.out.println("nom : "+nom[i]+"\n note : "+note[i]+"\n");
			}
		}
		

	
	}

}