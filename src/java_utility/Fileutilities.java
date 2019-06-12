package java_utility;

import java.io.File;

public class Fileutilities {


	//1000�޸� �� �Ҽ��� �޸� ��� �޽��
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
	
	//������ ������ ��ü��θ� �Է��ϸ� �и����������� �ٲ���
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
	
	//���丮�����ϴ� �Ž��
	public boolean mkdirs(String path){
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if(!isExisted){
			isSuccess = f1.mkdirs();
		}
		return isSuccess;
	

}
	}
