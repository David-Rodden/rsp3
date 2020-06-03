package org.rspeer.game.event.listener;

import org.rspeer.game.event.HitsplatEvent;

public interface HitsplatListener extends EventListener {
    void notify(final HitsplatEvent e);
}
