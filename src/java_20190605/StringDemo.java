package java_20190605;

import org.omg.Messaging.SyncScopeHelper;

public class StringDemo {
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		String str3 = "java";
		String str4 = "java";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str3));
		
		String ssn = "234567-8923456";
		// charAt(int index)�� ���ڿ� �߿� Ư�� �ε����� �ִ� ���ڸ� ��ȯ�Ѵ�.
		char c = ssn.charAt(0);
		System.out.println(c);
		// concat(String msg) �� ���ڿ� ����, String temp = ssn + "�ȳ��ϼ���"
		String temp = ssn.concat("�ȳ��ϼ���");
		System.out.println(temp);
		//endswith(String temp) �޼���� temp ���ڿ��� ������ true, �׷��� ������ false <->startswith
		String fileName = "test.zip";
		if(fileName.endsWith("zip")){
			System.out.println("�������� �Դϴ�.");
		}else if(fileName.endsWith("doc")){
			System.out.println("Office �����Դϴ�.");
		}else{
			System.out.println("�����Դϴ�.");
		}
		//startsWith(String temp) �޼���� temp ���ڿ��� �����ϸ� true, �׷��� ������  false
		String url = "http://www.naver.com/";
		String uri = "sports/";
		if(uri.startsWith("sports")){
			System.out.println("������ �޴��Դϴ�.");
			}else if(uri.startsWith("news")){
				System.out.println("���� �޴��Դϴ�.");
			}else {
				System.out.println("404 �������Դϴ�.");
			}
		String s1 = "Java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		System.out.println(ssn.indexOf("-"));
		System.out.println(ssn.lastIndexOf("-"));

		ssn = ssn.replaceAll("-", "*");
		System.out.println(ssn);
		
		String html = "�ȳ��ϼ���\n���� �������Դϴ�.\n������ �� ��Ź�帳�ϴ�.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		
		//������ ��������  ������ ���!!!
		String ssn1 = ssn.substring(0,ssn.indexOf("*"));
		String ssn2 = ssn.substring(ssn.indexOf("*")+1);
		
		System.out.println(ssn1);
		System.out.println(ssn2);
		
		fileName = "abc.def.ghi.zip";
		String fileName1 = fileName.substring(0, fileName.lastIndexOf("."));
		String fileName2 = fileName.substring(fileName.lastIndexOf("."));
		
		System.out.println(fileName1);
		System.out.println(fileName2);
		
		fileName1 = "hello";
		fileName2 = "hello ";
		if(fileName1.equals(fileName2.trim())){
			System.out.println("����");	
			}else{
				System.out.println("����");
			}
		
		int a = 10;
		//t1, t2 ������. 
		String t1 = String.valueOf(a);
		String t2 = a+"";
		System.out.println(t1);
		
		ssn = "010-9191-0290";
				//�迭Ÿ���� ���, 2����� ������ ����
		String[] t3 = ssn.split("-");
		System.out.println(t3[0]);
		System.out.println(t3[1]);
		System.out.println(t3[2]);
		
		
		String str = String.format("%,.2f , %,.2f , %,.2f",1111.11,2222.22,3333.33);
		System.out.println(str);
		
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1�� ���� %d�̰��,%n b2�� ���� %d �Դϴ�.",b1,b2);
		
		
		}

		
	}

