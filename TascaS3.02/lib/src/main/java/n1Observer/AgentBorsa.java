package n1Observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class AgentBorsa extends Observable{

	private String notificacio;

	
	//notificaci� ser� "puja" o "baixa"
    public void setNotificacions(String notificacio) {
        this.notificacio = notificacio;
        setChanged();
        notifyObservers(notificacio);
    }

	
	
	
	
}
