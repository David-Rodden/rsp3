package org.rspeer.game.event;

import org.rspeer.event.Event;
import org.rspeer.event.listener.EventListener;
import org.rspeer.game.event.listener.HitsplatListener;

public class HitsplatEvent extends Event<Integer> {
    private final int type;
    private final String playerId;

    public HitsplatEvent(final int type, final int source, final String playerId) {
        super(source);
        this.type = type;
        this.playerId = playerId;
    }

    @Override
    public void dispatch(final EventListener listener) {
        if (listener instanceof HitsplatListener) ((HitsplatListener) listener).notify(this);
    }

    public int getType() {
        return type;
    }

    public String getPlayerId() {
        return playerId;
    }
}