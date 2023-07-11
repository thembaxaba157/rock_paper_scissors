package org.thembaxaba157.Player.Type;

import org.thembaxaba157.Player.AbstractPlayer;
public class CPU extends AbstractPlayer {


    @Override
    public Options pickObject() {
        return generateRandomObject();
    }
    
}
