
public class Vault {
	int secretcode;
	
	public Vault(int secretcode) {
		this.secretcode= secretcode;
	}
	public static void main(String[] args) {
		Vault v = new Vault(7962);

		boolean answer = v.trycode(7962);
		
	}

	boolean trycode(int num) {
		if (num == secretcode) {
			return true;
		} else {
			return false;
		}
	}

}
