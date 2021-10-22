
public class Main {

	public static void main(String[] args) {
		Socket socket = new Socket();
		Iron iron = new Iron();
		TV tv = new TV();
		
		socket.supplyElectricity(iron);
		socket.supplyElectricity(tv);
		Redmi redmi = new Redmi();
		PhoneHEAAdapter adapter = new PhoneHEAAdapter(redmi);
		socket.supplyElectricity(adapter);
		
	}
}
