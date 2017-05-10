package com.github.vangogh_ken.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.vangogh_ken.service.ClientService;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;
    
    @RequestMapping(value = "/echo",method = RequestMethod.GET)
    public String echo(@RequestParam String name){
        return clientService.echo(name);
    }
    
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return clientService.test();
    }
}
