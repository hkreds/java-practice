package gate.objective;

public class MyCar extends AbstractAutomobile {

	protected MyCar() {
		super(CarType.STANDERD_CAR);
	}

	public int getCapacity() {
		return 7;
	}

	

	@Override
	public String getCarModel() {
		return "自家用ワンボックス車";
	}
	
}
