package computer;

public class Computer {
	private int count = 0;
	private boolean flag = false;
	
	public Computer() {
		super();
	}
	
	public synchronized void produceComputer() {
		if (flag) {
			try {
				System.out.println("张三等待李四来拿走第" + count + "台电脑。" );
				wait();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			count++;
			System.out.println("这是张三生产的第"+count+"台电脑。"  );
			flag = true;
			notify();
		}
	}
	
	public synchronized void carryComputer() {
		if(!flag) {
			try {
				System.out.println( "李四正等待张三生产第" +  (count + 1)+" 台电脑\n" );
				wait();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("李四搬走了张三生产的第"+ count+"台电脑。"  +"\n");
			flag = false;
			notify();
		}
	}
}



