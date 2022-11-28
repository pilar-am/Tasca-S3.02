package n2Callback;

import java.util.Scanner;

public class Pagament {

	private Callback cb;
	private String pagament;
	
	
	public Pagament(Callback cb) {
		this.cb = cb;
	}
	
	public void Tarea() {
		
		System.out.println("Elija el método de pago:\n"
							+ "* Tarjeta de crédito\n"
							+ "* Paypal\n"
							+ "* Cuenta bancaria\n");
		
		Scanner entrada = new Scanner(System.in);
		this.pagament = entrada.nextLine();
				
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nHa elegido: "+ this.pagament);
		cb.notificarLlamada();
	}

	public String getPagament() {
		return pagament;
	}

	public void setPagament(String pagament) {
		this.pagament = pagament;
	}
	
	
	
	
	
}
