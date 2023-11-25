package edu.pavliuk.dean.service;

import edu.pavliuk.dean.client.ShowClient;
import edu.pavliuk.dean.model.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final ShowClient showClient;
    private List<Department> list=new ArrayList<>(
            Arrays.asList(
                    new Department(1,"Olga Kobylianska Theater","s56rt","Olga Tarasivna","123"),
                    new Department(2,"Philharmonic","s21rp","Valera Horosh","456"),
                    new Department(3,"Drama Theater","s30ps","Sergij Romanov","789")
            )
    );
    public List<Department> getAll(){
        return list;
    }

    public Map<String, List<String>> getAllGoodForTheater(String theater) {
        Map<String,List<String>> result=new HashMap<>();
        List<String> shows = new ArrayList<>();
        Department department= list.stream().filter(el->el.getCodeName().equals(theater)).toList().get(0);
        if (theater.equals("s56rt")){
            shows=showClient.getLongShowForOlga(120L,2);
        }else if (theater.equals("s21rp")){
            shows=showClient.getLongShowForPhilarmonia(100L,1);
        }else if (theater.equals("s30ps")){
            shows=showClient.getLongShowForPhilarmonia(100L,2);
        }
        result.put(department.getName(),shows);
        return result;
    }
}
