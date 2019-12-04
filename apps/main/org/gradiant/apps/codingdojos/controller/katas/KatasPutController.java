package org.gradiant.apps.codingdojos.controller.katas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.gradiant.codingdojos.katas.application.create.KataCreator;

@RestController
public final class KatasPutController {
    private final KataCreator creator;

    public KatasPutController(KataCreator creator) {
        this.creator = creator;
    }

    @PutMapping(value = "/courses/{id}")
    public ResponseEntity index(@PathVariable String id, @RequestBody Request request) {
        this.creator.create(id, request.name(), request.duration());

        return new ResponseEntity(HttpStatus.CREATED);
    }
}

final class Request {
    private String name;
    private String duration;

    String name() {
        return name;
    }

    String duration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }
}
