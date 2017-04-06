package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		//private static variable of the same class
		private static Singleton myObj;
		
		//private Constructor to restrict instantiation from other classes
		private MySingleton() {		
		}
		
		//create static method to get an instance
		public static MySingleton getInstance(){
			if(myObj == null){
				synchronized(MySingleton.class){
					if(myObj == null){
	            myObj = new MySingleTon();
					}
				}
			}
	        return myObj;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
