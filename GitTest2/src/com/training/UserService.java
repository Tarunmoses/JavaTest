package com.training;

import java.util.Scanner;

public class UserService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserList lst = new UserList();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1-Add user");
			System.out.println("2-search user");
			System.out.println("3-delete user");
			System.out.println("4-Display all user");
			System.out.println("0-Exit");
			System.out.print("Enter Choice - ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:	lst.addUser();
					break;
			case 2:	System.out.print("\nEnter id - ");
					lst.searchUser(sc.nextInt());
					break;
			case 3:	System.out.print("\nEnter id - ");
					lst.delUser(sc.nextInt());
					break;
			case 4:	lst.displayAll();
					break;
			case 0:	break;
			default:System.out.println("Invalid Choice");
			}
		}while(choice!=0);
	}

}
