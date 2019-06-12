package java_20190607;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		
		//���ڿ����� �� append ���
		s1.append("select name, age ");
		s1.append("from member ");
		s1.append("where name = '������' ");
		s1.append("order by name desc ");
		
		s2.append("select name, age ");
		s2.append("from member ");
		s2.append("where name = '������' ");
		s2.append("order by name desc ");
		
		
		//StringBuffer��  equals() �޼���� Object Ŭ������ equals() �޼���.
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		//s1�� ��Ʈ�����ۿ��� ��Ʈ������ ����.
		String s3 = s1.toString();
		String s4 = s2.toString();
		//string������ ���ڿ� �� ����.
		System.out.println(s3.equals(s4));
		
		//s1�� ���� ��� �����. setLength�� �Ű����� 0 ����.
		s1.setLength(0);
		s1.append("select no, writer from board");
		//�Ʒ��� s1.toString()�� ������ ��. StringBuffer Ŭ������ Object�� toString() �޼��带 �������̵��߱� ������
		//StringBuffer Ŭ������ ���ڿ��� ��µ�
		System.out.println(s1);
		
		
	}
}
