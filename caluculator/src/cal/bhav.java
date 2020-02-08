package cal;
import cal1.*;
import java.util.Scanner;
public class bhav {
public static void main(String[] args)
{
	bhav1 b =new bhav1();
	char c;
	int a,d;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	d=sc.nextInt();
	c=sc.next().charAt(0);
	switch(c)
	{
	case '+': 
				b.add(a,d);
				break;
	case '-':
				b.sub(a,d);
				break;
	case '*':
				b.mul(a,d);
				break;
	case '/':
				b.div(a,d);
				break;
	default:
				System.out.println("wrong input");
				break;
				
	}
	
}
}
