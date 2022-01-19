import java.util.*; 
 
public class Percentage{

     public static void main(String []args){
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks in Subject 1");
        int a= sc.nextInt();  
        System.out.println("Enter the marks in Subject 2");
        int b= sc.nextInt();  
        System.out.println("Enter the marks in Subject 3");
        int c= sc.nextInt();  
        int d=(a+b+c)/3;
        System.out.println("Total= " +d);  
	if(d<40){
	System.out.println("You are fail");
	}else if (d>40 && d<60){
	System.out.println("You are Pass");
	}else if(d>60 && d<80){
	System.out.println("You are first division");
	}else {
	System.out.println("You are merit");
	}
	
     }
}