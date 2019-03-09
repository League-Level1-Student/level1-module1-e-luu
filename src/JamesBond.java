
public class JamesBond {
	
	public static void main(String[] args) {
		JamesBond james = new JamesBond();
		Vault v = new Vault(7962);
		james.findCode(v);

	}

	public int findCode(Vault v) {

		boolean check = false;
		for (int i = 0; i < 1000000000; i++) {
			if (v.trycode(i)) {

				check = true;

				return i;
			}

		}

		if (check == false) {
			return -1;
		}
		return 0;

	}
}
