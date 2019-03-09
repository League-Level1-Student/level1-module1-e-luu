import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Popcorn pop = new Popcorn("pop");
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		String cooktime = JOptionPane.showInputDialog("how long should the popcorn cook? ");
		int cook = Integer.parseInt(cooktime);
		micro.setTime(cook);
		String flavor = JOptionPane.showInputDialog("What is the flavor of popcorn?");
		for (int i = 0; i < 21; i++) {
			pop.applyHeat();
		}
		pop.eat();
	}
}
