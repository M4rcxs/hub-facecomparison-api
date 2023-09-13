package com.br.hub.facecomparison;

import ch.qos.logback.core.status.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.security.Provider;

@RestController
@RequestMapping(path ="/facecomparison", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComparisonController {

    @Autowired
    private ComparisonService service;

    @GetMapping("/status")
    public Status getStatus(){
        return new Status("OK RUNNING");
    }

    @PostMapping(path = "/compare", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Output Compare(@RequestBody Input input) throws Exception{
        try {
            float result = service.compareTwoPhotos(input.photo1, input.photo2);
            return new Output(result);
        } catch(Exception exc) {
            exc.printStackTrace();
            return new Output(-1);
        }

    }

    record Status(String status) { }
    record Input(String photo1, String photo2) { }
    record Output(float similarity) { }
}
