package model;

import java.util.List;
import static java.util.Arrays.asList;

public class CardCollection {
    private final List<CardType> cardTypes;

    public CardCollection(CardType... types) {
        cardTypes = asList(types);
    }

    public boolean isValidSet() {
        return cardTypes.size() == 3;
    }
}
