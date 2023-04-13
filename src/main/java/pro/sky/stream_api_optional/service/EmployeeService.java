package pro.sky.stream_api_optional.service;

import org.springframework.stereotype.Service;
import pro.sky.stream_api_optional.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private Employee [] staff = new Employee[10];
    EmployeeService() {
        staff [0] = new Employee("Иванов", "Иван", "Иванович", 1, 14500);
        staff [1] = new Employee("Петров", "Иван", "Васильевич", 5, 15500);
        staff [2] = new Employee("Пупкин", "Василий", "Петрович", 3, 15685);
        staff [3] = new Employee("Васильева", "Марфа", "Петровна", 4, 16524);
        staff [4] = new Employee("Сидоров", "Александр", "Иванович", 3, 14327);
        staff [5] = new Employee("Пупенко", "Ольга", "Владимировна", 2, 15458);
        staff [6] = new Employee("Дудка", "Николай", "Александрович", 3, 16895);
        staff [7] = new Employee("Иванова", "Марина", "Николаевна", 1, 15855);
        staff [8] = new Employee("Петрова", "Любовь", "Александровна", 5, 14252);
        staff [9] = new Employee("Сидорова", "Елена", "Львовна", 2, 15328);
    }
    public Employee getMaxSalaryByDept(int department) {
        return Arrays.stream(staff)
                .filter(e -> e != null)
                .filter(e -> e.getDepartment() == department)
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new IllegalArgumentException("Нет сотрудников в отделе"));
    }
    public Employee getMinSalaryByDept(int department) {
        return Arrays.stream(staff)
                .filter(e -> e != null)
                .filter(e -> e.getDepartment() == department)
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new IllegalArgumentException("Нет сотрудников в отделе"));
    }
    public List<Employee> showAll() {
        return Arrays.stream(staff)
                .filter(e -> e != null)
                .sorted(Comparator.comparingInt(Employee ::getDepartment))
                .collect(Collectors.toList());

    }
    public List<Employee> showAllDept(int department) {
        return Arrays.stream(staff)
                .filter(e -> e != null)
                .filter(e -> e.getDepartment() == department)
                .collect(Collectors.toList());
    }




}
