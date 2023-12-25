package com.example.jpamapping.unidirectionalonetomany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
/*
    http://localhost:8080/owner/saveOwner
    
    {
		"name":"Sanjay",
		"email":"san@gmail.com",
        "blogList":[
        {
            "title":"Spring",
            "category":"Java",
            "content":"Hello"
        },
        {
            "title":"Boot",
            "category":"JPA",
            "content":"Hello World"
        } 
        ]
	}
 */
@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    private OwnerRepository ownerRepository;

    @PostMapping("/saveOwner")
    public Owner saveOwner(@RequestBody Owner owner) {
        System.out.println("Owner save called...");
        Owner ownerOut = ownerRepository.save(owner);
        System.out.println("Saved!!!");

        return ownerOut;
    }

    @GetMapping("/getOwner/{id}")
    public Owner getOwner(@PathVariable(name = "id") String id) {
        System.out.println("Owner get called...");
        Owner ownerOut = ownerRepository.getById(Integer.valueOf(id));
        System.out.println("\nOwner details with Blogs :: \n" + ownerOut);
        System.out.println("\nList of Blogs :: \n" + ownerOut.getBlogList());
        System.out.println("\nDone!!!");

        return ownerOut;
    }
}
