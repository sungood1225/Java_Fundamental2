package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		//���� ǥ����
		char a = 'q';
		
		//�����ڵ� ǥ���� '\u0000'
		
		char b = '\uC132';
		char c = '\uC601';
		char d = '\uD55C';
		System.out.println(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		
	
		//�ƽ�Ű�ڵ� ǥ����
		char e = 97;
		System.out.println(e);
		
		//�̽������� ĳ����
		System.out.println("������\t����");
		System.out.println("������\n����");
		
		// ���ڿ� �߿��� ",\ ���ڷ� �ν��� ����
		// �ν��ϰ� �Ϸ��� ",\ �տ� \ ������ ��
		System.out.println("C:\\dev\\eclipse");
		System.out.println("������ \"����\" ");
		System.out.println("������ '����' ");
		
		// \,' �ΰ��� ���ڴ� char���� �ν��� ���ϱ⶧����
		// �ι��� �տ� \�� �ٿ��־� ���ڷ� �ν��ϰ� �ؾ� �Ѵ�.
		char f = '\\';
		char g = '\'';
		char h = '"';
		
		
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}
}




