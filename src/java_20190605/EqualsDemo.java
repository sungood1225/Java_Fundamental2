package java_20190605;

class Car{
	String modelNumber;
	String color;
	int year;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//매개변수 있는 생성자 alt+shift+s => o => ok
	//디폴트 생성자 alt+shift+s => c => ok
	public Car(String modelNumber, String color, int year) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}

	//setter getter :  alt + shift + s => r => ok.
	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	//alt+shift+s => h => ok. (만약에 3가지 항목중 2개만 같으면 같은걸로 보고 싶으면 창에서 항목 선택 가능)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	//toString() : alt+shift+s => s => ok
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + ", year=" + year + "]";
	}


	
	
	
	
}

public class EqualsDemo {
	public static void main(String[] args) {
		Car c1 = new Car("01010000","black",2018);
		Car c2 = new Car("01010000","black",2018);
		
		Car c3 = new Car("01001001","red",2019);
		Car c4 = new Car("01001001","red",2019);
		
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println("c1 hashcode :" + c1.hashCode());
		System.out.println("c2 hashcode :" + c2.hashCode());
		System.out.println(c1);
		//위아래가 같은 거임.
		System.out.println(c1.toString());
		
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
		System.out.println("c3 hashcode :" + c3.hashCode());
		System.out.println("c4 hashcode :" + c4.hashCode());
		
	}
}
