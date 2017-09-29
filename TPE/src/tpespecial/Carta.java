package tpespecial;
import java.util.Vector;

public class Carta {
	
	private String nombrePersonaje;
	private Vector atributos;
	

	public Carta(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
		this.atributos = new Vector<Atributo>();
	}
	
	public void addAtributo(Atributo a1) {
		this.atributos.add(a1);
	}

	public String getNombrePersonaje() {
		return nombrePersonaje;
	}


	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}


	public Vector getAtributos() { //devuelve copia
		Vector aux = new Vector<Atributo>();
		aux = this.atributos;
		return aux;
	}

	
	public boolean comparar(Carta c1) {
		boolean result=false;
		if(this.atributos.size() == c1.getAtributos().size()) {
			for(int i = 0;i < this.atributos.size();i++) {
				Atributo a1 = (Atributo) this.atributos.get(i);
				for(int j=0; j<this.atributos.size();j++) {
					if(a1.esIgual((Atributo) c1.getAtributos().get(j))) {
						result = true;
					}else {
						return false;
					}
				}
			}
		}
		return result;
	};
	
}
