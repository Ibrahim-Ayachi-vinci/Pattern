import java.util.HashMap;
import java.util.Map;

public class MagasinLivre extends Magasin{


  @Override
  public Product createProduct(String name, int anneeParution) {
    return new Livre(name, anneeParution);
  }
}
