
public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("minato");
		h.setHp(100);
		System.out.println("勇者" + h.getName() + "を生み出した");

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';


		h.sit(5);
		//h.slip();
		//h.sit(25);
		m1.run();
		m2.run();
		h.run();
	}

}
