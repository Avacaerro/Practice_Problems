import java.util.*;
public class FruitGuy{
 
 private static final String empty[] = {};
 
 public static String[] removeRotten(String[] rotten) {
   String temp = "";
   if(rotten == null || rotten == empty){
     return empty;
   }
   for(int i = 0; i < rotten.length; i++){
     temp = rotten[i];
     temp = temp.replaceFirst("rotten", ""); //strings are immutable, have to set it equal to
     temp = temp.toLowerCase();
	 rotten[i] = temp;
   }
     return rotten;
 }

   public static void main(String args[]){
	   String[] rotten = new String[]{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
	   System.out.print(Arrays.toString(removeRotten(rotten)));
   }
}