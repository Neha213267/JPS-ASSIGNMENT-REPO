package com.springRESTQ6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathFxnsController
{
    @Autowired
    private MathFxnsService mathService;

    @RequestMapping(value = "/add/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b)
    {
        return mathService.add(a,b);
    }

    @RequestMapping(value = "/subtract/{a}/{b}")
    public int subtract(@PathVariable int a,@PathVariable int b)
    {
        return mathService.subtract(a,b);
    }

    @RequestMapping(value = "/multiply/{a}/{b}")
    public int multiply(@PathVariable int a,@PathVariable int b)
    {
        return mathService.multiply(a,b);
    }

    @RequestMapping(value = "/divide/{a}/{b}")
    public double divide(@PathVariable int a,@PathVariable int b)
    {
        return mathService.divide(a,b);
    }
}
