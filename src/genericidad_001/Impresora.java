package genericidad_001;

public class Impresora <T> {
	
	T tipoQueImprimir;
	
	public Impresora(T tipoQueImprimir) {
		this.tipoQueImprimir=tipoQueImprimir;
	}
	
	public void imprimir() {
		System.out.println(tipoQueImprimir);
	}

}
