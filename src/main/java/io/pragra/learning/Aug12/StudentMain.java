package io.pragra.learning.Aug12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                Student.builder().studentId(1L).fName("Pranshi").lName("G").courses(List.of("Core Java", "Math","C", "Science")).build(),
                Student.builder().studentId(2L).fName("Priya").lName("M").courses(List.of("Python", "Math","Tech" ,"Science")).build(),
                Student.builder().studentId(3L).fName("Manik").lName("K").courses(List.of("C++", "C","Math", "Science")).build()
        ));
// concat "ABC" to all students fname
       // students.stream().map(student -> student.getFName().concat("ABC")).forEach(System.out::println);
//concat all courses
        // flatmap - to flatten the stream . if you have list of list(list<list<string>>)
      //  students.stream().flatMap(student -> student.getCourses().stream()).sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        students.stream().flatMap(student -> student.getCourses().stream()).sorted((s1, s2)-> s2.compareTo(s1)).distinct().forEach(System.out::println);
    // in descending order( (s1, s2) ->s1.compareto(s2) * -1)
        //in ascending (s1, s2)-> s1.compareTo(s2)

        }
}
