package java_20190607;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		//list.add(10);
//���ʸ� ������ ���ϸ� list.add(10)�� ���� �� �ִ�. boxing �Ǿ int class�� 10�� ��.
		for(int i=0;i<list.size();i++){
			//���ʸ� ������ ���ϸ� �Ʒ� String�̶�� �Ժη� �� �� ����, String���� ĳ�����ص� String�� �ƴ� ������ �߰��Ǹ� ��°��� ������ ����.
			//�׸��� ���ʸ������� ���ϸ� inhance for�� ����
			//������ �� �����;������� ������ �� �ִ� ��ġ.
			String temp = (String)list.get(i);
			System.out.println(temp);
		}
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		//list1.add(10);
//���ʸ� ������ ���ϸ� list.add(10)�� ���� �� �ִ�. boxing �Ǿ int class�� 10�� ��.
		for(int i=0;i<list1.size();i++){
			//���ʸ� ������ ���ϸ� �Ʒ� String�̶�� �Ժη� �� �� ����, String���� ĳ�����ص� String�� �ƴ� ������ �߰��Ǹ� ��°��� ������ ����.
			//�׸��� ���ʸ������� ���ϸ� inhance for�� ����
			//������ �� �����;������� ������ �� �ִ� ��ġ.
			String temp = list1.get(i);
			System.out.println(temp);
	}
		for(String temp : list1){
			System.out.println(temp);
		}
	}		
}
