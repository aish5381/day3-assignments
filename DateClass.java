public class DateClass{

	public static void main(String[] args){
	
	Date date=new Date(12,8,1998);
	String date1;

	date.displayDate();
	//date.dateToString();
	date1=date.datetoString();
	System.out.println("Date in string is "+date1);
	
	}
}