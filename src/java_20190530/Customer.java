package java_20190530;

public class Customer {
	// ���Ⱑ ������� (class �Ʒ�/��)
	// �Ʒ� 2���� �ν��Ͻ� ����
	String name;
	String cphone;
	// �Ʒ� ��� ����ƽ ����
	static double interestRate ;
	// ���̳� ������ �빮�ڷ� ���� (BANKNAME) ���̳κ����� static ������ ��찡 100%
	static final String BANKNAME = "��������";
	// ���Ⱑ ������� (Method ����/��)
	public void register(){
		System.out.println("���� ��� �Ǿ����ϴ�.");
		// name, cphone, interestrate�� ������ �̹� ����� �ֵ��̶� �ֵ���ǥ ���ϰ� +�� �ٿ��� �ν� ����.
		System.out.println("�̸� : "+ name + " , �ڵ��� ��ȣ : "+cphone+", ������: "+interestRate+
				", ����� :"+BANKNAME);
	}
}
