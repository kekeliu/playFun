package controllers;

import models.User;

public class Security extends Secure.Security {
	
	static boolean authenicate(String username, String password){
		return User.connect(username, password) != null;
	}
	
	static void onDisconnected(){
		Application.index();
	}
	
	static void onAuthenticated(){
		Admin.index();
	}
}
