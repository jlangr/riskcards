package model;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static model.CardType.*;

public class ACardCollection_ContainsValidSet {
    @Test
    public void isFalseWhenThereAreFewerThanThreeCards() {
        assertThat(new CardCollection(Soldier, Soldier).containsValidSet(), is(false));
    }

    @Test
    public void isTrueWhenItContainsExactlyThreeCardsThatAreAValidSet() {
        assertThat(new CardCollection(Soldier, Soldier, Soldier).containsValidSet(), is(true));
    }

    @Test
    public void isTrueWhenItContainsAtLeastThreeOfOneType() {
        assertThat(new CardCollection(Horseman, Horseman, Cannon, Horseman).containsValidSet(), is(true));
    }

    @Test
    public void isFalseWhenItDoesNotContainsAValidSet() {
        assertThat(new CardCollection(Soldier, Soldier, Horseman, Horseman).containsValidSet(), is(false));
    }

    @Test
    public void isTrueWhenItContainsAtLeastOneOfEachType() {
        assertThat(new CardCollection(Soldier, Horseman, Cannon, Cannon).containsValidSet(), is(true));
    }

    @Test
    public void isTrueWhenItContainsFourCardsWithJoker() {
        assertThat(new CardCollection(Soldier, Soldier, Joker, Joker).containsValidSet(), is(true));
    }
}
