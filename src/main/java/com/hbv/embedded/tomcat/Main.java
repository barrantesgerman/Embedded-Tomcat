///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.hbv.embedded.tomcat;
//
//import java.io.File;
//import org.apache.catalina.startup.Tomcat;
//
///**
// *
// * @author Herman Barrantes
// * @since 03-mar-2015
// */
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//
//        String webappDirLocation = "src/main/webapp/";
//        Tomcat tomcat = new Tomcat();
//
//        //The port that we should run on can be set into an environment variable
//        //Look for that variable and default to 8080 if it isn't there.
//        String webPort = System.getenv("PORT");
//        if (webPort == null || webPort.isEmpty()) {
//            webPort = "8080";
//        }
//
//        tomcat.setPort(Integer.valueOf(webPort));
//
//        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
//        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());
//
//        tomcat.start();
//        tomcat.getServer().await();
//    }
//
//}
