package cn.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//写一个属性，从git中获取
	@Value("${jtver}")
	private String jtver;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "hello springboot "+name+"("+jtver+")";
	}
}
