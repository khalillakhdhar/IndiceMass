package calculeMass;

public class Personne {
	
	private String nom;
	private double poids,taille;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public Personne(String nom, double poids, double taille) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.taille = taille;
	}
	public int imc()
	{
		return  (int) Math.round(this.poids/(Math.pow(taille,2)));
	}
	
	public String interpretation()
	{
		int index=imc();
		if(index<20)
		{
			return "maigre";
		}
		else if(index<=25)
		{
			return "idéal";
		}
		else
		{
			return "surpoid";
		}
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", poids=" + poids + ", taille=" + taille + ", indice de masse= " + imc()
				+ ", interpretation: " + interpretation() + "]";
	}
	

}
