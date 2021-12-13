package com.qase.qa.pages.util;

public class CardData {
    private String cardName;
    private String cardDescription;
    public String priorityName;

    public CardData(String cardName, String descriptionDefect, String priorityName) {
        this.cardName = cardName;
        this.cardDescription = descriptionDefect;
        this.priorityName = priorityName;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardDescription() {
        return this.cardDescription;
    }

    public String getPriorityName() {
        return this.priorityName;
    }
}
