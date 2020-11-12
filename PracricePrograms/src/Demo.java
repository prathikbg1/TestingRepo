import java.util.Random;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]= {50,50};
		double avg=averege(score);
		System.out.println("avg is :" + avg);
		
	}
		public static double averege(int a[]) {
			int total=0;
			for(int i=0;i<a.length;i++) {
				total=total+a[i];
			}
			return (double) total/a.length;
			
		}
			
	
		
			
		
}


