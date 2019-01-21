//Topic to be covered
//................................
//defination of string
//string instances methods:isEmpty,charAT,Substring,etc.
//Advanced string functions:split,equals
//programmatic manipulation of string data





public class main {
    public static void main(String[] args) {
        String p = "Panda";
        String f = "Fish";
        String h = "Horse";
        String c = "Cat";
        String nothing = " ";
        String[] strings = {p, f, c, h, nothing};

        for (String s : strings) {
            System.out.println(s);
            s = s.trim();
            System.out.println(s);

            if (!s.isEmpty()) {
                System.out.println("Not Empty:" + s);
            }
            if (s.length() > 0) {
                System.out.println("More than:" + s);
            }
            if (s.length() > 3) {
                System.out.println("More than 3: " + s);
            }
            if (s.length() >= 3) {
                System.out.println("More than or equal to 3:" + s);
            }

            System.out.println(s.toLowerCase());
            System.out.println(s.toLowerCase());

            System.out.println();
        }
    }
}