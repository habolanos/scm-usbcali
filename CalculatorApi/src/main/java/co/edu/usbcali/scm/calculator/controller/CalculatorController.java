package co.edu.usbcali.scm.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.scm.calculator.model.OperationRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Operation(summary = "Suma dos números")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Suma exitosa"),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    @PostMapping("/sum")
    public double sum(@RequestBody OperationRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @Operation(summary = "Resta dos números")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Resta exitosa"),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    @PostMapping("/subtract")
    public double subtract(@RequestBody OperationRequest request) {
        return request.getNumber1() - request.getNumber2();
    }

    @Operation(summary = "Multiplica dos números")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Multiplicación exitosa"),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    @PostMapping("/multiply")
    public double multiply(@RequestBody OperationRequest request) {
        return request.getNumber1() * request.getNumber2();
    }

    @Operation(summary = "Divide dos números")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "División exitosa"),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    @PostMapping("/divide")
    public double divide(@RequestBody OperationRequest request) {
        if (request.getNumber2() == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return request.getNumber1() / request.getNumber2();
    }
}