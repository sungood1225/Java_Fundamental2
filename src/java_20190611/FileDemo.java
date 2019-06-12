package java_20190611;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileDemo {
	
	public boolean mkdirs(String path){
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if(!isExisted){
			isSuccess = f1.mkdirs();
		}
		return isSuccess;
	}
	
	public String getComma(int number){
		return String.format("%,d", number);
	}
	
	public String getComma(long number){
		return String.format("%,d", number);
	}
	public String getComma(double number, int precision){
		return String.format("%,."+precision+"f", number);
	}
	
	public String getComma(double number){
		return String.format("%,f", number);
	}
	
	public void changeFile(String path){
		File f1 = new File(path);
		String fileName = f1.getName();
		String name = fileName.substring(0,fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf("."));
		//아래 밀리세컨은 유일한 값이라서 유일한 파일명을 만들때 유용하당.
		name = String.valueOf(System.currentTimeMillis());
		name = name+extension;
		String parent = f1.getParent();
		File f2 = new File(parent,name);
		f1.renameTo(f2);
	}
	
	public static void main(String[] args) {
		FileDemo f = new FileDemo();
		//경로는 역슬레시 2개로 체크해줘야한다. 역슬래시 하나는 문자열로 인식하지 않기 때문.
		f.mkdirs("c:\\down2\\2019\\06\\11");
		
		File f1 = new File("c:\\down","1560232408559..pdf");
		long fileSize = f1.length();
		String fileLength = f.getComma(Math.round((double)fileSize/(double)1024),3);
		System.out.println(fileLength + "KB");
		
		String fileName = f1.getName();
		String path = f1.getPath();
		
		String name = fileName.substring(0,fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf("."));
		//아래 밀리세컨은 유일한 값이라서 유일한 파일명을 만들때 유용하당.
		name = String.valueOf(System.currentTimeMillis());
		name = name+extension;
		System.out.println(name);
		System.out.println(extension);
		System.out.println(path);
		System.out.println(f1.getParent());
		String parent = f1.getParent();
		File f2 = new File(parent,name);
		f1.renameTo(f2);
		
		File f3 = new File("C:\\down\\1560232547063.pdf");
		f3.delete();
		
		//c드라이브에 있는 모든 것을 표현.
		File f4 = new File("c:\\");
		String[] list = f4.list();
		for(String value : list){
			//아래와 같이 생성할 수 있따.
			File f5 = new File(f4,value);
			if(f5.isDirectory()){
				System.out.println(value+"- 디렉토리");
			}else if(f5.isFile()){
				long size = f5.length();
				System.out.println(value+"-파일("+size+")");
			}
		}
		
		//파일의 마지막 날짜를 추출하는 방법~!!
		File f6 = new File("C:\\down","20190529.rtf");
		long lastModified = f6.lastModified();
		//Calendar는 추상클래스. 원래 추상클래스는 객체생성을 못하나...뭐 눈에 안보이지만 알아서 해줌.
		//Calendar클래스는 "오늘의 날짜"를 구하는데 아주 유용하다~!!
		//월만 0부터 세니깐 +1을 해줘야 한다.
		Calendar c = Calendar.getInstance();
		GregorianCalendar car = new GregorianCalendar();
		//월만 0부터 세니깐 +1을 해줘야 한다. 2019/6/10 요일을 구하려면 set을 통해 바꿔준당.
		c.set(2019, 5, 10);
		//밀리세컨즈를 넣으면 현재 날짜를 추출할 수 있다. 파일의 경우 마지막으로 저장한 날짜가 밀리세컨즈로 나오기 때문.
		
		c.setTimeInMillis(lastModified);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		boolean leapYear = car.isLeapYear(year);
		System.out.println(year+"년"+month+"월"+date+"일");
		System.out.println(leapYear);
		switch(dayOfWeek){
		case Calendar.MONDAY : System.out.println("월요일 입니다.");break;
		case Calendar.TUESDAY : System.out.println("화요일 입니다.");break;
		case Calendar.WEDNESDAY : System.out.println("수요일 입니다.");break;
		case Calendar.THURSDAY : System.out.println("목요일 입니다.");break;
		case Calendar.FRIDAY : System.out.println("금요일 입니다.");break;
		case Calendar.SATURDAY : System.out.println("토요일 입니다.");break;
		case Calendar.SUNDAY : System.out.println("일요일 입니다.");break;
		
		}
		
	}
}
