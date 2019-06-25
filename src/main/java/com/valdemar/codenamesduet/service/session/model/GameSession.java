package com.valdemar.codenamesduet.service.session.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonDeserialize(builder = AutoValue_GameSession.Builder.class)
public abstract class GameSession {

    public abstract String gameSessionId();
    public abstract String playerA();
    public abstract String playerB();

    public static GameSession create(String gameSessionId, String playerA, String playerB) {
        return builder()
                .gameSessionId(gameSessionId)
                .playerA(playerA)
                .playerB(playerB)
                .build();
    }

    public static Builder builder() {
        return new AutoValue_GameSession.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder gameSessionId(String gameSessionId);

        public abstract Builder playerA(String playerA);

        public abstract Builder playerB(String playerB);

        public abstract GameSession build();
    }
}
