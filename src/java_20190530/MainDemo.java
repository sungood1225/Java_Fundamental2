package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
/*		// 1. Customer c ���� Customer�� Reference Type. c�� reference
		// 2. new Customer()�� Object
		Customer c = new Customer();
		// ���� name�� cphone �� �������� ��ȣ�� ���� ���ϸ�, null�� ���´�. 
		// customer class string�� ������������ �⺻���� null�̱� ����.
		c.name = "������";
		c.cphone = "010-9191-0290";
		Customer.interestRate = 4.3;
		// ����ƽ �����̱� ������ c���� ���ص� ������. �ٸ� class�� �� ����Ǳ� ������ ��� c�� �����Ȱ� class�̸��� cutomer�� ���δ�.
		//Customer.BANKNAME = "��������" --> �ȹٲ�� ����. final�� �̹� �������ױ� ����.
		c.register();
		
		// ���ο� class�� ������
		Customer c2 = new Customer();
		c2.name = "Steve Jobs";
		c2.cphone = "010-0000-0000";
		//4.3->4.5�� �� �ٲ�
		Customer.interestRate = 4.5;
		c2.register();
		
		// ���� class�� ������ - c3�� ���ϸ� c2 ���� ���Ѵ�. call by reference�� ��
		// c3 reference�� c2 reference�� ����Ű�ϴ� object�� �����϶�� �ǹ�
		Customer c3 = c2;
		c3.name = "������";
		c3.cphone = "010-1111-2222";
		
		c3.register();
		c2.register();
		
		 c==c2 false(new,new�� �ٸ� ��ü�� ������� ����) , 
		 * c2==c3 true ���۷���Ÿ���϶��� �� ���۷����� ���� ��ü�� �����ؾ���. ���빰�� ������
		 * �ٸ� ��ü�̸� ���� ���� �ƴϴ�. ���빰�� ���� ����� ����. 
		 */
		
	Member m = new Member();
	m.setName("sung");
	m.setCphone("010-0909-9090");
	m.setAddress("seoul");
	m.setZipcode("46780");

	System.out.println(m.getName());
	System.out.println(m.getAddress());
	System.out.println(m.getCphone());
	System.out.println(m.getZipcode());
	
				
				
		
	}
}
