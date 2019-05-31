package java_20190531;

import java_20190531.tt.Cat;

//extends Cat�� �ǹ̴�  �ش� class�� ������ Cat���� �Ѵ�.����� ����
//protected�� ����´�. �׷��� private, default�� ������� ���Ѵ�.
public class AccessModifierDemo extends Cat{
	public static void main(String[] args) {
		Car c = new Car();
		
		// c.modelnumber ��� �ߴ� ����. car Ŭ�������� �����̺��� �����̱� ����.
		// �����ϰ� ������ public���� �ٲٰų� ���Ͱ��͸� ����������.
		//c.modelNumber = "68��4472"
		
		//default�� ���� ��Ű��(���丮)���� ���� ����
		c.color = "red";
		
		//protected�� ���� �ٸ� ��Ű������ ��ӹ��� ��� ���� ����
		c.doorCount = 5;

		//public�� ���� �ٸ� ��Ű������ ���� ����
		c.price = 10_000_000;
		
		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);
		
		//ó���� cat �ν� ���ϴ� ����. �ٸ� ��Ű�� (tt) ���� �־. ������ import�ϴ� �۾��� �ʿ�.
		//ctrl+shift+O �� �����, �Ǵ� Cat �ڿ� Ŀ���� ���� ��Ʈ�� �����̽� ������ �˾Ƽ� ã����
		Cat cat = new Cat();
		//nickName�� �ҷ��� �� ����. ����Ʈ ������Ƽ�� �� �� ���� �ٸ� ��Ű���� �ν��� ����
		cat.nickName = "tomcat";
		
		//������ catŬ������ ����� �޾ұ� ������, protected ������ age�� �ν� �����ϴ�.
		AccessModifierDemo a = new AccessModifierDemo();
		a.age = 10;
		a.nickName = "����";
		
				
				
	}
}
