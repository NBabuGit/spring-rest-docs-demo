package com.example.springrestdocsdemo.controller;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.reactive.WebFluxLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.reactive.WebFluxLinkBuilder.linkTo;

@RestController
@RequestMapping("/")
public class IndexController {

    static class CustomRepresentationModel extends RepresentationModel<CustomRepresentationModel> {
        public CustomRepresentationModel(WebFluxLinkBuilder.WebFluxLink initialLink) {
            super();
        }
    }

    @GetMapping
    public CustomRepresentationModel index() {
        return new CustomRepresentationModel(linkTo(CRUDController.class).withRel("crud"));
    }
}
