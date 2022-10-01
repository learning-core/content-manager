package com.wolfleaning.contentmanager.domain;

import com.wolfleaning.contentmanager.domain.port.IContentManagerRepository;
import org.springframework.http.ResponseEntity;

import javax.swing.text.html.parser.Entity;

public class Service {
    IContentManagerRepository iContentManagerRepository;

    public ResponseEntity<?> saveContent(){


        return ResponseEntity.ok().build();
    }
}
