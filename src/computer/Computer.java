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
				System.out.println("�����ȴ����������ߵ�" + count + "̨���ԡ�" );
				wait();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			count++;
			System.out.println("�������������ĵ�"+count+"̨���ԡ�"  );
			flag = true;
			notify();
		}
	}
	
	public synchronized void carryComputer() {
		if(!flag) {
			try {
				System.out.println( "�������ȴ�����������" +  (count + 1)+" ̨����\n" );
				wait();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("���İ��������������ĵ�"+ count+"̨���ԡ�"  +"\n");
			flag = false;
			notify();
		}
	}
}



