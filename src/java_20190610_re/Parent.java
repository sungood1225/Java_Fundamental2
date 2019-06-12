package java_20190610_re;

public abstract class Parent {
	String name;
	String cphone;
	//이거를 꼭 하위클래스에 구현하라는 암묵적인 명령!
	public abstract void insert();
	public abstract void delete(int i);

}
