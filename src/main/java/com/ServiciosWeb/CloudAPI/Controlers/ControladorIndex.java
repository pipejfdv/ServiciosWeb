package com.ServiciosWeb.CloudAPI.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/ServiciosWeb")
public class ControladorIndex {
    @GetMapping("/Registro")
    public String Registro() {
        return "Index";
    }
}
