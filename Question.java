public class Question {
    private String stimulus;
    private String question;
    private String[] answerChoices;   
    private int seconds;

    public Question (String stimulus, String question, String[] answerChoices) {
        this.stimulus = stimulus;
        this.question = question;
        this.answerChoices = answerChoices;
        this.seconds = 60;
    }
    public Question (String question, String[] answerChoices) {
        stimulus = null;
        this.question = question;
        this.answerChoices = answerChoices;
        this.seconds = 60;
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
    public String toString(){
        System.out.println(stimulus + "\n" + question);
        for(int i = 0; i < answerChoices.length; i++){
            
        }
    }

}
