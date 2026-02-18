package ie.atu.sem2lab2oop;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World...";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hello "+ name;
    }
    @GetMapping("/details")
    public String details (@RequestParam String name, @RequestParam Integer age)
    {
        return "Hello "+ name + " " + age;
    }
    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person("Franklin", 18);
        return person;
    }
    @GetMapping("/calculate")
    public CalculationResult calculate(
    @RequestParam double num1,
    @RequestParam double num2,
    @RequestParam String operation) {

    double result = 0;

    switch (operation.toLowerCase()) {
        case "add":
            result = num1 + num2;
            break;
        case "subtract":
            result = num1 - num2;
            break;
        case "multiply":
            result = num1 * num2;
            break;
        case "divide":
            if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
            }
            result = num1 / num2;
            break;
            default:
            throw new IllegalArgumentException("Invalid operation");
        }
        return new CalculationResult(operation, result);
    }
}

