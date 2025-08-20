public class Grade {

    private String subject;
    private int score;

    // Constructor
    public Grade(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // calculate grade based on 100 numbers
    public String calculateGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
