package tpespecial;
import java.util.Vector;

public class Mazo {
	private String nombre;
	private Vector cartas;
	
	public Mazo(String nombre) {
		this.nombre = nombre;
		this.cartas = new Vector<Carta>();
	}
	
	public void addCarta(Carta c1) {
		if(cartas.isEmpty()) {
			System.out.println("primeraCarta");
			this.cartas.add(c1);
		}else {
			if(((Carta) this.cartas.get(0)).comparar(c1)) {
				System.out.println("compara y agrega");
				this.cartas.add(c1);
			}else {
				System.out.println("Carta incompatible");
			}
		}

	}
}
