package kz.kbtu.sf.base.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import kz.kbtu.sf.base.dto.EmployeeDTO;
import kz.kbtu.sf.base.model.Employee;
import kz.kbtu.sf.base.repository.EmployeeRepository;
import kz.kbtu.sf.base.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @Operation(summary = "Get All Employees")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Employee List",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Iterable.class)) }),
            @ApiResponse(responseCode = "204",
                    description = "No employee found",
                    content = @Content) })
    @Tag(description = "EmployeeController", name = "My Employee")
    @GetMapping("/employees")
    public Iterable<Employee> findAllEmployees() {
        return this.employeeService.findAll();
    }


    @Tag(description = "EmployeeController", name = "My Employee")
    @PostMapping("/employees")
    public Employee addOneEmployee(@RequestBody EmployeeDTO employee) {
        return this.employeeService.save(employee);
    }
}
