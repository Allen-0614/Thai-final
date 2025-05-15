public class Question {
    private String stimulus;
    private String question;
    private String[] answerChoices;   

    public Question (String stimulus, String question, String[] answerChoices) {
        this.stimulus = stimulus;
        this.question = question;
        this.answerChoices = answerChoices;
    }

    public String getStimulus() {
        return stimulus;
    }

    public void setStimulus(String stimulus) {
        this.stimulus = stimulus;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
    }
}