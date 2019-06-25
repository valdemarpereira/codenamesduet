package com.valdemar.codenamesduet.service.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;

import static org.hamcrest.MatcherAssert.assertThat;


public class KeyCardTest {

    private  KeyCardMarker[] keyCardMarkerSideA = {KeyCardMarker.INNOCENT, KeyCardMarker.INNOCENT, KeyCardMarker.INNOCENT, KeyCardMarker.INNOCENT};

    private KeyCard keyCard;


    @Before
    public void setup() {
        keyCard = new KeyCard(keyCardMarkerSideA, keyCardMarkerSideA);
    }

    @Test
    public void testGet(){
        KeyCardMarker[] keyCardMarkers = keyCard.getKeyCardMarkerSideA();

        keyCardMarkers[0] = KeyCardMarker.ASSASSIN;

        assertThat(keyCardMarkers[0], not(keyCard.getKeyCardMarkerSideA()[0]));

    }
}