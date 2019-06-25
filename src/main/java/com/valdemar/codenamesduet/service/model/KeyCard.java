package com.valdemar.codenamesduet.service.model;

import java.util.Arrays;

public final class KeyCard {

    private final KeyCardMarker[] keyCardMarkerSideA;
    private final KeyCardMarker[] keyCardMarkerSideB;

    public KeyCard(KeyCardMarker[] keyCardMarkerSideA, KeyCardMarker[] keyCardMarkerSideB) {
        this.keyCardMarkerSideA = Arrays.copyOf(keyCardMarkerSideA, keyCardMarkerSideA.length);
        this.keyCardMarkerSideB = Arrays.copyOf(keyCardMarkerSideB, keyCardMarkerSideB.length);
    }


    public KeyCardMarker[] getKeyCardMarkerSideA() {
        //This is immutable: Do a Defensive copy
        return Arrays.copyOf(this.keyCardMarkerSideA, keyCardMarkerSideA.length);

    }

    public KeyCardMarker[] getKeyCardMarkerSideB() {
        return Arrays.copyOf(this.keyCardMarkerSideB, keyCardMarkerSideB.length);
    }
}
