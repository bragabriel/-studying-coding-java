package predicate;

import predicate.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        Student e1 = new Student();
        Student e2 = new Student();
        e1.setAge(22);
        e2.setAge(3);
        e1.setName("Gabriel");
        e2.setName("Asd");

        studentList.add(e1);

        Predicate<Student> isAgeGreaterThan21 = st -> st.getAge() >= 21;

        List<Student> filteredStudents = studentList
                .stream()
                .filter(isAgeGreaterThan21)
                .collect(Collectors.toList());

        System.out.println("Resultado:");
        for (Student student : filteredStudents) {
            System.out.println("Nome: " + student.getName() + ", Idade: " + student.getAge());
        }
    }
}
