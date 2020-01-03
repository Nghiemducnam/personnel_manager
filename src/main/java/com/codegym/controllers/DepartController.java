package com.codegym.controllers;

import com.codegym.models.Departs;
import com.codegym.services.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartController {
    @Autowired
    private DepartService departService;
    @RequestMapping(value = "/api/department/", method = RequestMethod.GET)
    ResponseEntity<List<Departs>> getDepartList(){
        List<Departs> departs  = departService.findAllDepartments();
        if(departs.isEmpty()){
            return  new ResponseEntity<List<Departs>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Departs>>(departs, HttpStatus.OK);
    }
}