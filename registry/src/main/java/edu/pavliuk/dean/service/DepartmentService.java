package edu.pavliuk.dean.service;

import edu.pavliuk.dean.model.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DepartmentService {
    private List<Department> list=new ArrayList<>(
            Arrays.asList(
                    new Department(1,"Olga Kobylianska Theater","Olga Tarasivna","123"),
                    new Department(2,"Philharmonic","Valera Horosh","456"),
                    new Department(3,"Drama Theater","Sergij Romanov","789")
            )
    );
    public List<Department> getAll(){
        return list;
    }
}
