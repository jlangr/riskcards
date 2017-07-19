package model;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.Arrays.asList;
import static model.CardType.Joker;

public class CardCollection {
    static final int VALID_SET_SIZE = 3;
    private final List<CardType> cardTypes;

    public CardCollection(CardType... types) {
        cardTypes = asList(types);
    }

    public boolean isValidSet() {
        return cardTypes.size() == VALID_SET_SIZE && meetsSetCriteria();
    }

    public boolean containsValidSet() {
        return cardTypes.size() >= VALID_SET_SIZE && meetsSetCriteria();
    }

    private boolean containsAJoker() {
        return cardTypes.contains(Joker);
    }

    private boolean meetsSetCriteria() {
        return containsAJoker() || containsThreeDifferentCards() || containsThreeSameCards();
    }

    private boolean containsThreeSameCards() {
        return counts().values().stream().anyMatch(size -> size >= VALID_SET_SIZE);
    }

    private boolean containsThreeDifferentCards() {
        return counts().size() == VALID_SET_SIZE;
    }

    private Map<CardType, Long> counts() {
        return cardTypes.stream().collect(groupingBy(t -> t, counting()));
    }
}
