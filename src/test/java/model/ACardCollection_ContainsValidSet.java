package model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static model.CardType.*;

public class ACardCollection_ContainsValidSet {
    @Test
    public void isFalseWhenThereAreFewerThanThreeCards() {
        assertThat(new CardCollection(Soldier, Soldier).containsValidSet(), is(false));
    }

    @Test
    public void isTrueWhenItContainsAValidSet() {
        assertThat(new CardCollection(Horseman, Horseman, Cannon, Horseman).containsValidSet(), is(true));
    }

    @Test
    public void isFalseWhenItDoesNotContainAValidSet() {
        assertThat(new CardCollection(Soldier, Soldier, Horseman, Horseman).containsValidSet(), is(false));
    }
}
