
public class Iron implements HouseholdElectricalAppliances{

	private int volt;
	
	public Iron() {
		this.volt = 220;
	}

	@Override
	public int pluginAndRun() {
		System.out.println("Iron is runnnninh");
		return volt;
	}
}
