package com.wolfleaning.contentmanager.application.presentation;

import br.com.wolfleaning.contentmanager.presentation.representation.CursoModelRepresentation;
import br.com.wolfleaning.contentmanager.provider.api.CadastrarApi;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ContentManagerController implements CadastrarApi {
    @Override
    public ResponseEntity<Void> salvarCurso(CursoModelRepresentation body) {
        return ResponseEntity.ok().build();
    }
}
