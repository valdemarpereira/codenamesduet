package com.valdemar.codenamesduet.service;

import com.valdemar.codenamesduet.service.model.KeyCard;
import com.valdemar.codenamesduet.service.model.KeyCardMarker;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.valdemar.codenamesduet.service.model.KeyCardMarker.*;

/*

 */
public class KeyCardGenerator {


    private static final KeyCardMarker[] templateKeyCardPlayerA = {ASSASSIN, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, AGENT, AGENT, AGENT, AGENT, AGENT, AGENT, AGENT, AGENT, AGENT, INNOCENT, ASSASSIN, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, ASSASSIN};
    private static final KeyCardMarker[] templateKeyCardPlayerB = {AGENT, AGENT, AGENT, AGENT, AGENT, AGENT, AGENT, AGENT, AGENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, ASSASSIN, ASSASSIN, ASSASSIN, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT, INNOCENT};


    public static KeyCard keyCard(){
        LinkedList<Integer> positionsCard = IntStream.range(0, 25).boxed().collect(Collectors.toCollection(LinkedList::new));

        Collections.shuffle(positionsCard);

        KeyCardMarker[] keyCardMarkersA = new KeyCardMarker[25];
        KeyCardMarker[] keyCardMarkersB = new KeyCardMarker[25];

        int pos;

        for(int index = 0; index < 25; index ++) {

            pos = positionsCard.pop();

            keyCardMarkersA[pos] = templateKeyCardPlayerA[index];
            keyCardMarkersB[pos] = templateKeyCardPlayerB[index];
        }

        return new KeyCard(keyCardMarkersA, keyCardMarkersB);
    }
}
