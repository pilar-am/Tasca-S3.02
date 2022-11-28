package n2Callback;

public class BotigaSabates {

	public static void main(String[] args) {
		
		/*
		 * Callback
		Simula una passarel�la de pagament que rebi un objecte encapsulador del m�tode de pagament a efectuar: 
		targeta de cr�dit, Paypal o deute en compte bancari.

    	La passarel�la invocar� el pagament sense con�ixer la forma i retornant el control a la classe d'origen.
    	La classe que invoca la passarel�la de pagament ser� una botiga de sabates.
		 */
				
		Pasarela pasarela = new Pasarela();
			
		pasarela.llamarTareaPagament();
		
	}
}
