package com.question3;


public class TestSynchronization {
	
	public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Hritik", "Hello Good morning....!", sender);
		User t2= new User("Nikunj","Hii!! how  are you?",sender);
		
		t1.start();
		t2.start();
	}

}