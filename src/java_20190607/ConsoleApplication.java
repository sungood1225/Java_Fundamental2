package java_20190607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleApplication {
	
	private ArrayList<Member> list;
	public ConsoleApplication(){
		list = new ArrayList<Member>();
	}
	
	public void print(){
		System.out.println("*************************************************");
		System.out.println("1. Insert  2. Update 3. Delete 4. Search 5. Exit");
		System.out.println("*************************************************");
	}
	
	//Ű����� �Է¹��� ������ ��ȯ�ϴ� �Լ�
	public String console(String message) throws IOException{
		System.out.print(message);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public void execute(String message) throws IOException{
		if(message.equals("1")){
			insert();
		}else if(message.equals("2")){
			update();
		}else if(message.equals("3")){
			delete();
		}else if(message.equals("4")){
			search();
		}else{
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
	//1. ���̵� �Է¹޴´�.
	//2. �̸��� �Է¹޴´�.
	//3. ArrayList�� ���� �߰��Ѵ�.
	//4. ArrayList�� �ִ� ��� ���� ����Ѵ�.
	//5. print() �Լ� ȣ��
	//6. �����ϼ��� : �޼��� ��� �� Ű���� �Է¹��� �غ�
	public void insert() throws IOException{
		String id = console("���̵� : ");
		String name = console("�̸� : ");
		Member m = new Member(name, id);
		list.add(m);
		common();
		
	}
	//1. ������ ���̵� �Է¹޴´�.
	//1-1. ArrayList���� ������ ���̵� ã�Ƽ� ������ ������ �̸��� �Է¹ް� Arraylist�����Ѵ�.
	//1-2. ������, "������ ���̵� �����ϴ�."�޼����� ����� �� 5������.
	//3. ArrayList�� �ִ� ��� ���� ����Ѵ�.
	//4. print() �Լ� ȣ��
	//5. �����ϼ��� : �޼��� ��� �� Ű���� �Է¹��� �غ�
	
	public void update()throws IOException{
		String updateId = console("������ ���̵�: ");
		boolean isExisted = false;
		for(Member m : list){
			if(updateId.equals(m.getId())){
				isExisted = true;
				break;
			}
		}
		if(isExisted){
			String updateName = console("������ �̸� : ");
			for(int i = 0; i<list.size();i++){
				Member m1 = list.get(i);
				if(updateId.equals(m1.getId())){
					//list.remove(i);
					//list.add(new Member(updatedName, updatedId);
					m1.setName(updateName);
					break;
				}
			}
		}else{
			System.out.println("������ ���̵� �����ϴ�.");
		}
		
		common();
		
	}
	//1.������ ���̵� �Է¹޴´�.
	//2.ArrayList ���� ������ ���̵� ã�Ƽ� ������ ArrayList���� �����ϰ�,
	//������ ������ ���̵� �����ϴ�. �޼��� ����Ѵ�.
	//3. ArrayList�� �ִ� ��� ���� ����Ѵ�.
	//4. print() �Լ� ȣ��
	//5. �����ϼ��� : �޼��� ����� Ű���� �Է¹��� �غ�.
	public void delete()throws IOException{
		String deletedId = console("������ ���̵�: ");
		boolean isExisted = false;
			for(int i = 0; i<list.size();i++){
				Member m1 = list.get(i);
				if(deletedId.equals(m1.getId())){
					isExisted = true;
					list.remove(i);
					break;
				}
			}
		if(!isExisted){
			System.out.println("������ ���̵� �����ϴ�.");
		}
		
		common();
		
	}
	//1.�˻��� ���̵� �Է¹޴´�.
	//2.ArrayList ���� ������ ���̵� ã�Ƽ� ������  ArrayList���� ����ϰ�,
	//������ ������ ���̵� �����ϴ�. �޼��� ����Ѵ�.
	//3. ArrayList�� �ִ� ��� ���� ����Ѵ�.
	//4. print() �Լ� ȣ��
	//5. �����ϼ��� : �޼��� ����� Ű���� �Է¹��� �غ�.
	public void search()throws IOException{
		String searchedId = console("�˻��� ���̵�: ");
		System.out.println("***************�˻����*****************");
		boolean isExisted = false;
		for(Member m : list){
			if(searchedId.equals(m.getId())){
				isExisted = true;
				break;
			}
		}
		
		if(isExisted){
			for(int i = 0; i<list.size();i++){
				Member m1 = list.get(i);
				if(searchedId.equals(m1.getId())){
					//System.out.printf("���̵� : %s, �̸� : %s%n", m1.getId(),m1.getName());
					System.out.println(m1);
					break;
				}
			}
		}else{
			System.out.println("������ ���̵� �����ϴ�.");
		}
		System.out.println("*************************************");
		common();
	}

	private void common() throws IOException {
		for(Member m1:list){
						System.out.println(m1);
					}
					
					print();
					String message = console("�����ϼ��� :");
					execute(message);
	}

	
	public static void main(String[] args) throws IOException{
		ConsoleApplication c = new ConsoleApplication();
		c.print();
		String message = c.console("�����ϼ��� :");
		c.execute(message);
	}
	
}
