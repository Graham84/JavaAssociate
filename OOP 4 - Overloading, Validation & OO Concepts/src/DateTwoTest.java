
public class DateTwoTest {

	public static void main(String[] args) {
		
		DateTwo dateObj = new DateTwo();
		
		dateObj.setDate(06,12,2015);
		dateObj.displayDate();
		dateObj.setDate(06,14,2015);
		dateObj.displayDate();
		dateObj.setDate(35,12,2015);
		dateObj.displayDate();
		dateObj.setDate(06,12,201);
		dateObj.displayDate();
		
		DateTwo date = new DateTwo();
		date.setDay(28);
		date.setMonth(11);
		date.setYear(2011);
		
		System.out.println("DateTwo: " + date.getDay() + "/" + 
		date.getMonth() + "/" + date.getYear());
		
	}

}
