
public class Redmi implements Phone{

	private int volt;
	
	public Redmi() {
		this.volt = 5;
	}
	
	@Override
	public int charge() {
		System.out.println("Redmi phone is running..");
		return volt;
	}

}
