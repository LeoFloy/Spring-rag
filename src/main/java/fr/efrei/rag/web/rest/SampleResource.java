package fr.efrei.rag.web.rest;

import fr.efrei.rag.web.dto.Sample;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleResource {

    @GetMapping("/samples/{value}")
    public String hello(@PathVariable(value = "value", required = false) final String value) {
        return "Hello " + value + "!";
    }

}
