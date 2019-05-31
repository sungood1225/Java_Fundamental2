package java_20190529;

public class ArrayDemo {
	public static void main(String[] args) {
		//int �迭����
		int[] test = new int[4];
		int index = 0;
		//�迭 �Ҵ�
		test[index++] = 1;
		test[index++] = 2;
		test[index++] = 3;
		test[index++] = 4;
		
		//�迭�� ������ �Ҵ��� ���ÿ� �ϴ� ���
		int[] test1 = {100,200,300,400};
		
		int a = test[1];
		// 1�� �濡 �ִ� ���� �����Դٰ� �����ϸ� ��.
		//�迭 ���
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
		System.out.println(test[3]);
		
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		// enhanced for loop
		for(int value : test){
			System.out.println(value);
			
		}
		
		for (int i : test1) {
			System.out.println(i);
			
		}
		//test2�� test1�� ���������� ����Ű�� �迭�� ���� ���� �����Ѵ�. 
		int[] test2 = test1;
		// test2[3]�� ���� �����ϸ�  test1[3]�� ���� ����ȴ�.
		// �ֳ��ϸ� test1�� test2�� ���������� ����Ű�� �迭�� ���� �����̴�.
		test2[3] = 4000;
		System.out.println(test1[3]);
		System.out.println(test2[3]);
		
		int[][] test3 = new int[2][3];
		test3[0][0] = 10;
		test3[0][1] = 20;
		test3[0][2] = 30;
		test3[1][0] = 40;
		test3[1][1] = 50;
		test3[1][2] = 60;
		
		int[][] test4 = {{10,20,30},{40,50,60}};
		
		for (int i = 0; i < test4.length; i++) {
			for (int j = 0; j < test4[i].length; j++) {
				System.out.println(test4[i][j]);
				}
		}
		
		for (int[] is : test4) {
			for (int value : is) {
				System.out.println(value);
			}
		}
		int[] test5 = new int[8];
		System.arraycopy(test1, 0, test5, 0, 4);
		test5[4] = 500;
		test5[5] = 600;
		test5[6] = 700;
		test5[7] = 800;
		
		for (int i : test5) {
			System.out.println(i);
		}
		}
		
}

