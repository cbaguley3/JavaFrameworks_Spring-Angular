package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import com.example.demo.service.InhousePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AddInhousePartController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showFormAddInPart")
    public String showFormAddInhousePart(Model theModel) {
        InhousePart inhousePart = new InhousePart();
        theModel.addAttribute("inhousepart", inhousePart);
        return "InhousePartForm";
    }

    @PostMapping("/showFormAddInPart")
    public String submitForm(@Valid @ModelAttribute("inhousepart") InhousePart part, BindingResult theBindingResult, Model theModel) {
        theModel.addAttribute("inhousepart", part);

        if (theBindingResult.hasErrors()) {
            return "InhousePartForm";
        } else {
            InhousePartService repo = context.getBean(InhousePartService.class);

            // My code to check if inventory is less than the minimum
            if (part.getInv() < part.getMinInv()) {
                theBindingResult.rejectValue("inv", "error.inhousepart", "Inventory cannot be less than the minimum inventory level.");
                return "InhousePartForm";
            }

            InhousePart ip = repo.findById((int) part.getId());
            if (ip != null) part.setProducts(ip.getProducts());
            repo.save(part);

            return "confirmationaddpart";
        }
    }
}