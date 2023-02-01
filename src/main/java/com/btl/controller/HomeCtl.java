package com.btl.controller;

import com.btl.model.Person;
import com.btl.model.ResponseClient;
import com.btl.service.DAOImpl.PersonDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class HomeCtl {
    private PersonDAOImpl personDAO;
    @Autowired
    public HomeCtl(PersonDAOImpl personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping(path = "", produces = "application/json")
    ResponseClient test() {
        List<Person> personList = personDAO.getAllPerson();
        for (Person person: personList) {
            System.out.println("Person: "+person);
        }
        return new ResponseClient(200,"success", personList);
    }
}
