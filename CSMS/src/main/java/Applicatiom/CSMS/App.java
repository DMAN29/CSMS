package Applicatiom.CSMS;


import java.util.Scanner;

import GUI.Layout;
import functions.UserFunction;

public class App 
{
	public static void main( String[] args )
    {	
		Layout l = new Layout();    
//===================================main program==========================================//
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		UserFunction U = new UserFunction();
		int k=-1;
		while(k!=0) {
			U.clrscr();
			System.out.println("Input your option \n1.Register User\n2.Login as user\n3.Login as Admin\n0.Exit the program");
			k=sc.nextInt();
			switch(k) {
			case 1: U.register();break;
			case 2: U.login();break;
			case 3: U.admin();break;
			default: System.out.println("Wrong Input Try again");break;
			

			}
		}
    }


}