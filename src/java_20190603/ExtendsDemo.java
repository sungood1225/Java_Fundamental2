package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "������";
		c.cphone = "010-9191-0290";
		System.out.println("�̸� : "+c.name);
		System.out.println("�ڵ��� : "+c.cphone);
		c.actionCustomer();
		
		
		Alba a = new Alba();
		a.name = "�˹ٻ�";
		a.cphone = "010-0000-0000";
		a.address = "����";
		System.out.println("�̸� : "+a.name);
		System.out.println("�ڵ��� : "+a.cphone);
		System.out.println("�ּ� : "+a.address);
		a.actionAlba();
		a.actionCustomer();
	
		
		Manager m = new Manager();
		m.name = "�Ŵ���";
		m.cphone = "010-1111-1111";
		m.address = "��⵵";
		m.id = "sungood1225";
		m.password = "123123";
		System.out.println("�̸� : "+m.name);
		System.out.println("�ڵ��� : "+m.cphone);
		System.out.println("�ּ� : "+m.address);
		System.out.println("ID : "+m.id);
		System.out.println("��ȣ: "+m.password);
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		//Super Ÿ��(Alba)���� Sub��ü(Manger)�� ������ �� �ִ�.
		//�θ�Ÿ�����κ��� �ڽ�Ÿ���� �����p �� �ִ�.
		//��������� Super(Alba)�� Ÿ���� ������ ���� Ŭ����(Customer) ���� ����
		Alba alba = (Alba)new Manager();
		alba.name = "�Ŵ���";
		alba.cphone = "010-1111-1111";
		alba.address = "��⵵";
		//alba.id = "sungood1225";
		//alba.password = "123123";
		System.out.println("�̸� : "+alba.name);
		System.out.println("�ڵ��� : "+alba.cphone);
		System.out.println("�ּ� : "+alba.address);
		alba.actionAlba();
		alba.actionCustomer();
		

	}
}
