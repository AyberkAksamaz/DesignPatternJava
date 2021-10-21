
public class ComputerFactory extends AbstractFactory{
	public Computer getComputer(String computerType) {
		if(computerType.equalsIgnoreCase("Laptop")) {
			return new Laptop();
		} else if(computerType.equalsIgnoreCase("Phone")) {
			return new Phone();
		} else if(computerType.equalsIgnoreCase("SmartTv")) {
			return new SmartTv();
		}
		return null;
	}
}
