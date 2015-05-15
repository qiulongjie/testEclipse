package com.qlj.def;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import sun.net.spi.nameservice.dns.DNSNameService;

public class Demo1 {

     /**
     * @param args
     * @throws FileNotFoundException
     */
     public static void main(String[] args) throws FileNotFoundException {
         
          Demo1 d = new Demo1();
          System.out.println(d.getClass().getClassLoader());
         
         
          ClassLoader cl = DNSNameService.class.getClassLoader();
          System.out.println(cl);
         
          FileInputStream in = new FileInputStream("c:\\RHDSetup.log");
          cl = in.getClass().getClassLoader();
          System.out.println(cl);
         
         
          Demo1 d1 = new Demo1();
         
     }

}