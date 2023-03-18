package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.game.Game;
import sk.stuba.fei.uim.oop.players.Player;
import sk.stuba.fei.uim.oop.cards.BrownCard;
import java.util.List;
import sk.stuba.fei.uim.oop.game.InvalidInputException;

public class Indians extends BrownCard {
    
    public Indians() {
        super("Indians");
    }

    @Override
    public void playEffect(Game game, Player player, Player target) throws InvalidInputException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playEffect'");
    }

}




