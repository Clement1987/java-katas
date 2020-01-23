public class Fibonacci {

    public static int fiboRecursive(int fibo) {
    	
    	if(fibo <= 1) {
    		 return fibo;	
    	}
    	
    	else {
    		return fiboRecursive(fibo-1) + fiboRecursive(fibo-2);
    	}
    }
}
