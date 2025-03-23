package lk.ac.vau.fas.it.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class studentController {

    @GetMapping("/name")
    public String name() {
        return "My name is Nuwan";
    }

    @GetMapping("/getReg")
    public String getReg() {
        return "2020ICT001";
    }

    @GetMapping("/getAge")
    public Integer getAge() {
        return 24;
    }
}

