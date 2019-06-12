package java_20190610;

public class ThrowsDemo {
	public static double average(int[] score) throws ArrayIndexOutOfBoundsException{
		int korea = score[0];
		int math = score[1];
		int english = score[2];
		int history = score[3];
		int sum = korea + math + english + history;
		return (double)sum / (double) 4;
	}
	public static void main(String[] args) {

		int[] exam = {10,20,30};
		try {
			double avg = average(exam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("����, ����, ����, ���� 4�� ���� �Է��Ͻÿ�.");
		}finally{
			System.err.println("finally block");
		}
	
	}
}
