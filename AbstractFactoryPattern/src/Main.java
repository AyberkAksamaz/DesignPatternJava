
public class Main {

	public static void main(String[] args) {
		AbstractFactory computerFactory = FactoryProducer.getFactory(false);
		Computer computer = computerFactory.getComputer("SmartTv");
		computer.compute();
		
		AbstractFactory computerFactory2 = FactoryProducer.getFactory(true);
		Computer computer2 = computerFactory2.getComputer("Phone");
		computer2.compute();
	}

}
