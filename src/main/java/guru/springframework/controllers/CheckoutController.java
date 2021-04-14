package guru.springframework.controllers;

import guru.springframework.comands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by jt on 2/1/16.
 */

@Controller
public class CheckoutController {

    @RequestMapping("/checkout")
    public String checkoutForm() {
        return "checkoutform";
    }


    @PostMapping(value = "/docheckout")
    public String doCheckout(@Valid CheckoutCommand checkoutCommand,
                             BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "checkoutform";
        }

        return "checkoutcomplete";

    }
}
