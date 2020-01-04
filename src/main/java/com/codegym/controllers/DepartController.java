package com.codegym.controllers;

import com.codegym.models.Departs;
import com.codegym.services.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
@CrossOrigin(origins = "*")
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

    @RequestMapping(value = "/api/department/", method = RequestMethod.POST)
    ResponseEntity<Departs> createDepartment(@RequestBody Departs departs, UriComponentsBuilder ucBuilder){
        departService.saveDepart(departs);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/department/{id}").buildAndExpand(departs.getDepartId()).toUri());
        return new ResponseEntity<Departs>(headers, HttpStatus.CREATED);
    }
}