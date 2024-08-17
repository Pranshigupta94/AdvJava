package io.pragra.learning.Aug12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MarksMain {
    public static void main(String[] args) {
        List<StudentMarks> studentMarks = new ArrayList<>(Arrays.asList(
                StudentMarks.builder().studentId(1L).fName("Pranshi").lName("G").marks(List.of(85, 92, 76, 88)).build(),
                StudentMarks.builder().studentId(2L).fName("Priya").lName("M").marks(List.of(95, 89, 90, 87)).build(),
                StudentMarks.builder().studentId(3L).fName("Manik").lName("K").marks(Arrays.asList(78, 85, 91, 82)).build()
        ));

        // Flatten all student marks into a single list and sort in ascending order
        List<Integer> sortedMarks = studentMarks.stream()
                .filter(s->s.getFName().equals("Pranshi"))
                .flatMap(student -> student.getMarks().stream()) // Flatten the list of marks
               // .sorted(Comparator.naturalOrder())              // Sort in ascending order
                .sorted((s1,s2)-> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println("Pranshi's sorted marks (Ascending): " + sortedMarks);

        // Flatten all student marks into a single list and sort in descending order
        List<Integer> sortedMarksDescending = studentMarks.stream()
                .flatMap(student -> student.getMarks().stream()) // Flatten the list of marks
                //.sorted(Comparator.reverseOrder())              // Sort in descending order
                .sorted((s1,s2)-> s2.compareTo(s1))
                .collect(Collectors.toList());

        System.out.println("All sorted marks (Descending): " + sortedMarksDescending);

    }
}
