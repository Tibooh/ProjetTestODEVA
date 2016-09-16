public class Voiture {

  private Moteur moteur;
  private int nbPlaces;
  private String marque;
  private String modele;
  private String couleur;

  public Voiture(Moteur m,int nbPlaces,String marque,String modele,String couleur) {
    this.moteur = moteur;
    this.nbPlaces = nbPlaces;
    this.marque = marque;
    this.modele = modele;
    this.couleur = couleur;
  }
}
