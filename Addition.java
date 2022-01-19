import java.util.Scanner;

class Addition
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);

int x,y,s;

System.out.println("Enter First Number:");
x = obj.nextInt();

System.out.println("Enter Second Number:");
y = obj.nextInt();

s = x + y;

System.out.println("Sum = " + s);

}

}