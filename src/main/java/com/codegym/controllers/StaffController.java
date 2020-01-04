package com.codegym.controllers;

import com.codegym.models.Staff;
import com.codegym.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
//@CrossOrigin(origins = "*")
@CrossOrigin(maxAge = 3600)
@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;
    @RequestMapping(value = "/api/staff/", method = RequestMethod.GET)
    ResponseEntity<List<Staff>> getStaffList(){
        List<Staff> staffList = staffService.findAllStaff();
        if(staffList.isEmpty()){
            return new ResponseEntity<List<Staff>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Staff>>(staffList, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/staff/", method = RequestMethod.POST)
    ResponseEntity<Staff> createStaff(@RequestBody Staff staff, UriComponentsBuilder ucBuilder){
        staffService.saveStaff(staff);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/staff/{id}").buildAndExpand(staff.getStaffId()).toUri());
        return new ResponseEntity<Staff>(headers, HttpStatus.CREATED);
    }

}