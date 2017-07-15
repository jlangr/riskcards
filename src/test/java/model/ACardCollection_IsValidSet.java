package model;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static model.CardType.*;

public class ACardCollection_IsValidSet {
    @Test
    public void isFalseWhenItDoesNotContainThreeCards() {
        assertThat(new CardCollection(Soldier, Horseman).isValidSet(), is(false));
        assertThat(new CardCollection(Soldier, Horseman, Cannon, Horseman).isValidSet(), is(false));
    }
}
