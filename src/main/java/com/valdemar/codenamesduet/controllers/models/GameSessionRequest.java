package com.valdemar.codenamesduet.controllers.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonDeserialize(builder = AutoValue_GameSessionRequest.Builder.class)
public abstract class GameSessionRequest {

    public abstract String playerA();

    public abstract String playerB();

    public static GameSessionRequest create(String playerA, String playerB) {
        return builder()
                .playerA(playerA)
                .playerB(playerB)
                .build();
    }

    public static GameSessionRequest.Builder builder() {
        return new AutoValue_GameSessionRequest.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder {
        public abstract GameSessionRequest.Builder playerA(String playerA);git

        public abstract GameSessionRequest.Builder playerB(String playerB);

        public abstract GameSessionRequest build();
    }
}

