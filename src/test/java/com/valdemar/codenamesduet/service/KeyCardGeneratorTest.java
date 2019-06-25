package com.valdemar.codenamesduet.service;

import com.valdemar.codenamesduet.service.model.KeyCard;
import com.valdemar.codenamesduet.service.model.KeyCardMarker;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.valdemar.codenamesduet.service.model.KeyCardMarker.*;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class KeyCardGeneratorTest {

    private KeyCard keyCard;


    @Before
    public void setUp() throws Exception {
        keyCard = KeyCardGenerator.keyCard();
    }

    @Test
    public void testSizeOfKeyCardOnPlayerA(){
        assertThat(keyCard.getKeyCardMarkerSideA().length, is(25));
    }

    @Test
    public void testSizeOfKeyCardOnPlayerB(){
        assertThat(keyCard.getKeyCardMarkerSideB().length, is(25));
    }

    @Test
    public void testNumberOfAssassinsPlayerA() {
        long numOfAssassins = Stream.of(keyCard.getKeyCardMarkerSideA()).filter(x -> x.equals(ASSASSIN)).count();
        assertThat(numOfAssassins, is(3L));
    }

    @Test
    public void testNumberOfAssassinsPlayerB() {
        long numOfAssassins = Stream.of(keyCard.getKeyCardMarkerSideB()).filter(x -> x.equals(ASSASSIN)).count();
        assertThat(numOfAssassins, is(3L));
    }

    @Test
    public void testNumberOfAgentsPlayerA() {
        long numOfAgents = Stream.of(keyCard.getKeyCardMarkerSideA()).filter(x -> x.equals(AGENT)).count();
        assertThat(numOfAgents, is(9L));
    }

    @Test
    public void testNumberOfAgentsPlayerB() {
        long numOfAgents = Stream.of(keyCard.getKeyCardMarkerSideB()).filter(x -> x.equals(AGENT)).count();
        assertThat(numOfAgents, is(9L));
    }

    @Test
    public void testNumberOfInnocentsPlayerA() {
        long numOfInnocents = Stream.of(keyCard.getKeyCardMarkerSideA()).filter(x -> x.equals(INNOCENT)).count();
        assertThat(numOfInnocents, is(13L));
    }

    @Test
    public void testNumberOfInnocentsPlayerB() {
        long numOfInnocents = Stream.of(keyCard.getKeyCardMarkerSideB()).filter(x -> x.equals(INNOCENT)).count();
        assertThat(numOfInnocents, is(13L));
    }

    @Test
    public void tesKeyCardMarkerBAssassinMatchFromKeyMarkerA() {

        List<KeyCardMarker> playerBMarkerOnAssassinsOnPlayerA = new ArrayList<>();


        for(int index = 0; index < 25; index ++) {

            if(keyCard.getKeyCardMarkerSideA()[index].equals(ASSASSIN)) {
                playerBMarkerOnAssassinsOnPlayerA.add(keyCard.getKeyCardMarkerSideB()[index]);
            }

        }


        assertThat(playerBMarkerOnAssassinsOnPlayerA, containsInAnyOrder(AGENT, ASSASSIN, INNOCENT));

    }

    @Test
    public void tesKeyCardMarkerAAssassinMatchFromKeyMarkerB() {

        List<KeyCardMarker> playerAMarkerOnAssassinsOnPlayerB = new ArrayList<>();


        for(int index = 0; index < 25; index ++) {

            if(keyCard.getKeyCardMarkerSideB()[index].equals(ASSASSIN)) {
                playerAMarkerOnAssassinsOnPlayerB.add(keyCard.getKeyCardMarkerSideA()[index]);
            }

        }

        assertThat(playerAMarkerOnAssassinsOnPlayerB, containsInAnyOrder(AGENT, ASSASSIN, INNOCENT));
    }


    @Test
    public void tesKeyCardMarkerBAgentsMatchFromKeyMarkerA() {

        List<KeyCardMarker> playerBMarkerOnAssassinsOnPlayerA = new ArrayList<>();


        for(int index = 0; index < 25; index ++) {

            if(keyCard.getKeyCardMarkerSideA()[index].equals(AGENT)) {
                playerBMarkerOnAssassinsOnPlayerA.add(keyCard.getKeyCardMarkerSideB()[index]);
            }

        }

        assertThat(playerBMarkerOnAssassinsOnPlayerA.stream().filter(x-> x.equals(AGENT)).count(), is(3L));
        assertThat(playerBMarkerOnAssassinsOnPlayerA.stream().filter(x-> x.equals(ASSASSIN)).count(), is(1L));
        assertThat(playerBMarkerOnAssassinsOnPlayerA.stream().filter(x-> x.equals(INNOCENT)).count(), is(5L));
    }

    @Test
    public void tesKeyCardMarkerAAgentsMatchFromKeyMarkerB() {

        List<KeyCardMarker> playerAMarkerOnAssassinsOnPlayerB = new ArrayList<>();


        for(int index = 0; index < 25; index ++) {

            if(keyCard.getKeyCardMarkerSideB()[index].equals(AGENT)) {
                playerAMarkerOnAssassinsOnPlayerB.add(keyCard.getKeyCardMarkerSideA()[index]);
            }

        }

        assertThat(playerAMarkerOnAssassinsOnPlayerB.stream().filter(x-> x.equals(AGENT)).count(), is(3L));
        assertThat(playerAMarkerOnAssassinsOnPlayerB.stream().filter(x-> x.equals(ASSASSIN)).count(), is(1L));
        assertThat(playerAMarkerOnAssassinsOnPlayerB.stream().filter(x-> x.equals(INNOCENT)).count(), is(5L));
    }

    @Test
    public void tesKeyCardMarkerBInnocentsMatchFromKeyMarkerA() {

        List<KeyCardMarker> playerBMarkerOnAssassinsOnPlayerA = new ArrayList<>();


        for(int index = 0; index < 25; index ++) {

            if(keyCard.getKeyCardMarkerSideA()[index].equals(INNOCENT)) {
                playerBMarkerOnAssassinsOnPlayerA.add(keyCard.getKeyCardMarkerSideB()[index]);
            }

        }

        assertThat(playerBMarkerOnAssassinsOnPlayerA.stream().filter(x-> x.equals(AGENT)).count(), is(5L));
        assertThat(playerBMarkerOnAssassinsOnPlayerA.stream().filter(x-> x.equals(ASSASSIN)).count(), is(1L));
        assertThat(playerBMarkerOnAssassinsOnPlayerA.stream().filter(x-> x.equals(INNOCENT)).count(), is(7L));
    }

    @Test
    public void tesKeyCardMarkerAInnocentsMatchFromKeyMarkerB() {

        List<KeyCardMarker> playerAMarkerOnAssassinsOnPlayerB = new ArrayList<>();


        for(int index = 0; index < 25; index ++) {

            if(keyCard.getKeyCardMarkerSideB()[index].equals(INNOCENT)) {
                playerAMarkerOnAssassinsOnPlayerB.add(keyCard.getKeyCardMarkerSideA()[index]);
            }

        }

        assertThat(playerAMarkerOnAssassinsOnPlayerB.stream().filter(x-> x.equals(AGENT)).count(), is(5L));
        assertThat(playerAMarkerOnAssassinsOnPlayerB.stream().filter(x-> x.equals(ASSASSIN)).count(), is(1L));
        assertThat(playerAMarkerOnAssassinsOnPlayerB.stream().filter(x-> x.equals(INNOCENT)).count(), is(7L));
    }
}