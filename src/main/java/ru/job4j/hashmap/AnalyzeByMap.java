package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double score = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                count++;
                score += subject.score();
            }
        }
        return score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            labels.add(new Label(pupil.name(), score / pupils.size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> tempMap = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        int score = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (tempMap.get(subject.name()) != null) {
                    score = tempMap.get(subject.name());
                }
                tempMap.put(subject.name(), subject.score() + score);
            }
        }
        for (String key : tempMap.keySet()) {
            Integer value = tempMap.get(key);
            labels.add(new Label(key, (double) value / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            labels.add(new Label(pupil.name(), score));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> tempMap = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        int score = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (tempMap.get(subject.name()) != null) {
                    score = tempMap.get(subject.name());
                }
                tempMap.put(subject.name(), subject.score() + score);
            }
        }
        for (String key : tempMap.keySet()) {
            Integer value = tempMap.get(key);
            labels.add(new Label(key, value));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}