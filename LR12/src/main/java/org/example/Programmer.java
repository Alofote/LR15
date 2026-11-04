package org.example;

import java.util.List;

public class Programmer {
    private int id;
    private String name;
    private String language;
    private int level;
    private List<Integer> codeReviews;

    public Programmer(int id, String name, String language, int level, List<Integer> codeReviews) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.level = level;
        this.codeReviews = codeReviews;
    }

    public double getAverageReview() {
        return codeReviews.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", level=" + level +
                ", codeReviews=" + codeReviews +
                '}'+ getAverageReview();
    }
}
