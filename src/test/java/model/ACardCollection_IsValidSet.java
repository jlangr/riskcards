package model;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static model.CardType.*;

public class ACardCollection_IsValidSet {
    @Test
    public void isTrueWhenAllCardsAreTheSame() {
        assertThat(new CardCollection(Soldier, Soldier, Soldier).isValidSet(), is(true));
    }

    @Test
    public void isFalseWhenThereAreNotThreeCards() {
        assertThat(new CardCollection(Soldier, Soldier).isValidSet(), is(false));
    }

    @Test
    public void isFalseWhenOnlyTwoCardsAreTheSame() {
        assertThat(new CardCollection(Soldier, Soldier, Cannon).isValidSet(), is(false));
    }

    @Test
    public void isTrueWhenAllThreeCardsAreDifferent() {
        assertThat(new CardCollection(Soldier, Horseman, Cannon).isValidSet(), is(true));
    }

    @Test
    public void isTrueWhenAnyCardIsAJoker() {
        assertThat(new CardCollection(Joker, Cannon, Cannon).isValidSet(), is(true));
    }
}
