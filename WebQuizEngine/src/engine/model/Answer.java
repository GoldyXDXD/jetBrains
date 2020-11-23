package engine.model;

public class Answer {

    private boolean success;
    private String feedback;

    Answer(boolean success, String feedback) {
        this.success = success;
        this.feedback = feedback;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public boolean isSuccess() {
        return success;
    }

    public static Answer success() {
        return new Answer(true, "Congratulations, you're right");
    }

    public static Answer wrong() {
        return new Answer(false, "Wrong answer! Please, try again.");
    }
}
