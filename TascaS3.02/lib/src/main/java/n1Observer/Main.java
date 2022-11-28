package n1Observer;

public class Main {

	public static void main(String[] args) {
		/*
		 * Observer
		Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers) 
		canvis quan la Borsa puja o baixa.

    	És necessari que l'objecte Observable mantingui referències als Observers.

		 */

		AgentBorsa observable = new AgentBorsa();
		Agencias observer1 = new Agencias();
		Agencias observer2 = new Agencias();
		
		
		observable.addObserver(observer1);
		observable.setNotificacions("PUJA!!!");
		
		
		System.out.println(observer1.toString());
		
		observable.addObserver(observer2);
		observable.setNotificacions("BAIXA!!!");
		
		System.out.println("\n" + observer1.toString());
		
	}

}
