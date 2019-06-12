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
		//�Ʒ� �и������� ������ ���̶� ������ ���ϸ��� ���鶧 �����ϴ�.
		name = String.valueOf(System.currentTimeMillis());
		name = name+extension;
		String parent = f1.getParent();
		File f2 = new File(parent,name);
		f1.renameTo(f2);
	}
	
	public static void main(String[] args) {
		FileDemo f = new FileDemo();
		//��δ� �������� 2���� üũ������Ѵ�. �������� �ϳ��� ���ڿ��� �ν����� �ʱ� ����.
		f.mkdirs("c:\\down2\\2019\\06\\11");
		
		File f1 = new File("c:\\down","1560232408559..pdf");
		long fileSize = f1.length();
		String fileLength = f.getComma(Math.round((double)fileSize/(double)1024),3);
		System.out.println(fileLength + "KB");
		
		String fileName = f1.getName();
		String path = f1.getPath();
		
		String name = fileName.substring(0,fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf("."));
		//�Ʒ� �и������� ������ ���̶� ������ ���ϸ��� ���鶧 �����ϴ�.
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
		
		//c����̺꿡 �ִ� ��� ���� ǥ��.
		File f4 = new File("c:\\");
		String[] list = f4.list();
		for(String value : list){
			//�Ʒ��� ���� ������ �� �ֵ�.
			File f5 = new File(f4,value);
			if(f5.isDirectory()){
				System.out.println(value+"- ���丮");
			}else if(f5.isFile()){
				long size = f5.length();
				System.out.println(value+"-����("+size+")");
			}
		}
		
		//������ ������ ��¥�� �����ϴ� ���~!!
		File f6 = new File("C:\\down","20190529.rtf");
		long lastModified = f6.lastModified();
		//Calendar�� �߻�Ŭ����. ���� �߻�Ŭ������ ��ü������ ���ϳ�...�� ���� �Ⱥ������� �˾Ƽ� ����.
		//CalendarŬ������ "������ ��¥"�� ���ϴµ� ���� �����ϴ�~!!
		//���� 0���� ���ϱ� +1�� ����� �Ѵ�.
		Calendar c = Calendar.getInstance();
		GregorianCalendar car = new GregorianCalendar();
		//���� 0���� ���ϱ� +1�� ����� �Ѵ�. 2019/6/10 ������ ���Ϸ��� set�� ���� �ٲ��ش�.
		c.set(2019, 5, 10);
		//�и������ ������ ���� ��¥�� ������ �� �ִ�. ������ ��� ���������� ������ ��¥�� �и�������� ������ ����.
		
		c.setTimeInMillis(lastModified);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		boolean leapYear = car.isLeapYear(year);
		System.out.println(year+"��"+month+"��"+date+"��");
		System.out.println(leapYear);
		switch(dayOfWeek){
		case Calendar.MONDAY : System.out.println("������ �Դϴ�.");break;
		case Calendar.TUESDAY : System.out.println("ȭ���� �Դϴ�.");break;
		case Calendar.WEDNESDAY : System.out.println("������ �Դϴ�.");break;
		case Calendar.THURSDAY : System.out.println("����� �Դϴ�.");break;
		case Calendar.FRIDAY : System.out.println("�ݿ��� �Դϴ�.");break;
		case Calendar.SATURDAY : System.out.println("����� �Դϴ�.");break;
		case Calendar.SUNDAY : System.out.println("�Ͽ��� �Դϴ�.");break;
		
		}
		
	}
}
