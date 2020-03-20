import java.util.*;
import java.io.*;

public class leap{
	
		public static void main(String[] aregs){
			
			Scanner in=new Scanner(System.in);
			
			
			int year=in.nextInt();
			
			if((year%400==0) || (year%4==0) && (year%100!=0)){
				System.out.println(year+ " year is Leap ");
			}
			else{
				
				System.out.println(year+"year is Not Leap");
			}
			
		}
	
}