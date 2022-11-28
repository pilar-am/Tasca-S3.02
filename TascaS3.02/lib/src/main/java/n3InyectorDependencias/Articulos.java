package n3InyectorDependencias;

public class Articulos {

	
	private String articulo;
	private ConvertidorMoneda convertidor;

	public Articulos(String articulo, ConvertidorMoneda convertidor) {
		this.articulo = articulo;
		this.convertidor = convertidor;
	}
	
	public void mostrarArticulo() {
		convertidor.precioSegunMoneda();
	}

	@Override
	public String toString() {
		return "Articulos [articulo=" + articulo + ", convertidor=" + convertidor + "]";
	}
	
	
}
