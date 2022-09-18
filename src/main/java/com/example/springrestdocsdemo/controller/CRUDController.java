package com.example.springrestdocsdemo.controller;

import org.springframework.hateoas.server.reactive.WebFluxLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.reactive.WebFluxLinkBuilder.*;

@RestController
@RequestMapping("/crud")
public class CRUDController {

    @GetMapping
    public List<CrudInput> read(@RequestBody CrudInput crudInput) {
        List<CrudInput> returnList = new ArrayList<>();
        returnList.add(crudInput);
        return returnList;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public HttpHeaders save(@RequestBody CrudInput crudInput) {
        HttpHeaders httpHeaders = new HttpHeaders();
        //httpHeaders.setLocation(linkTo(CRUDController.class).withSelfRel().toMono());
        return httpHeaders;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        // delete
    }
}