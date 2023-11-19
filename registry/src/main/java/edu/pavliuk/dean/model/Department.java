package edu.pavliuk.dean.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    private int id;
    private String name;
    private String consultant;
    private String phone;

}
