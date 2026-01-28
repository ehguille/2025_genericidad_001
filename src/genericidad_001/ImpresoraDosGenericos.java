package genericidad_001;

public class ImpresoraDosGenericos<T, V> {
	
	T unaCosa;
	V otraCosa;
	
	public ImpresoraDosGenericos(T unaCosa, V otraCosa) {
		this.unaCosa=unaCosa;
		this.otraCosa=otraCosa;
	}
	
	public void imprimir() {
		System.out.println(unaCosa);
		System.out.println(otraCosa);
	}

}
