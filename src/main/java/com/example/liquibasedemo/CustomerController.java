   package com.example.liquibasedemo;

   import org.springframework.beans.factory.annotation.Autowired;
   import org.springframework.http.HttpStatus;
   import org.springframework.http.ResponseEntity;
   import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> save(@RequestBody  CustomerDto customerDto){
    Customer customer = new Customer();
    customer.setName(customerDto.getName());
    customer.setAge(customerDto.getAge());
    return new ResponseEntity<>(customerRepository.save(customer), HttpStatus.CREATED);
    } 
}