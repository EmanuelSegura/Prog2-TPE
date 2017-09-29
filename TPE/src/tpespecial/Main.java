package tpespecial;

public class Main {

	public static void main(String[] args) {
		
		Carta c1 = new Carta("minion clasico");
		Carta c2 = new Carta("minion enojado");
		Carta c3 = new Carta("minion cansado");
		
		Atributo a1 = new Atributo("ternura",80.4);
		Atributo a2 = new Atributo("fuerza",20.6);
		Atributo a3 = new Atributo ("velocidad",10.0);
		
		c1.addAtributo(a1);
		c1.addAtributo(a2);
		
		c2.addAtributo(a1);
		
		
		
		Mazo m1 = new Mazo("Mazo de Minions");
		m1.addCarta(c1);
		m1.addCarta(c2);

	}

}
