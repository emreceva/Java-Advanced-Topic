import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Student> student = new HashSet<>();

        student.add(new Student(7, "Jack"));
        student.add(new Student(19, "Mike"));
        student.add(new Student(3, "Emma"));
        student.add(new Student(3, "Emma"));
        System.out.println(student);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println("numSet.add(2) = " + numSet.add(2));
        System.out.println("first repeating: " + firstRepeatingChar("java developer"));


    }

    public static Character firstRepeatingChar(String str) {
        Set<Character> chars = new HashSet<>();

        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;
        return null;
    }



}
