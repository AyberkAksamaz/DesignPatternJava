
public class Socket {

	public void supplyElectricity(HouseholdElectricalAppliances appliances) {
		int volt = appliances.pluginAndRun();
		System.out.println("get " + volt + " from socket");
	}
}
