package com.valdemar.codenamesduet.service.session;

import com.valdemar.codenamesduet.service.session.model.GameSession;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemorySessionManager implements SessionManager{

    private Map<String, GameSession> inMemoryGameSessions = new HashMap<>();

    @Override
    public GameSession createNewGameSession(String playerA, String playerB) {

        //TODO: inject a class capable of generating random id's
        GameSession gameSession = GameSession.create(UUID.randomUUID().toString(), playerA, playerB);

        inMemoryGameSessions.put(gameSession.gameSessionId(), gameSession);
        return gameSession;
    }
}
