package n3InyectorDependencias;

public class ConvertidorMoneda {

	private static final double DOLAR = 1.04;
	private static final double LIBRA = 0.86;
	private static final double CORONA_SUECA = 10.89;
	
	
	private double precio;
	private String moneda;
	
	
	public ConvertidorMoneda(double precio, String moneda) {
		this.precio = precio;
		this.moneda = moneda;
		precioSegunMoneda();
	}
	
	public void precioSegunMoneda() {
		
		if (moneda.equalsIgnoreCase("euro")) {
			this.precio=this.precio;
		}
		
		if (moneda.equalsIgnoreCase("dolar")) {
			this.precio=this.precio * DOLAR;
		}
		
		if (moneda.equalsIgnoreCase("libra")) {
			this.precio=this.precio * LIBRA;
		}
		
		if (moneda.equalsIgnoreCase("Corona sueca")) {
			this.precio=this.precio * CORONA_SUECA;
		}
		
		
		
	}


	
	
	
	@Override
	public String toString() {
		return "ConvertidorMoneda [precio=" + precio + ", moneda=" + moneda + "]";
	}

	public static void main(String[] args) {
		
		ConvertidorMoneda convertidor = new ConvertidorMoneda(5, "libra");
		
		System.out.println(convertidor.toString());
		convertidor.precioSegunMoneda();
		System.out.println(convertidor.toString());
		
	}
	
	
	
	
}
