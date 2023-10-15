package com.cdac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FreeController {
        @GetMapping("/add")
        public String add(){
        return "From Add COmponent of the COntroller";
        }

        @GetMapping("/sub")
        public String sub(){
        return "From SUB COmponent of the COntroller";
        }

        @GetMapping("/mul")
        public String mul(){
        return "From MUL COmponent of the COntroller";
        }
}