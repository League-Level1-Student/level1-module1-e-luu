
public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		RaceCar race = new RaceCar("toyota", 5);
		// 1. Create a RaceCar and place it in 5th position

		// 2. Print the RaceCar's position in the race
		System.out.println(race.getPositionInRace());
		// 3. Crash the RaceCar
		race.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (race.damaged == true) {
			race.pit();
		}
		// 5. Help the car move into first place.
		for (int i = 0; i < 7; i++) {
			race.overtake();
		}
	}

	private static void RaceCar(String brand, int positionInRace) {
		// TODO Auto-generated method stub

	}

}
