public class Album {

  private final String titre;
  private final String nomArtiste;
  private final String label;
  private final String producteur;
  private final String paysArtiste;
  private final String version;
  private final String genre;
  private final int anneeParution;
  private final boolean estRemasterisee;
  private final int anneeParutionOriginale;
  private final double debitQualiteStandard;
  private final double debitQualiteAbonnee;
  public Album(AlbumBuilder albumBuilder) {
    this.titre = albumBuilder.titre;
    this.nomArtiste = albumBuilder.nomArtiste;
    this.label = albumBuilder.label;
    this.producteur = albumBuilder.producteur;
    this.paysArtiste = albumBuilder.paysArtiste;
    this.version = albumBuilder.version;
    this.genre = albumBuilder.genre;
    this.anneeParution = albumBuilder.anneeParution;
    this.estRemasterisee = albumBuilder.estRemasterisee;
    this.anneeParutionOriginale = albumBuilder.anneeParutionOriginale;
    this.debitQualiteStandard = albumBuilder.debitQualiteStandard;
    this.debitQualiteAbonnee = albumBuilder.debitQualiteAbonnee;
  }


  public String getTitre() {
    return titre;
  }

  public String getNomArtiste() {
    return nomArtiste;
  }

  public String getLabel() {
    return label;
  }

  public String getProducteur() {
    return producteur;
  }

  public String getPaysArtiste() {
    return paysArtiste;
  }

  public String getVersion() {
    return version;
  }

  public String getGenre() {
    return genre;
  }

  public int getAnneeParution() {
    return anneeParution;
  }

  public boolean isEstRemasterisee() {
    return estRemasterisee;
  }

  public int getAnneeParutionOriginale() {
    return anneeParutionOriginale;
  }

  public double getDebitQualiteStandard() {
    return debitQualiteStandard;
  }

  public double getDebitQualiteAbonnee() {
    return debitQualiteAbonnee;
  }

  @Override
  public String toString() {
    return "Album{" +
        "titre='" + titre + '\'' +
        ", nomArtiste='" + nomArtiste + '\'' +
        ", label='" + label + '\'' +
        ", producteur='" + producteur + '\'' +
        ", paysArtiste='" + paysArtiste + '\'' +
        ", version='" + version + '\'' +
        ", genre='" + genre + '\'' +
        ", anneeParution=" + anneeParution +
        ", estRemasterisee=" + estRemasterisee +
        ", anneeParutionOriginale=" + anneeParutionOriginale +
        ", debitQualiteStandard=" + debitQualiteStandard +
        ", debitQualiteAbonnee=" + debitQualiteAbonnee +
        '}';
  }

  public static class AlbumBuilder{
    private final String titre;
    private final String nomArtiste;
    private String label;
    private String producteur;
    private String paysArtiste;
    private String version;
    private String genre;
    private int anneeParution;
    private boolean estRemasterisee;
    private int anneeParutionOriginale;
    private double debitQualiteStandard;
    private double debitQualiteAbonnee;


    public AlbumBuilder(String titre, String nomArtiste){
      this.titre = titre;
      this.nomArtiste = nomArtiste;
    }

    public AlbumBuilder label(String label){
      this.label = label;
      return this;
    }

    public AlbumBuilder producteur(String producteur){
      this.producteur = producteur;
      return this;
    }

    public AlbumBuilder paysArtiste(String paysArtiste){
      this.paysArtiste = paysArtiste;
      return this;
    }

    public AlbumBuilder version(String version){
      this.version = version;
      return this;
    }

    public AlbumBuilder genre(String genre){
      this.genre = genre;
      return this;
    }

    public AlbumBuilder anneeParution(int anneeParution){
      this.anneeParution = anneeParution;
      return this;
    }

    public AlbumBuilder estRemasteriser(boolean estRemasterisee){
      this.estRemasterisee = estRemasterisee;
      return this;
    }

    public AlbumBuilder anneeParutionOriginale(int anneeParutionOriginale){
      this.anneeParutionOriginale = anneeParutionOriginale;
      return this;
    }

    public AlbumBuilder debitQualiteStandard(double debitQualiteStandard){
      this.debitQualiteStandard = debitQualiteStandard;
      return this;
    }

    public AlbumBuilder debitQualiteAbonnee(double debitQualiteAbonnee){
      this.debitQualiteAbonnee = debitQualiteAbonnee;
      return this;
    }

    public Album build(){
      return new Album(this);
    }

  }


}
