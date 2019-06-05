package java_20190604;

//추상클래스! abstract를 붙여준당
public abstract class Shape {
	String name;
	double degree;
	//추상메소드! 자식들은 꼭 아래 메소드를 오버라이딩 해야함.
	public abstract void draw();
	
	public void drawLine(){
		System.out.println("Shape - drawLine()");
	}
}
