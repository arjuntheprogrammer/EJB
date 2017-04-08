/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.ejb.Local;

/**
 *
 * @author arjun
 */
@Local
public interface SayHelloSessionBeanLocal {
    String sayHello(String name);
    
}
