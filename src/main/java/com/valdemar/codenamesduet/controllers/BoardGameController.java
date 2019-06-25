package com.valdemar.codenamesduet.controllers;

import com.valdemar.codenamesduet.controllers.models.BoardGameState;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game")
public class BoardGameController {

    public BoardGameState getCurrentGameState() {

        return null;
    }

    public BoardGameState play() {        return null;
    }

    public BoardGameState endTurn() {        return null;
    }
}
