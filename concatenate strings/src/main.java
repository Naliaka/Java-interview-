public class main {
    public static void main(String[] args){
      String firstName = "Shelly";
      String lastName = "parker";

      String name = firstName + " " + lastName;

      System.out.println(name);
      System.out.println(firstName);
      System.out.println(lastName);

      // another way  concatenate
        String concatName = (firstName.concat("")).concat(lastName);
        System.out.println(concatName);

        StringBuilder stringBuilder = new StringBuilder("abc");
        StringBuilder.append("def");
        StringBuilder.append("def");
        StringBuilder.append("def");
        StringBuilder.append("def");
        StringBuilder.insert(offset:9, str:"ALPHA");
        StringBuilder.delete(1, 3);
        String a = stringBuilder.toString();
        System.out.println(a);
    }
}
