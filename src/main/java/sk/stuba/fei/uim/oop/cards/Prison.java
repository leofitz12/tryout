package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.game.Game;
import sk.stuba.fei.uim.oop.players.Player;
import sk.stuba.fei.uim.oop.cards.BlueCard;
import sk.stuba.fei.uim.oop.game.InvalidInputException;

import java.util.List;

public class Prison extends BlueCard {
    public Prison() {
        super(Card.Prison);
    }

	@Override
	public void playEffect(Game game, Player player) throws InvalidInputException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'playEffect'");
	}
}


