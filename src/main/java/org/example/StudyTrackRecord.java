package org.example;

public class StudyTrackRecord {

    public void rumelSir() {
        String question = "How many problem do you solved in a day?";
        int answer = 10;
        System.out.println(question +" "+ answer);
    }

    public static void main(String[] args) {
        String rumelSir = "How long do you study in a day?";
        String answer = "I study more than eight hours in a day.";
        System.out.println(rumelSir +" "+ answer);
        StudyTrackRecord rumel = new StudyTrackRecord();
        rumel.rumelSir();

    }
}
