package com.sree.test.lambda;

public class RunnableLambdaExample{

	public static void main(String[] args) {


		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("First Data from Runnable");
			}
		};
		
		new Thread(runnable).start();
		
		
		//With Lambda
		
		Runnable lambdaRunnable = () ->{
			System.out.println("Second data from Runnable");
		};
		
		new Thread(lambdaRunnable).start();
		
		//With Lambda simplified
		
		Runnable lambdaRunnableNew = () -> System.out.println("Third data from Runnable");
		
		new Thread(lambdaRunnableNew).start();
		
		new Thread(()->System.out.println("All fuzed")).start() ;
	}



}
