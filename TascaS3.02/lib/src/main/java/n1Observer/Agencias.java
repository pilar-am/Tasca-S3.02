package n1Observer;

import java.util.Observable;
import java.util.Observer;

public class Agencias implements Observer{

    private String notificacio;

	@Override
	public void update(Observable o, Object notificacio) {
	
		this.setNotificacions((String) notificacio);
		
	}

	public String getNotificacions() {
		return notificacio;
	}

	public void setNotificacions(String notificacio) {
		this.notificacio = notificacio;
	}

	@Override
	public String toString() {
		return "Agencias notificacio= La borsa " + notificacio ;
	}

	
	
	


}
