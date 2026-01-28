package genericidad_001;

//Puede usarse T extends Interfaz, o T extends Interfaz & Clase
public class ImpresoraDeAnimales <T extends Animal> {
	
	T animalParaImprimir;
	
	public ImpresoraDeAnimales(T animalParaImprimir) {
		this.animalParaImprimir=animalParaImprimir;
	}
	
	public void imprimir() {
		animalParaImprimir.hablar();
	}

}
