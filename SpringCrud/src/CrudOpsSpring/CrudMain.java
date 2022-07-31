package CrudOpsSpring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import 

public class CrudMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext ac=  new ClassPathXmlApplicationContext("bean.xml");
		CrudMethods cm= (CrudMethods) ac.getBean("CrudMethods");
		
		Scanner select=new Scanner(System.in);
		while(true)
		{
		System.out.println("\n");
		System.out.println("Welcome to our System");
		System.out.println("1.Insert\n 2.Read\n 3.Update\n 4.Delete\n 5.Exit");
		int ch=select.nextInt();
		switch(ch)
		{
		case 1: cm.Insert();
		break;
		case 2: cm.Read();
		break;
		case 3: cm.Update();
		break;
		case 4: cm.Delete();
		break;
		case 5: System.out.print("Thank you for visiting");
		System.exit(0);
		default: System.out.println("Invalid number enter between 1 to 4");
		}
	}

	}

}
