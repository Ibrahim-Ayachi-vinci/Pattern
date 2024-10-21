public class Main {

  public static void main(String[] args) {

    Album album = new Album.AlbumBuilder("Londerism", "Tame")
        .paysArtiste("Australie").anneeParution(2012).genre("indie rock").build();

    System.out.println(album);

  }
}