package ru.job4j.queue;
1
public record Task(Position position,
                   String description,
                   int urgency) {
}
