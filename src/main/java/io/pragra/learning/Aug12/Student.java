package io.pragra.learning.Aug12;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder

public class Student {
    private Long studentId;
    private String fName;
    private String lName;
    private List<String> courses;
    
}
