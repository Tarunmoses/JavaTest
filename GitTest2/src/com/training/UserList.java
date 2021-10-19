package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {
	List<User> userlist = new ArrayList<User>();

	public void addUser() {
		Scanner sc = new Scanner(System.in);
		User temp = new User();
		System.out.print("Enter id - ");
		temp.setId(sc.nextInt());
		System.out.print("Enter name - ");
		temp.setName(sc.next());
		System.out.print("Enter email - ");
		temp.setEmail(sc.next());
		userlist.add(temp);
	}
	
	public void searchUser(int id) {
		int count=0;
		for (User user : userlist) {
			if(id==user.getId()) {
				System.out.println("User Found : "+user);
				break;
			}
			count++;
		}
		if(count>=userlist.size())
			System.out.println("User Not Found");
	}
	
	public void delUser(int id) {
		int count=0;
		for (User user : userlist) {
			if(id==user.getId()) {
				System.out.println("User Deleted : "+user);
				userlist.remove(count);
				break;
			}
			count++;
		}
		if(count>=userlist.size())
			System.out.println("User Not Found");
	}
	
	public void displayAll() {
		for (User user : userlist) {
			System.out.println(user);
		}
	}
	
}
