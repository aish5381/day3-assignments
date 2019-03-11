public class Date{

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public void displayDate(){
		System.out.println("The day is "+day+" month "+month+" year"+year);
	}

	public String dateToString(){
		//String str1=Integer.toString(day);
		//String str2=Integer.toString(month);
		//String str3=Integer.toString(year);
		return (str1+str2+str3).toString;
	}

	
}