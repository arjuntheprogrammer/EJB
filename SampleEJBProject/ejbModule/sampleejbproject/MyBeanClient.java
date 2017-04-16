package sampleejbproject;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MyBeanClient {

    public static void main(String[] args) {
         try { 
          InitialContext ctx = new
          InitialContext(); 
          MyBeanRemote bean = (MyBeanRemote) ctx.lookup(MyBeanRemote.class.getName()); 
          bean.doSomething(); 
         } 
         catch (NamingException e) { 
             e.printStackTrace(); 
         }
  }
}