public class BatmanQuotes{
  
  public static String getQuote(String[] quotes, String hero){
    int quoteIndex = 0;
    for(int i = 2; i < hero.length(); i++){
      if(Character.isDigit(hero.charAt(i))){
		quoteIndex = Character.getNumericValue(hero.charAt(i));
		hero = hero.startsWith("R") ? "Robin" : hero.startsWith("B") ? "Batman" : "Joker";
	  } 
    }
    return hero + ": " + quotes[quoteIndex];
  }
  
  public static void main(String[] args){
	String[] quotes = { "I am vengeance. I am the night. I am Batman!",
                        "Holy haberdashery, Batman!",
                        "Let's put a smile on that faaaceee!"
                       };
	System.out.println(getQuote(quotes, "Joke2"));
  }

}
