package com.social.spark.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Owner on 2017. 03. 29..
 */
@RequestMapping("api")
@RestController
public class ApiController {
    @Autowired
    WordCount wordCount;

    @RequestMapping(value="wordcount",method={RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody ResponseEntity<List<Count>> words() {
        return new ResponseEntity<>(wordCount.count(), HttpStatus.OK);
    }
}
