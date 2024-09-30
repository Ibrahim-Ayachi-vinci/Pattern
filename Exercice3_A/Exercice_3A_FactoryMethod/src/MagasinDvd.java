import java.util.HashMap;
import java.util.Map;

public class MagasinDvd extends Magasin{

  @Override
  public Product createProduct(String name, int anneeParution) {
    return new DVD(name,anneeParution);
  }
}
