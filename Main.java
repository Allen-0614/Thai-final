public class Main{
    public static void main(String[] args){
        //new GUI();

        new String[] tempAnswers = null;
        new ArrayList<Question> questions = new ArrayList<Question>;
        
        // Period 1 (1491 - 1800)
        tempAnswers = {"A. Converting American Indians to Catholicism", "B. Monopolizing the New World's fur trade", 
        "C. Preventing the intrusion of other European powers", "D. Gaining wealth through the acquisition of precious metals"};
        questions.add(new Question("I will be no man's tributary! I am greater than any prince upon Earth. Your emperor may be a great prince; I do not doubt it when I see that he has sent his subjects so far across the waters, and I am willing to hold him as a brother. As for the Pope of whom you speak, he must be crazy to talk of giving away countries which do not belong to him. For my faith, I will not change it. Your own God, as you say, was put to death by the very men whom he created, but mine, my god* still lives in the heavens and looks down on his children.", "Which of the following most strongly motivated the Spanish conquest of American Indian societies, such as the Inca Empire?", tempAnswers));
        tempAnswers = {"A. Repartimiento respected the rights of major American Indian groups, like the Inca, and allowed a large degree of self-rule.", "B. Encomienda allowed the buying and selling of natives, in a form of slavery.", "C. Encomienda lacked the professed main goal of converting the natives to Catholicism.", "D. Repartimiento was controlled by locals rather than the Spanish crown"};
        questions.add(new Question("I will be no man's tributary! I am greater than any prince upon Earth. Your emperor may be a great prince; I do not doubt it when I see that he has sent his subjects so far across the waters, and I am willing to hold him as a brother. As for the Pope of whom you speak, he must be crazy to talk of giving away countries which do not belong to him. For my faith, I will not change it. Your own God, as you say, was put to death by the very men whom he created, but mine, my god* still lives in the heavens and looks down on his children.", 
        "How did the Spanish practice of encomienda differ from repartimiento?", tempAnswers));
        
        System.out.println(questions.get(1));
        // Period 2 (1800 - 1865)
        // Period 3 (1865 - 1945)
        // period 4 (1945 - present)
    }
}