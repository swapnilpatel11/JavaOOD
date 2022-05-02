package com.fdmgroup.inheritanceExercises;

import java.util.ArrayList;

public class UserAccountManager {
	
	private ArrayList<UserAccount> userAccounts;
	
	public UserAccountManager() {
		super();
		userAccounts = new ArrayList<UserAccount>();
	}

	public void addUser(UserAccount user) {
		userAccounts.add(user);
	}
	
	
	public boolean login(String username,String password) {
		for(UserAccount userAccount : getUserAccounts())
			if(userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password))
			{
				return true;
			}
			return false;
			
			
	}

	public ArrayList<UserAccount> getUserAccounts() {
		return userAccounts;
	}

}
