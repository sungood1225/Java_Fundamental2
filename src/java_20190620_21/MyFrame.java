package java_20190620_21;
/*
import java.awt.Frame;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Random;

public class MyFrame extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	// 정적배열
	Duck[] arr = new Duck[20];


	public MyFrame() {
		// super();//new Frame() 어차피 컴파일러가 자동으로 수행해서 주석처리함.
		
		makeDucks();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);// 윈도우으로부터 제어권을 얻어옴.
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
	

	@Override // 사용자가 call하는 함수가 아니고 자동으로 약속되어 있는 함수. 이 프레임을 그릴 수 있는 제어권이 os로부터
				// 넘겨받았을 때.
	public void paint(Graphics g) {
		
		
		 * g.setColor(Color.RED); g.fillOval(100, 100, 50, 50);
		 

		// MallarDuck md = new MallarDuck(); 가 여기있으면 paint할때마다 위치가 바뀜 , 멤버변수로
		// 올려놓아야함. 그대신 아래 메쏘드 시행할 때 데이터가 잘 저장되어서 불러오는지 확인해야함.
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

