package com.jenkinsexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {
	@GetMapping(value="/getting")
	public String gettingmsg()
	{
		return "added Fully";
	}

}
