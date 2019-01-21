// challenge course
//find the number of vowels and consonants in a given string
// create a method that takes a string input and print out the number of vowels and the number of consonats
// Vowels: a,e,i,o,u,y

// case study
//hell0 -> 2 vowels,3 consonsnts
//there is a quiet mouse -> 10 vowels,8 consonants
//I am happy -> 4 vowels,4 consonants



public class mainn {
    public static void findNumberOfVowelsAndConsonanta(String input) {
        int vowelsCount = 0;
        int consonantCount = 0;
        String vowels = "aeiouy";
        String normalized = (input.toLowerCase()).trim();
        char[] inputCharArry = normalized.toCharArray();

        for (char c : inputCharArray){
           if (vowels.indexOf(c)) != -1){
               vowelsCount++;
            }else if (c !=''){
                consonantCount++;
            }
        }
    }
    System.out.println("There are " + vowelsCount
    + "vowels in" + input);
    System.out.println("There are " + ConsonantCount
    + "consonants in" + input);
    System.out.println();
}
