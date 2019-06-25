package com.valdemar.codenamesduet.controllers.models;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BoardGameState {

    abstract String playerA();
    abstract String playerB();

    public static BoardGameState create(String playerA, String playerB) {
        return builder()
                .playerA(playerA)
                .playerB(playerB)
                .build();
    }

    public static Builder builder() {
        return new AutoValue_BoardGameState.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder playerA(String playerA);

        public abstract Builder playerB(String playerB);

        public abstract BoardGameState build();
    }
}
