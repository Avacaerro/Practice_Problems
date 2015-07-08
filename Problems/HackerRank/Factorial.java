import java.io.*;
import java.util.*;
import java.math.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        BigInteger n = new BigInteger(read.next());
        System.out.println(factorial(n));
    }
    
    public static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}