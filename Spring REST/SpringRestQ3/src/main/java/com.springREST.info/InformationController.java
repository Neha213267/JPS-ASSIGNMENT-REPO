package com.springREST.info;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class InformationController {
	
	    @Autowired
	    private InformationService infoService;

	    @RequestMapping("/info")
	    public List<Information> getAllInfo()
	    {
	        return infoService.getAllInfo();
	    }

	    @RequestMapping("/Infos/{zip}")
	    public Information getInfo(@PathVariable String zip)
	    {
	        return infoService.getInfo(zip);
	    }

}
