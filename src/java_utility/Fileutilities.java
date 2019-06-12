package java_utility;

import java.io.File;

public class Fileutilities {


	//1000콤마 및 소수점 콤마 찍는 메쏘드
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
	
	//파일을 포함한 전체경로를 입력하면 밀리세컨값으로 바꿔줌
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
	
	//디렉토리생성하는 매쏘드
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
