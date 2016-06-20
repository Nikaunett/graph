package com.graph;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by oshev on 17.06.2016.
 */
@Controller
public class GraphController {
//private static final String hello = "Hello, %s!";
//private final AtomicLong count = new AtomicLong();

   /* @RequestMapping("/")
    public GraphService graph(@RequestParam(value = "name", defaultValue = "Hi") String name){
        return new GraphService(String.format(hello, name));

    }*/
    @RequestMapping("/graph")
    public String graph(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "graph";
    }
}
