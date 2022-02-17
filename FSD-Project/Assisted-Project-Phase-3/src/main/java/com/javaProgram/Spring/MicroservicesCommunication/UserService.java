package com.javaProgram.Spring.MicroservicesCommunication;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class UserService {
	
	@Autowired
    UserRepository userRepository;
    
    RestTemplate restTemplate = new RestTemplate();
        
    public UserResonse getPerson(int userId){
        final String uri = "http://localhost:8082/webapitwo/hobby/{userId}";
        
         Map<String, Integer> params = new HashMap<String, Integer>();
         params.put("userId", userId);
         
         String result = restTemplate.getForObject(uri, String.class, params);
         UserEntity users=userRepository.findById(userId).get();
         UserResonse pr=new UserResonse();
         pr.setUserId(users.getPersonId());
         pr.setName(users.getName());
         pr.setAge(users.getAge());
         pr.setHobby(result);
        
        return pr;
    }   
    public void addPerson(UserEntity user){
        userRepository.save(user);
    }


}
