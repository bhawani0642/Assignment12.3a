package com.prienc;
// making an exception class  NotEligibleToVoteException it extends the exception class

public class NotEligibleToVoteException extends Exception{
	//Declaring variable int age
	int age;
	// making a constructor
	  public  NotEligibleToVoteException(int age){
		  
		  this.age =age;
		}
	  //this function shows why exception is thrown it is toString method
      public String toString(){
    	  return "For voting you age must be 18+ and your current age is "+age+" So you are not eligible for voting";
	}
      
}
