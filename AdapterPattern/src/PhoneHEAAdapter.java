
public class PhoneHEAAdapter implements HouseholdElectricalAppliances{

	private Phone phone;
	
	public PhoneHEAAdapter(Phone phone) {
		this.phone = phone;
	}


	@Override
	public int pluginAndRun() {
		return phone.charge();
	}

}
