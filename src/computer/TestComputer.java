package computer;


public class TestComputer {
		public static void main(String[] args) {
			Computer computer = new Computer();
			MadeComputer produceComputer = new MadeComputer(computer);
			CarryComputer carryComputer = new CarryComputer(computer);

			Thread thread1 = new Thread(produceComputer);
			Thread thread2 = new Thread(carryComputer);
			
			thread1.start();
			thread2.start();
		}

	}

	
	
	
	

