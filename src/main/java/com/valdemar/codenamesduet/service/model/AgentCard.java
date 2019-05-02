package com.valdemar.codenamesduet.service.model;

public class AgentCard {

    private boolean used;

    public void useCard(){
        this.used = true;
    }

    public boolean isUsed() {
        return used;
    }
}
