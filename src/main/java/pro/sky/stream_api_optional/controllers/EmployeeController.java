package pro.sky.stream_api_optional.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.stream_api_optional.model.Employee;
import pro.sky.stream_api_optional.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService service;
    EmployeeController(EmployeeService service) {
        this.service=  service;
    }
    @GetMapping("/departments/max-salary")
    public Employee getMaxSalaryByDept (@RequestParam ("departmentsId") Integer id) {
        return service.getMaxSalaryByDept(id);
    }
    @GetMapping("/departments/min-salary")
    public Employee getMinSalaryByDept (@RequestParam ("departmentsId") Integer id) {
        return service.getMaxSalaryByDept(id);
    }
    @GetMapping("/departments/all")
    public List<Employee> getEmployeeByDept (@RequestParam(value = "departmentsId", required = false ) Integer id) {
        if (id == null) {
            return service.showAll();
        }
        return service.showAllDept(id);
    }


}
