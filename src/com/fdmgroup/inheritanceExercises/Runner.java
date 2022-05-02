package com.fdmgroup.inheritanceExercises;

public class Runner {

	public static void main(String[] args) {
		AdminUser a1 = new AdminUser("Swap","122345","Swapnil");
		AdminUser a2 = new AdminUser("Swapn","12345","Swapn");
		
		Customer c1 = new Customer("Jim","9876","Jignesh");
		Customer c2 = new Customer("Yats","785412","Yatin");
		
		a1.changePassword("pram","pram");
		a2.changePassword("ded","ded12");
		
		System.out.println(a1.getPassword());
		System.out.println(a2.getPassword());
		
		c1.changePassword("ram","ram");
		c2.changePassword("sam", "sem");
		System.out.println(c1.getPassword());
		System.out.println(c2.getPassword());

		a1.accessWebsite();
		a2.accessWebsite();
		
		c1.accessWebsite();
		c2.accessWebsite();
		
		UserAccountManager ul = new UserAccountManager();
		ul.addUser(a1);
		ul.addUser(a2);
		ul.addUser(c1);
		ul.addUser(c2);
		
		System.out.println(ul.getUserAccounts());
		
		System.out.println(ul.login("Jim", "ram"));
	}

}
