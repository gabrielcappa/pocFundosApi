package com.cappa.pocFundosApi.controller;

import com.cappa.pocFundosApi.model.FundoEntity;
import com.cappa.pocFundosApi.repository.FundoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fundos")
public class FundoController {

    @Autowired
    private FundoRepository repository;

    @GetMapping
    public List<FundoEntity> getFundos(){
        return repository.findAll();
    }
}
