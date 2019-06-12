package java_20190610;

public class TryCatchFinallyDemo {
	public static double average(int a, int b){
		int sum = a + b;
		return (double)sum/(double)2;
	}
	public static void main(String[] args) {
/*		if(args.length !=2){
			System.err.println("usage : java TryCatchFinally Demo" + "[��������] [��������]");
			return;
		}*/
		//Integer.parseInt() �޼���� ���ڰ� �ƴ� ���ڿ��� ��� ��, �Ϲ� ���ڿ��� ��� 
		//NumberFormatException ���ܰ� �߻���
		
		try {
			//ArrayIndexOutOfBoundsException 
			int korea = Integer.parseInt(args[0]);
			//JVM�� ������ ������Ű��, ���� ��ü�� NumberFormatException��ü��
			//������ �� catch���� ã�´�.
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("��� : %.2f",avg);
			//����Ŭ������ exception�� �־ ����. ���� �����ڵ��� exception�� �ִ´�.
		} catch (NumberFormatException e) {
			//jvm�� �Ѹ��� �޼����� �Ȱ��� ������ �ϴ� �޼ҵ�. ���ܰ� ��� �߻��ߴ��� ã�� �޼ҵ�.
			//e.printStackTrace(); 
			//System.err.println("���� �޼��� : "+e.getMessage());
			//����ڵ鿡�� ������ �޼���.
			System.err.println("���ڸ� �Է��ϼž� �մϴ�.");
		}catch (ArrayIndexOutOfBoundsException e) {
			//jvm�� �Ѹ��� �޼����� �Ȱ��� ������ �ϴ� �޼ҵ�. ���ܰ� ��� �߻��ߴ��� ã�� �޼ҵ�.
			//e.printStackTrace(); 
			//System.err.println("���� �޼��� : "+e.getMessage());
			//����ڵ鿡�� ������ �޼���.
			System.err.println("usage : java TryCatchFinally Demo" + "[��������] [��������]");
		}finally{
			System.err.println("finally block");
		}

			
		}
		
	}
	

