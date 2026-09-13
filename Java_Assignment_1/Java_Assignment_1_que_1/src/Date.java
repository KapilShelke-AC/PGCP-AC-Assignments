
public class Date {
   int day;
   int month;
   int year;
   
   public void setDate(int dd, int mm, int yy) {
	   year = yy;
	   if(mm < 1 || mm > 12) {
		   month = 1;
	   }
	   else {
		   month = mm;
	   }
	   
	   if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 | month == 12) {
		   if(dd < 1 || dd > 31) {
			   day = 1;
		   }
		   else {
			   day = dd;
		   }
	   }
	   else if(month == 4 || month == 6 || month == 9 || month == 11) {
		   if(dd < 1 || dd > 30) {
			   day = 1;
		   }
		   else {
			   day = dd;
		   }
	   }
	   else {
		   if(year%4 != 0) {
			   if(dd < 1 || dd > 28) {
				   day = 1;
			   }
			   else {
				   day = dd;
			   }
		   }
		   else {
			   if(dd < 1 || dd > 29) {
				   day = 1;
			   }
			   else {
				   day = dd;
			   }
		   }
	   }
   }
   
   public void addDays(int days) {
	   int maxDays = 0;
	   
	   if(month == 2) {
		   if(year%4 == 0) {
			   maxDays = 29;
		   }
		   else {
			   maxDays = 28;
		   }
	   }
	   else if(month == 4 || month == 6 || month == 9 || month == 11) {
		   maxDays = 30;
	   }
	   else {
		   maxDays = 31;
	   }
	   day = day+days;
	   while(day > maxDays) {
		   day = day - maxDays;
		   month++;
		   
		   if(month > 12) {
			   month = 1;
			   year++;
		   }
	   }
	   
	   
   }
   
   public void addMonths(int months) {
	   month = months;
   }
   
   public void addYears(int years) {
	   year = years;
   }
   
   public void display() {
	   System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
   }
   
   public int getDay() {
	   return day;
   }
   
   public int getMonth() {
	   return month;
   }
   
   public int getYear() {
	   return year;
   }
}
