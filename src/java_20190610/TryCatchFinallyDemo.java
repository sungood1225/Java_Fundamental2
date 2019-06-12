package java_20190610;

public class TryCatchFinallyDemo {
	public static double average(int a, int b){
		int sum = a + b;
		return (double)sum/(double)2;
	}
	public static void main(String[] args) {
/*		if(args.length !=2){
			System.err.println("usage : java TryCatchFinally Demo" + "[국어점수] [영어점수]");
			return;
		}*/
		//Integer.parseInt() 메서드는 숫자가 아닌 문자영일 경우 즉, 일반 문자열일 경우 
		//NumberFormatException 예외가 발생됨
		
		try {
			//ArrayIndexOutOfBoundsException 
			int korea = Integer.parseInt(args[0]);
			//JVM은 실행을 중지시키고, 예외 객체인 NumberFormatException객체를
			//생성한 후 catch블럭을 찾는다.
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("평균 : %.2f",avg);
			//상위클래스의 exception을 넣어도 무방. 보통 개발자들은 exception만 넣는다.
		} catch (NumberFormatException e) {
			//jvm이 뿌리는 메세지와 똑같이 나오게 하는 메소드. 예외가 어디서 발생했는지 찾는 메소드.
			//e.printStackTrace(); 
			//System.err.println("예외 메세지 : "+e.getMessage());
			//사용자들에게 보여줄 메세지.
			System.err.println("숫자를 입력하셔야 합니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			//jvm이 뿌리는 메세지와 똑같이 나오게 하는 메소드. 예외가 어디서 발생했는지 찾는 메소드.
			//e.printStackTrace(); 
			//System.err.println("예외 메세지 : "+e.getMessage());
			//사용자들에게 보여줄 메세지.
			System.err.println("usage : java TryCatchFinally Demo" + "[국어점수] [영어점수]");
		}finally{
			System.err.println("finally block");
		}

			
		}
		
	}
	

