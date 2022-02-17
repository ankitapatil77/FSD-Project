package com.javaProgram.Spring.MicroservicesCommunication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapione")

public class UserController {
	


    @Autowired
    UserService personService;
    
    @RequestMapping("/user/{personId}")
    public UserResonse getUser(@PathVariable int personId){
        return personService.getUser(personId);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/user")   
    public void addUser(@RequestBody UserEntity pe ) {
        personService.addUser(pe);
    }


}
