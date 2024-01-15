import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student<String, Integer> s1 = new Student<String, Integer>("Серджей", 25);
        System.out.println(s1);
        Student<String, Integer> s2 = new Student<String, Integer>("Андрей", 22);
        Student<String, Integer> s3 = new Student<String, Integer>("Даша", 27);

        List<Student<String, Integer>> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
    }
}
