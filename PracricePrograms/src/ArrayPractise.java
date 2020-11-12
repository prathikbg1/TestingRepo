import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPractise {
	

int number;
		
		
	public boolean isPositive() {
        
        if(number > 0) {
                    return true;
        }
        else {
        	return false;
        }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPractise a1=new ArrayPractise();
		a1.number=-5;
		if(a1.isPositive()) {
			System.out.println(a1.number + "is +ve");
		}
		else {
			System.out.println(a1.number + "is -ve");
		}
		
		
		

	}

}
