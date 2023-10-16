package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder evenElement = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size / 2; i++) {
            evenElement.append(evenElements.pollFirst());
            evenElements.pollFirst();
        }
        return evenElement.toString();
    }

    private String getDescendingElements() {
        StringBuilder descending = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            descending.append(descendingElements.pollLast());
        }
        return descending.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}