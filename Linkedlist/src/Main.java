import java.util.LinkedList;

public class Main{

    public static void main (String[] arg) {
        //create a Linked List
        LinkedList<String> students = new LinkedList<>();

        // Add Students to LinkedList
        students.add("Charlie");
        students.add("Milka");
        students.add("Brian");
        students.add("Abigail");
        students.add("Faith");

        students.addFirst("Abi");
        students.addLast("Fai");
        students.add(index:2, element:"Tara");

        String firstStudent = students.getFirst();
        System.out.println("First" + firstStudent);
        String lastStudent = students.getLast();
        System.out.println("Last" + lastStudent);
        System.out.println(students.size());
        System.out.println(students);

        String secondStudent = studnets.get(1);
        System.out.println("second" + secondStudent);

        int i = students.indesOf("Morgan");
        System.out.println("index of morgan" + i);

        students.removeFirst();
        students.removeLast();
        students.remove(o:"Jamie");
        students.remove(index:1);
        System.out.println(students);

        Boolean hasTaylor = students.contains("Taylor");
        System.out.println(hasTaylor);


        students.clear();
        System.out.println(studnets);

    }

}




