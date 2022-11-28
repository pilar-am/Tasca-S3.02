package n3InyectorDependencias;

public class Main {

	/*
	 * Dependency Injection
	Dissenya una classe que mostri en pantalla el preu de diversos articles. 
	Ja que haur� de mostrar-los tamb� en diversos tipus de moneda.
	
	Important  Assegura't d'afegir-li com a Injecci� de Depend�ncia una 
	classe Convertidor de Moneda que efectu� la correcci� del preu en funci� del canvi de divisa.
	 */
	
	
	
	public static void main(String[] args) {
		
		Articulos articulo = new Articulos("Laptop", new ConvertidorMoneda(5, "dolar"));
		
		System.out.println(articulo.toString());

	}

}
