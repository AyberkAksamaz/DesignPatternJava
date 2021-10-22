
public class TV implements HouseholdElectricalAppliances{
	private int volt;
	
	public TV() {
		this.volt = 220;
	}

	@Override
	public int pluginAndRun() {
		System.out.println("Tv is runnnninh");
		return volt;
	}
}
