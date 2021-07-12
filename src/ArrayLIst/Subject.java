package ArrayLIst;

public class Subject {
    private String Subject_name;
    private int Subject_Score;

    public Subject(String subject_name, int subject_Score) {
        Subject_name = subject_name;
        Subject_Score = subject_Score;

    }

    public String getSubject_name() {
        return Subject_name;
    }

    public void setSubject_name(String subject_name) {
        Subject_name = subject_name;
    }

    public int getSubject_Score() {
        return Subject_Score;
    }

    public void setSubject_Score(int subject_Score) {
        Subject_Score = subject_Score;
    }
}
