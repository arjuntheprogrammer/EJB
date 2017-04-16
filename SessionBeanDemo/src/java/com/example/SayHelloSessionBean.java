/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.ejb.Stateless;

/**
 *
 * @author arjun
 */
@Stateless
public class SayHelloSessionBean implements SayHelloSessionBeanLocal {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
