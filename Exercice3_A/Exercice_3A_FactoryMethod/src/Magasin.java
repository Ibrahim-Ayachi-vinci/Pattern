import java.util.HashMap;
import java.util.Map;


public abstract class Magasin {
	private Map<String,Product> bac= new HashMap<String,Product>();
	public void ajouterProduct(String name, int anneeDeParution){
		Product product= createProduct(name,anneeDeParution);
		bac.put(name, product);

	}
	public Product retourneProduct(String name){
		return bac.get(name);
	}

	public abstract Product createProduct(String name, int anneeParution);
}

