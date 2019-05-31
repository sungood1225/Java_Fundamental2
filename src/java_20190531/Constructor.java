package java_20190531;

public class Constructor {
	//�ν�ź�� ������, ��ü������ �� ���� null �̷������� �����µ� �̸��� �־��ְ� �ʹٸ�
	//�����ڸ� ������ش�.
	private String name;
	private String email;
	private int age;
	
	//����Ʈ ������, �Ű����� ����. : Ŭ���� ���� �����ڰ� ���� ��� compiler�� �ڵ����� �������ش�.
	//Ŭ���� ���� �����ڰ� 1���� �ִ� ���� compiler ���������� �ʴ´�.
	//�����ڴ� Ŭ���� �̸��� ����, ��ȯ���� ���� ���¸� ������ �ִ�.
	//�ƹ��͵� ������ ���� �Ƚᵵ �ڵ����� ���������, �����ڴ� �����ε��� �� ������ �̶� ���� �ȸ���� ������ �� �� �ִ�.
	//�׷��� ������ �� �̸� ���������� ������ ���� �� �ִ�.
	// �� ���̴� �ƹ� ���� ��� �������� �ʱ�ȭ ����� ������ �� ����.
	public Constructor(){

	}
	
	public Constructor(String name, String email){
		// �Ű����� 3��¥�� ������ ȣ��
		this(name,email,0);
		//this.name = name;
		//this.email = email;
		
	}
	
	//�Ű� ���� 3���� ������
	//�޼ҵ��� overloadingó�� �����ڵ� overloading�� ������
	public Constructor(String name, String email, int age) {
		//this�� ���ú����� instance������ �����ϱ� ���� �����
		this.name = name;
		this.email = email;
		this.age = age;
	
		/* �Ʒ��� ���� ����� ������ �����ϴٰ� ����...
	 public Constructor(String n, String e, int a) {
		name = n;
		email = e;
		age = a;}	**/
	}
	
	//�������� c.name = ������ �� 3�ٷ� ���ε��� �ߴµ� �����ڸ� ����  1���� �Ű������� ���� ����.
	public static void main(String[] args) {
		Constructor c = new Constructor("������","sungood1225@gmail.com", 20);
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
		
	}
}
