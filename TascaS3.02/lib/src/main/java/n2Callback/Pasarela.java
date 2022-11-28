package n2Callback;

public class Pasarela implements Callback{
	
	private Pagament pagament = new Pagament(this);

	@Override
	public void notificarLlamada() {
		System.out.println("Gracias por confiar en nosotros");
	}
	
	public void llamarTareaPagament() {
		pagament.Tarea();
	}
}
