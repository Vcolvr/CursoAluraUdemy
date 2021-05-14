package main;

public class função {

	public static void main(String[] args) {
		    int n= 20;
			int i=1;
		    while(i <= n) {
		        if(i/3==0 && i/5==0){
		            System.out.println("FizzBuzz");
		        }
		        else if(i/3==0 && i/5!=0){
		            System.out.println("Fizz");
		        }
		        else if(i/3==0 && i/5!=0){
		            System.out.println("Buzz");
		        }
		        else {
		            System.out.println(i);
		        }
		        i++;
		    }
		}

	}

