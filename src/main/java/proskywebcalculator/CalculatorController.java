package proskywebcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator")
    public String answerWelcome(){
        return calculatorService.answerWelcomee();
    }

    @GetMapping(path = "/calculator/plus")
    public String numPlus(@RequestParam(required = false,name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        return calculatorService.numPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String numMinus(@RequestParam(required = false,name = "num1") Integer num1, @RequestParam(required = false,name = "num2") Integer num2) {
        return calculatorService.numMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String numDivide(@RequestParam(required = false,name = "num1") Double num1, @RequestParam(required = false,name = "num2") Double num2) {
        return calculatorService.numDivide(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String numMultiply(@RequestParam(required = false,name = "num1") Integer num1, @RequestParam(required = false,name = "num2") Integer num2) {
        return calculatorService.numMultiply(num1, num2);
    }
}