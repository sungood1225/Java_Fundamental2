package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//�������� �ߺ��� ����ϰ�, ������ �����Ѵ�.
		//�迭�� �Ϻ��ϰ� �����ϸ鼭 Ȯ��� ��Ұ� �ڵ����� ����.
		ArrayList<String> list = new ArrayList<String>();
		//�Է� add(��ü)
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		//���⼭ i�� list�� index�� �ǹ��Ѵ�.
		//����� get(index)
		for(int i=0;i<list.size();i++){
			String temp = list.get(i);
			System.out.println(temp);
		}
		
		//enhanced for��. for(Ÿ�Ժ����� : �迭 �Ǵ� �÷���) {�ݺ��� ����} : ��� ��Ҹ� ����ϴ� for��
		//������ �� �߻��Ѵ�.
		for(String temp : list){
			System.out.println(temp);
		}
		
		list.remove(2);
		//������ �ڵ����� shift�� �Ǿ� 4�� ���´�~!
		String temp = list.get(2);
		//String temp1 = list.get(3);
		System.out.println(temp);
		//������ ������ ����. get(3)�� ������ ���� �ε����̱� ����.
		//System.out.println(temp2);
		
		/*�迭���� ��.
		 String[] s = new String [4]
		 s[0] = "1";
		 s[1] = "2";
		 s[2] = "3";
		 s[3] = "4";
		 
		 ����� "5"�� �߰��Ϸ��� �ʹ� ������. �迭�� Ȯ���� �ȵ�...
		 System.arraycopy(~~)
		 s[4] = "5"
		 
		 */
		
	}
}
