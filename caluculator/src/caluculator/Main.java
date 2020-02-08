package caluculator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
	double n1,n2,op;
	char c;
	Scanner sc=new Scanner(System.in);
	n1=sc.nextDouble();
	n2=sc.nextDouble();
	c=sc.next().charAt(0);
	sc.close();
	switch(c)
	{
	case '+':
		op=n1+n2;
		break;
	case '-':
		op=n1-n2;
		break;
	case '*':
		op=n1*n2;
		
		
		break;
	case '/':
		op=n1/n2;
		break;
	default:
		return;
	}
	System.out.println(op);
	}
}
