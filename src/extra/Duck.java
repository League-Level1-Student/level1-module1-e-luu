package extra;

public class Duck {
	int numofFriends = 0;
	String favoriteFood;

	void quack() {
System.out.println("quack");
	}

	void waddle() {
System.out.println("waddle waddle");
	}

Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numofFriends = numberOfFriends;
}
}
