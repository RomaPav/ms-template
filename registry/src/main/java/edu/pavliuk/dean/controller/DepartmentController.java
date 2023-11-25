package edu.pavliuk.dean.controller;

import edu.pavliuk.dean.model.Department;
import edu.pavliuk.dean.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/regestry")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Department> getAll(){
        return departmentService.getAll();
    }

    @RequestMapping(value = "/longShow/{theater}",method = RequestMethod.GET)
    public Map<String,List<String>> getLongShowForTheater9(@PathVariable String theater){
        return departmentService.getAllGoodForTheater(theater);
    }

}
