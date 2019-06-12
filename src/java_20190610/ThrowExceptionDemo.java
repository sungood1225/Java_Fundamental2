package java_20190610;
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg){
		//Exception Ŭ������ �Ű����� String�� �����ڸ� ȣ�����ش�.
		//msg�� �����޼����� ����� �������� ����Ѵ�.
		super(msg);
	}
}

class InCorrectAccountException extends Exception{
	InCorrectAccountException(String msg){
		//Exception Ŭ������ �Ű����� String�� �����ڸ� ȣ�����ش�.
		//msg�� �����޼����� ����� �������� ����Ѵ�.
		super(msg);
	}
}

public class ThrowExceptionDemo {
	public static double withdraw(String account, int amount) throws InsufficientBalanceException, InCorrectAccountException{
		double balance = 100000;
		String dbAccount = "123-12-123123";
		if(account != null && account.equals(dbAccount)){
			if(balance - amount>=0){
				balance = balance - amount;
			}else{
				throw new InsufficientBalanceException("�ܾ��� �����մϴ�.");
			}
		}else{
			throw new InCorrectAccountException("���¹�ȣ�� �߸��Ǿ����ϴ�.");
		}
		
		return balance;
	}
		public static void main(String[] args) {
			double balance;
			try {
				balance = withdraw("123-12-123123",9000);
				System.out.println("�ܾ� : "+balance);
			} catch (InsufficientBalanceException e) {
				System.err.println(e.getMessage());
			} catch (InCorrectAccountException e) {
				System.err.println(e.getMessage());
			}

		}
}
