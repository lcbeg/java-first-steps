package checkPrime;
import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i=0; i <= 4; i++) {
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        arr[i] = n;
        };
        Prime.checkPrime(arr);
    }
} 

class Prime {
	static String output = "";
	
    static void checkPrime(int[] numbers){
    	for( int i=0; i<=4;i++) {
            if(BigInteger.valueOf(numbers[i]).isProbablePrime(1)){
                    BigInteger num = BigInteger.valueOf(numbers[i]);
                    if (num.isProbablePrime(1)){
                    	output += (num + " ");
                    }
            }
            if (i != 3) System.out.println(output);
        }
    }
}
