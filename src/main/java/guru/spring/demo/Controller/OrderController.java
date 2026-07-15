package guru.spring.demo.Controller;
import guru.spring.demo.Model.TacoOrder;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {
    @PostMapping
    public String processOrder(@Valid TacoOrder order, Errors errors,
                               SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            return "TacoOrder";
        }

        log.info("Processing order: " + order);
        sessionStatus.setComplete();
        return "redirect:/orders/current";
    }
    @GetMapping("/current")
    public String orderForm(@ModelAttribute TacoOrder tacoOrder) {
        return "TacoOrder";
    }

}
