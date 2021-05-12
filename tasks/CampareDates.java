package tasks;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class CampareDates {
	static int DateCompare(java.util.Date date1,java.util.Date date2) {
	    int res=0;
	    if(date1==null ||date2==null) {
	        res=-1;
	    }
	    if(date1==date2) {
	        res=0;
	    }
	    if(date1.compareTo(date2)>0) {
	        res=1;
	    }
	    if(date1.compareTo(date2)<0) {
	        res=2;
	       
	    }
	    return res;
	   
	}
	public static void main(String[] args) throws ParseException {
	    System.out.println("enter 2 Date Values");
	    SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
	    Scanner sc=new Scanner(System.in);
	   
	    java.util.Date date1=s.parse(sc.next());
	    java.util.Date date2=s.parse(sc.next());
	    int res=DateCompare(date1,date2);
	   
	    if(res == -1) {
	        System.out.println("dates are null");
	    }
	    if(res==0) {
	        System.out.println("Both are Equal");
	    }
	    if(res==1) {
	        System.out.println("date1 is before date 2");
	    }
	    if(res==2) {
	        System.out.println("date1 is after date 2");
	    }
	}
}
	