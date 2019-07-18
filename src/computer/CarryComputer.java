package computer;

public class CarryComputer implements Runnable{
	private Computer computer;

	public CarryComputer(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				computer.carryComputer();
			}
		}catch (Exception e) {
			e.printStackTrace(); 
		}
		
	}
	
	
}


