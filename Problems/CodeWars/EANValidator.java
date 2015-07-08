public class EANValidator {    
    public static boolean validate(final String eanCode) { 
       char[] ean = eanCode.toCharArray();
       int oldCheckSum = Character.getNumericValue(ean[ean.length-1]);
       int newCheckSum = 0;
       for(int i = 1; i < ean.length; i++){
         if(i % 2 == 0) newCheckSum += Character.getNumericValue(ean[i-1])*3;
         else newCheckSum += Character.getNumericValue(ean[i-1]); 
       }
       if(newCheckSum % 10 == 0) newCheckSum = 0;
       else newCheckSum = 10 - (newCheckSum % 10);
	   return newCheckSum == oldCheckSum;
    }
	
	public static void main(String args[]){
		System.out.print(validate("0000000000017"));
	}
}