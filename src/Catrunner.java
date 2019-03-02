
public class Catrunner {
	public static void main(String[] args) {
		Cat cat = new Cat("Kat");
		cat.meow();
		cat.printName();
		for (int i = 0; i < 9; i++) {
			cat.kill();
		}
	}
}
