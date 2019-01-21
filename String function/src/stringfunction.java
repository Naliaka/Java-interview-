/*split string instance method take a regular
 expression and breaks a string
 outputting a string array
  --string will break a string up based on a single character
  split can split on the dots
  */

public class stringfunction {
    public static void main(String[] args) {
        String text = "The giant panda has an insatiable appetite " +
                "for bamboo.A typical animal eats half the day-a" +
                "full 12 out of evry 24 hours-and relieves itself" +
                "needs.panda will sometimes eat birds or rodents"+
                "as well.";
        String fishText = text.replace (target:"bamboo", replacement:"fish");
        System.out.println(fishText);

        // how many sentences?
        String[] sentences = text.split(regex:"\\.");
        System.out.println("The text has "+ sentences,length + "sentences");

        // how many words?
        String[] words = text.split(regex:" ");
        System.out.println("The text has "+ words,length + "words");

        //how many characracters
        System.out.println(text.length());
    }
}
