package java_20190529;

public class CalendarDemo {
public static void main(String[] args) {
	/*
	 * �޷� �����
	 * 1. 1�� 1�� 1�� ������
	 * 2. ������ 4�� ���� �߻��ϰ� 
	 * ���߿� 100���� ����� �����ϰ� 400���� ����� �������� �ʴ´�.
	 * - 2019�� 5�� 28���� ������ ���Ϸ���
	 * 2018�� ���� �ϼ��� ���ϰ�, 1�� ~ 4�� ���� �ϼ��� ���ϰ� 
	 * 28�� ���ϸ�  ���ϼ��� ����
	 * - ���ϼ� 7�� ���� �������� 1 �̸� ������, 2 �̸� ȭ����,...
	 * 6 �̸� �����, 0�̸� �Ͽ���
	 */
	int year = Integer.parseInt(args[0]);
	int month = Integer.parseInt(args[1]);
	int date = Integer.parseInt(args[2]);
	
	int preYear = year - 1;
	int preMonth = month - 1;
	int totalCnt = 0;
	
	//2018�⵵ �� �� ���ϱ�
	totalCnt = preYear * 365 + 
			(preYear/4 - preYear/100 + preYear/400);
	
	//2019�� 1�� 1�� ���� 4�� 30�� ���� �ϼ� ���ϱ�
	//���迭�� �����Ѵ�.
	int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	for (int i = 0; i < preMonth; i++) {
		totalCnt += monthArray[i];
		
		
	}
	//�ش� �⵵�� �������� �Ǵ��ϰ� ������ ��� 3�� �̻��̸� 1�� �߰����ش�.
	if (month >=3 && (year%4==0 && year%100!=0 || year%400==0 ))
	
	
	totalCnt++;
	
	totalCnt += date;
	
	int rest = totalCnt % 7;
	String day = "";
	switch(rest){
	case 1 : day = "������"; break;
	case 2 : day = "ȭ����"; break;
	case 3 : day = "������"; break;
	case 4 : day = "�����"; break;
	case 5 : day = "�ݿ���"; break;
	case 6 : day = "�����"; break;
	case 0 : day = "�Ͽ���"; break;
	
	// 
	}
	System.out.println(year + "��" + month + "��" + date + "��" + day + "�Դϴ�.");
}
}
