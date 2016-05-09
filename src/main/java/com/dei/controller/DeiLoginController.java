/**
 * 
 */
package com.dei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rthoma24
 * Apr 28, 2016
 */
@Controller
public class DeiLoginController {


	 @RequestMapping("/")
	    public String getIndexPage() {
	        return "index";
	    }
	 @RequestMapping("/sample")
	    public String getIndexPage1() {
	        return "sample";
	    }
	 
	 @RequestMapping("/test")
	    public String getIndexPage123() {
	        return "test";
	    }
}
