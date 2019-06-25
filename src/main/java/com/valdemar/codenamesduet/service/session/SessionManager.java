package com.valdemar.codenamesduet.service.session;

import com.valdemar.codenamesduet.service.session.model.GameSession;

public interface SessionManager {
    GameSession createNewGameSession(String playerA, String playerB);
}
