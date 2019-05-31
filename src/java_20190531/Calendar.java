package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0; 
	public static final int MONDAY = 1; 
	public static final int TUESDAY = 2; 
	public static final int WEDNESDAY = 3; 
	public static final int THURSDAY = 4; 
	public static final int FRIDAY = 5; 
	public static final int SATURDAY = 6; 
	
	//윤년인지 아닌지를 판단하는 매서드/ 매개변수가 윤년인지 아닌지를 판단한다. 윤년이면 true, 아니면 false.
	private boolean isLeafYear(int year){
		boolean isLeafYear = false;
		if(year%4==0 && year%100!=0 || year%400==0){
			isLeafYear = true;
		}
		return isLeafYear;
	}
	//1년 1월 1일 부터~ 년,월,일의 총 일수를 구하는 매서드
	private int getCount(int  year, int month, int day){
		//총일수 구할 때는 년도는 이전년도까지 일수를 구한다. 
		int preYear = year - 1;
		//해당 년도의 이전 달을 저장하기 위한 변수
		int preMonth = month - 1;
		int totalCnt = 0;
		
		//2018년도 일 수 구하기
		totalCnt = preYear * 365 + 
				(preYear/4 - preYear/100 + preYear/400);
		
		//2019년 1월 1일 부터 4월 30일 까지 일수 구하기
		//월배열을 생성한다.
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i = 0; i < preMonth; i++) {
			totalCnt += monthArray[i];
			
			
		}
		//해당 년도가 윤년인지 판단하고 윤년인 경우 3월 이상이면 1을 추가해준다.
		if (month >=3 && isLeafYear(year))
		totalCnt++;
		
		totalCnt += day;
		return totalCnt;
	}
	
	//년도의 매월 마지막 날짜를 구하는 메서드 
	private int getLastDay(int year, int month){
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeafYear(year)){
			//윤년이면 2웡달을 29일로 바꿔야 한다.
			monthArray[1] = 29;
		}
		return monthArray[month-1];
		
	}
	
	public void print(int year){
		System.out.println(year+"달력입니다.");
		for(int i=1;i<=12;i++){
			print(year,i);
		}
	}

	public void print(int year, int month) {
		
		System.out.println(year+"년"+month+"월 달력 입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//시작날짜
		int start = 1;
		//마지막날짜
		int end = getLastDay(year, month);
		//해당 달 월의 첫째날의 요일을 구한 것.
		int dayOfWeek = getCount(year,month,1)%7;
		
		//요일수 만큼 탭 처리
		//월요일이면 dayOfWeek => 1
		//화요일이면 dayOfWeek => 2
		//토요일이면 dayOfWeek => 6
		//일요일이면 dayOfWeek => 0
		for(int i=0;i<dayOfWeek;i++){
			System.out.print("\t");
		}
		
		
		
		for(int i=start;i<=end;i++){
			System.out.print(i+"\t");
			//dayOfWeek을 증가해서
			dayOfWeek++;
			//dayOfWeek가 7이 되면 개행을 해서 일요일로 바꿔즘 
			if(dayOfWeek%7==0){
				System.out.println();
			}
		}
		System.out.println();
		
		
	}
	
	public void print(int year, int month, int day){
		int totalCnt = getCount(year,month,day);
		int rest = totalCnt % 7;
		String dayOfWeek = "";
		switch(rest){
		//5월29일 캘린더데모 클래스에는 숫자로 되어있음. 하지만 코딩은 누구나 알아볼 수 있도록 영어로 명칭하는 것이 좋다.
		//그래서 위에서 나머지 숫자를 영어로 변환해서 더욱 코딩명을 명료하게 만듬.
		case Calendar.MONDAY : dayOfWeek = "월요일"; break;
		case Calendar.TUESDAY : dayOfWeek = "화요일"; break;
		case Calendar.WEDNESDAY : dayOfWeek = "수요일"; break;
		case Calendar.THURSDAY : dayOfWeek = "목요일"; break;
		case Calendar.FRIDAY : dayOfWeek = "금요일"; break;
		case Calendar.SATURDAY : dayOfWeek = "토요일"; break;
		case Calendar.SUNDAY : dayOfWeek = "일요일"; break;
		
		// 
		}
		System.out.println(year + "년" + month + "월" + day + "일" + dayOfWeek + "입니다.");
	}
	
	
}

