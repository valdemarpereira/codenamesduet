package com.valdemar.codenamesduet.controllers;

import com.valdemar.codenamesduet.controllers.models.GameSessionRequest;
import com.valdemar.codenamesduet.service.session.SessionManager;
import com.valdemar.codenamesduet.service.session.model.GameSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "session", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class SessionController {

    @Autowired
    private SessionManager sessionManager;

    @PostMapping("/new")
    public ResponseEntity<GameSession> createNewGameSession(@RequestBody GameSessionRequest gameSessionRequest){
        GameSession gameSession = sessionManager.createNewGameSession(gameSessionRequest.playerA(), gameSessionRequest.playerB());
        return new ResponseEntity<GameSession>(gameSession, HttpStatus.OK);
    }

    public void deleteGameSession(){

    }
}
