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
		// charAt(int index)는 문자열 중에 특정 인덱스에 있는 문자를 반환한다.
		char c = ssn.charAt(0);
		System.out.println(c);
		// concat(String msg) 은 문자열 연결, String temp = ssn + "안녕하세요"
		String temp = ssn.concat("안녕하세요");
		System.out.println(temp);
		//endswith(String temp) 메서드는 temp 문자열로 끝나면 true, 그렇지 않으면 false <->startswith
		String fileName = "test.zip";
		if(fileName.endsWith("zip")){
			System.out.println("압축파일 입니다.");
		}else if(fileName.endsWith("doc")){
			System.out.println("Office 문서입니다.");
		}else{
			System.out.println("파일입니다.");
		}
		//startsWith(String temp) 메서드는 temp 문자여로 시작하면 true, 그렇지 않으면  false
		String url = "http://www.naver.com/";
		String uri = "sports/";
		if(uri.startsWith("sports")){
			System.out.println("스포츠 메뉴입니다.");
			}else if(uri.startsWith("news")){
				System.out.println("뉴스 메뉴입니다.");
			}else {
				System.out.println("404 페이지입니다.");
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
		
		String html = "안녕하세요\n저는 성영한입니다.\n앞으로 잘 부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		
		//문지열 기준으로  나누는 방법!!!
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
			System.out.println("성공");	
			}else{
				System.out.println("실패");
			}
		
		int a = 10;
		//t1, t2 같은것. 
		String t1 = String.valueOf(a);
		String t2 = a+"";
		System.out.println(t1);
		
		ssn = "010-9191-0290";
				//배열타입인 경우, 2덩어리가 나오기 때문
		String[] t3 = ssn.split("-");
		System.out.println(t3[0]);
		System.out.println(t3[1]);
		System.out.println(t3[2]);
		
		
		String str = String.format("%,.2f , %,.2f , %,.2f",1111.11,2222.22,3333.33);
		System.out.println(str);
		
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1의 값은 %d이고요,%n b2의 값은 %d 입니다.",b1,b2);
		
		
		}

		
	}

