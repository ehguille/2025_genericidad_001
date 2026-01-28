package genericidad_001;

public class Aplicacion {

	public Aplicacion() {
		ImpresoraDeEnteros impresora = new ImpresoraDeEnteros(24);
		impresora.imprimir();
		
		ImpresoraDeDobles otraImpresora = new ImpresoraDeDobles(22.0);
		otraImpresora.imprimir();
		
		Impresora<String> impresoraGenerica = new Impresora<>("¡Hola!");
		impresoraGenerica.imprimir();
		
		Impresora<Double> otraImpresoraGenerica = new Impresora<>(27.4);
		otraImpresoraGenerica.imprimir();
		
		// La genericidad no funciona con tipos simples (int, double, ...).
		//Impresora<int> impresoraQueNoImprime = new Impresora<67>;
	}
	
	public static void main(String[] args) {
		new Aplicacion();
	}
}