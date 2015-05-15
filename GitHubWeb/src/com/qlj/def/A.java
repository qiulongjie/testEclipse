package com.qlj.def;

import java.net.URL;

import sun.util.resources.CalendarData_ja;

public class A {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.ext.dirs"));
		
		System.out.println(String.class.getClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(CalendarData_ja.class.getClassLoader());
		
		URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (int i = 0; i < urls.length; i++) {
		     System.out.println(urls[i].toExternalForm());
		} 
	}
}
