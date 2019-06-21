package java_20190620_21;
import java.awt.Graphics;
import java.util.Random;

public class DuckManager {
	
	Duck[] arr = new Duck[20];
	
	public DuckManager(){
		makeDucks();
	}
	
	private void makeDucks() {
		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++) {
			int type = rnd.nextInt(4); // 0,1,2,3

			switch (type) {
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
				arr[i] = new DecoyDuck();
				break;	
			default:
			}

		}
	}


	public void displayAllDucks(Graphics g) {
			for(int i = 0; i<arr.length;i++){
			arr[i].display(g);
			}
	}
	
	public void swimAllDucks(Graphics g) {
		for(int i = 0; i<arr.length;i++){
			arr[i].swim(g);
			}
	}
	
	public void flyAllDucks(Graphics g){
		for(int i = 0; i<arr.length;i++){
			if(arr[i] instanceof Flyable){
				((Flyable)arr[i]).fly(g);
			}
		}
	}
	
		public void quackAllDucks(Graphics g){
			for(int i = 0; i<arr.length;i++){
				if(arr[i] instanceof Quackable){
					((Quackable)arr[i]).quack(g);
				}
			}	
	
		
		
	}
	
}
