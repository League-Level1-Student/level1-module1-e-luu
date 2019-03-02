package extra;

public class Platypus {
	private String name;

	public Platypus(String names) {
		name = names;
	}

	public String getName() {
		return name;
	}

	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
}
