package java_20190620_21;
/*
import java.awt.Frame;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Random;

public class MyFrame extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	// �����迭
	Duck[] arr = new Duck[20];


	public MyFrame() {
		// super();//new Frame() ������ �����Ϸ��� �ڵ����� �����ؼ� �ּ�ó����.
		
		makeDucks();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);// ���������κ��� ������� ����.
	}
	
	private void makeDucks(){
		if(arr!=null){
			for(int i=0;i<arr.length;i++){
				Random random = new Random();
				int randomInt = random.nextInt(4);
				
				switch(randomInt){
				case 0:
					arr[i] = new MallarDuck();
					break;
				case 1:
					arr[i] = new RedDuck();
					break;
				case 2:
					arr[i] = new RubberDuck();
					break;
				case 3:
				     arr[i] =  new DecoyDuck();
				     break;
				default:
				break;
				}
			}
		}
	}
	

	@Override // ����ڰ� call�ϴ� �Լ��� �ƴϰ� �ڵ����� ��ӵǾ� �ִ� �Լ�. �� �������� �׸� �� �ִ� ������� os�κ���
				// �Ѱܹ޾��� ��.
	public void paint(Graphics g) {
		
		
		 * g.setColor(Color.RED); g.fillOval(100, 100, 50, 50);
		 

		// MallarDuck md = new MallarDuck(); �� ���������� paint�Ҷ����� ��ġ�� �ٲ� , ���������
		// �÷����ƾ���. �״�� �Ʒ� �޽�� ������ �� �����Ͱ� �� ����Ǿ �ҷ������� Ȯ���ؾ���.
		//

		if (arr != null){
			for(int i=0;i<arr.length;i++){
				if(arr[i] != null){
					arr[i].display(g);
					arr[i].swim(g);
					
					if(arr[i] instanceof MallarDuck){
						MallarDuck mallarDuck = (MallarDuck) arr[i];
					      mallarDuck.quack(g);
					      mallarDuck.fly(g);
					}
					
					else if(arr[i] instanceof RedDuck){
						RedDuck redDuck = (RedDuck) arr[i];
						redDuck.quack(g);
						redDuck.fly(g);
					}
					
					else if(arr[i] instanceof RubberDuck){
						RubberDuck rubberDuck = (RubberDuck) arr[i];
					      rubberDuck.quack(g);
					}
					
				}

	
				}
			}
		}


	}
*/

