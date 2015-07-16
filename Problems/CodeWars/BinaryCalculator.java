public class BinaryCalculator {
  public static String calculate(final String n1, final String n2, final String o) {
    try {
      int bin1 = Integer.parseInt(n1, 2);
      int bin2 = Integer.parseInt(n2, 2);
      if(o == "subtract") return Integer.toBinaryString(bin1 - bin2);
      else if(o == "add") return Integer.toBinaryString(bin1 + bin2);
      else if(o == "multiply") return Integer.toBinaryString(bin1 * bin2);
    }
    catch(Exception e) {
    }
    return "";
  }
  
  public static void main(String[] args){
	System.out.println(calculate("1", "1", "multiply"));
  }
}