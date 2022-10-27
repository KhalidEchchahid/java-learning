package tp1;

public class Avion {
	
		int Id = 1 ;
		String Marque ;
		double Vitesse ;
		double Puissance ;

		
		public Avion(String Marque , double Vitesse , double Puissance) {
			 this.Id = Id++ ;
			this.Marque = Marque ;
			this.Vitesse = Vitesse ;
			this.Puissance = Puissance ;
		}
		
		void afficher () {
			System.out.println("Id : " + Id);
			System.out.println("Marque : " + Marque);
			System.out.println("Vitesse : " + Vitesse);
			System.out.println("Puissance : " + Puissance);
		}
		
	 
}
