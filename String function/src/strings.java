public class strings {
    public static void main(String[] args) {
        String literal = "hello";
        String obj = new String( original:"hello");
        String otherLiteral = "hello";

        //literal --->"hello"
        //otherLiteral --^

        //obj --->"hello"
        //otherobj ---> "hello"

       System.out.println(literal == obj);// return false
       System.out.println(literal == otherLiteral);
       System.out.println(literal.equals(obj));// returns true
       System.out.println(literal.equals(otherLiteral)); // returns true

        System.out.println();

        System.out.println(obj == otherobj); // return false
        System.out.println(obj.equals(otherobj)); // return true

    }
}

//note
//....................
// use the string instance method .equals() instead of ==