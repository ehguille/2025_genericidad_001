package genericidad_001;

/**
 * Ejemplos extraídos de https://www.youtube.com/watch?v=K1iu1kXkVoA
 */
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
		
		ImpresoraDosGenericos<String, Integer> impresoraDoble=new ImpresoraDosGenericos<>("Hola",33);
		impresoraDoble.imprimir();
		
		ImpresoraDosGenericos<Integer, String> otraImpresoraDoble=new ImpresoraDosGenericos<>(33,"Hola");
		otraImpresoraDoble.imprimir();
		
		// La genericidad no funciona con tipos simples (int, double, ...).
		//Impresora<int> impresoraQueNoImprime = new Impresora<67>;
		
		ImpresoraDeAnimales<Animal> impresoraDeAnimales = new ImpresoraDeAnimales<>(new Gato());
		impresoraDeAnimales.imprimir();
		
		imprimir("Hola");
		imprimir(44);
		
		imprimir("Adios",44);
		
		hacerHablar(new Gato());
		hacerHablar(new Perro());
		
		String devuelve=devolverLoMismo("Hola");
		
		arreglar(impresoraGenerica);
		
	}
	
	public <T> void imprimir(T queImprimir) {
		System.out.println(queImprimir);
	}
	
	public <T, V> void imprimir(T unaCosa, V otraCosa) {
		System.out.println(unaCosa);
		System.out.println(otraCosa);
	}

	public <T extends Animal> void hacerHablar(T animal) {
		animal.hablar();
	}
	
	public <T> T devolverLoMismo(T queDevolver) {
		return queDevolver;
	}
	
	public void arreglar(Impresora<?> impresora) {
		System.out.println("Impresora arreglada");
	}
		
	public static void main(String[] args) {
		new Aplicacion();
	}
}