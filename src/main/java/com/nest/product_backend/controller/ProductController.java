package com.nest.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/")
    public String HomePage(){
        return "this is my homepage";
    }
    @PostMapping("/add")
    public String ProductAdd(){
        return "this is my addpage";
    }
    @PostMapping("/search")
    public String ProductSearch(){
        return "this is my searchpage";
    }
    @PostMapping("/edit")
    public String ProductEdit(){
        return "this is my editpage";
    }
    @GetMapping("/view")
    public String ProductView(){
        return "this is my viewpage";
    }
    @PostMapping("/delete")
    public String ProductDelete(){
        return "this is my deletepage";
    }

}
