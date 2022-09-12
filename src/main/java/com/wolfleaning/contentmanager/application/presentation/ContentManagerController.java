package com.wolfleaning.contentmanager.application.presentation;

import br.com.wolfleaning.contentmanager.client.presentation.api.CadastrarApi;
import br.com.wolfleaning.contentmanager.client.presentation.representation.CursoModelRepresentation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class ContentManagerController implements CadastrarApi {
    @Override
    public ResponseEntity<CursoModelRepresentation> cadastrarPost(CursoModelRepresentation body) {
        return CadastrarApi.super.cadastrarPost(body);
    }
}
