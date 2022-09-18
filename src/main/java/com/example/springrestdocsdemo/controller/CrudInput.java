package com.example.springrestdocsdemo.controller;

import lombok.Data;

import java.net.URI;
import java.util.List;

@Data
public class CrudInput {

    private long id;

    private String title;

    private String body;

    private List<URI> tagUris;
}
