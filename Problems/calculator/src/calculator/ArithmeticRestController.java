package calculator;

import org.springframework.web.bind.annotation.*;

@RestController
class ArithmeticRestController {
    
    @GetMapping(value = "/{operation}")
    public String calculate(@PathVariable String operation, @RequestParam int a, @RequestParam int b) {
        
        switch (operation) {
            case "add":
                return Integer.valueOf(a + b).toString();
            case "mult":
                return Integer.valueOf(a * b).toString();
            case "subtract":
                return Integer.valueOf(a - b).toString();
        }
        
        return "Unknown operation";
    }
}