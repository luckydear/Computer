package computer;

public class MadeComputer implements Runnable{
	private Computer computer;

	public MadeComputer(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i < 15; i++) {
				computer.produceComputer();
				Thread.sleep(1000);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}