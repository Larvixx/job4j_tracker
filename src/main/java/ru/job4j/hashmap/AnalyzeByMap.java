package ru.job4j.hashmap;

import java.lang.reflect.Array;
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
            int count = 0;
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                count++;
                score += subject.score();
            }
            labels.add(new Label(pupil.name(), score / count));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> tempMap = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        int score = 0;
        int countPupil = 0;
        for (Pupil pupil : pupils) {
            score = 0;
            countPupil++;
            for (Subject subject : pupil.subjects()) {
                tempMap.put(subject.name(), subject.score());
            }
        }
        for (String key : tempMap.keySet()) {
            Integer value = tempMap.get(key);
            labels.add(new Label(key, (double) value / countPupil));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return null;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }
}