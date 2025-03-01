package co.edu.usbcali.scm.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.edu.usbcali.scm.calculator.model.OperationRequest;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSum() throws Exception {
        OperationRequest request = new OperationRequest();
        request.setNumber1(5);
        request.setNumber2(3);

        MvcResult result = mockMvc.perform(post("/calculator/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andReturn();

        double response = Double.parseDouble(result.getResponse().getContentAsString());
        assertEquals(8, response);
    }

    @Test
    public void testSubtract() throws Exception {
        OperationRequest request = new OperationRequest();
        request.setNumber1(10);
        request.setNumber2(4);

        MvcResult result = mockMvc.perform(post("/calculator/subtract")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andReturn();

        double response = Double.parseDouble(result.getResponse().getContentAsString());
        assertEquals(6, response);
    }

    @Test
    public void testMultiply() throws Exception {
        OperationRequest request = new OperationRequest();
        request.setNumber1(6);
        request.setNumber2(7);

        MvcResult result = mockMvc.perform(post("/calculator/multiply")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andReturn();

        double response = Double.parseDouble(result.getResponse().getContentAsString());
        assertEquals(42, response);
    }

    @Test
    public void testDivide() throws Exception {
        OperationRequest request = new OperationRequest();
        request.setNumber1(15);
        request.setNumber2(3);

        MvcResult result = mockMvc.perform(post("/calculator/divide")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andReturn();

        double response = Double.parseDouble(result.getResponse().getContentAsString());
        assertEquals(5, response);
    }

    @Test
    public void testDivideByZero() throws Exception {
        OperationRequest request = new OperationRequest();
        request.setNumber1(10);
        request.setNumber2(0);

        mockMvc.perform(post("/calculator/divide")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isBadRequest());
    }
}