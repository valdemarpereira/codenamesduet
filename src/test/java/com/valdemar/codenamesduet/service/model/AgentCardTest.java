package com.valdemar.codenamesduet.service.model;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class AgentCardTest {

    @Test
    public void testNewCardIsNotUsed(){
        AgentCard agentCard = new AgentCard();

        assertFalse(agentCard.isUsed());
    }

    @Test
    public void testUseCard(){
        AgentCard agentCard = new AgentCard();
        agentCard.useCard();
        assertTrue(agentCard.isUsed());
    }



}