package com.wolfleaning.contentmanager.application.presentation;

import br.com.wolfleaning.contentmanager.presentation.representation.CursoRepresentation;
import br.com.wolfleaning.contentmanager.provider.api.CadastrarApi;
import com.wolfleaning.contentmanager.domain.Service;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ContentManagerController implements CadastrarApi {

    Service service;
    @Override
    public ResponseEntity<Void> salvarCurso(CursoRepresentation body) {


        return ResponseEntity.ok().build();
    }
}
