package com.javaProgram.Spring.RestFul_Web_Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

public class MainController {
	
	@RequestMapping("/")
    @ResponseBody
    public String index() {
           
           RestTemplate restTemplate = new RestTemplate();
       Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
          
      return quote.toString();
    }
     


}
