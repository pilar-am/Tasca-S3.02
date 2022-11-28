package n3InyectorDependencias;

public class Main {

	/*
	 * Dependency Injection
	Dissenya una classe que mostri en pantalla el preu de diversos articles. 
	Ja que haurà de mostrar-los també en diversos tipus de moneda.
	
	Important  Assegura't d'afegir-li com a Injecció de Dependència una 
	classe Convertidor de Moneda que efectuï la correcció del preu en funció del canvi de divisa.
	 */
	
	
	
	public static void main(String[] args) {
		
		Articulos articulo = new Articulos("Laptop", new ConvertidorMoneda(5, "dolar"));
		
		System.out.println(articulo.toString());

	}

}
