import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] tempAnswers;
        ArrayList<Question> questionsP1 = new ArrayList<Question>();
        ArrayList<Question> questionsP2 = new ArrayList<Question>();
        ArrayList<Question> questionsP3 = new ArrayList<Question>();
        ArrayList<Question> questionsP4 = new ArrayList<Question>();
        
        // Period 1 (1491 - 1800)
        tempAnswers = new String[] {
            "A. Converting American Indians to Catholicism",
            "B. Monopolizing the New World's fur trade",
            "C. Preventing the intrusion of other European powers",
            "D. Gaining wealth through the acquisition of precious metals"
        };
        questionsP1.add(new Question(
            "I will be no man's tributary! I am greater than any prince upon Earth. Your emperor may be a great prince; I do not doubt it when I see that he has sent his subjects so far across the waters, and I am willing to hold him as a brother. As for the Pope of whom you speak, he must be crazy to talk of giving away countries which do not belong to him. For my faith, I will not change it. Your own God, as you say, was put to death by the very men whom he created, but mine, my god* still lives in the heavens and looks down on his children.",
            "Which of the following most strongly motivated the Spanish conquest of American Indian societies, such as the Inca Empire?",
            tempAnswers, "D"
        ));

        tempAnswers = new String[] {
            "A. Repartimiento respected the rights of major American Indian groups, like the Inca, and allowed a large degree of self-rule.",
            "B. Encomienda allowed the buying and selling of natives, in a form of slavery.",
            "C. Encomienda lacked the professed main goal of converting the natives to Catholicism.",
            "D. Repartimiento was controlled by locals rather than the Spanish crown"
        };
        questionsP1.add(new Question(
            "I will be no man's tributary! I am greater than any prince upon Earth. Your emperor may be a great prince; I do not doubt it when I see that he has sent his subjects so far across the waters, and I am willing to hold him as a brother. As for the Pope of whom you speak, he must be crazy to talk of giving away countries which do not belong to him. For my faith, I will not change it. Your own God, as you say, was put to death by the very men whom he created, but mine, my god* still lives in the heavens and looks down on his children.",
            "How did the Spanish practice of encomienda differ from repartimiento?",
            tempAnswers, "B"
        ));

        tempAnswers = new String[] {
            "A. The War of 1812",
            "B. The Civil War",
            "C. The Nullification Crisis of 1832",
            "D. The Korean War"
        };
        questionsP1.add(new Question(
                """
                “…Let me now take a more comprehensive view, and warn you in the most solemn manner against the baneful effects of the spirit of party generally.

                There is an opinion that parties in free countries are useful checks upon the administration of government, and serve to keep alive the spirit of liberty. This within certain limits is probably true; and in governments of a monarchical cast patriotism may look with indulgence, if not with favor, upon the spirit of party. But in those of the popular character, in governments purely elective, it is a spirit not to be encouraged. From their natural tendency it is certain there will always be enough of that spirit for every salutary purpose; and there being constant danger of excess, the effort ought to be by force of public opinion to mitigate and assuage it. A fire not to be quenched, it demands a uniform vigilance to prevent its bursting into a flame, lest, instead of warming, it should consume.”

                President George Washington, Farewell Address
                """,
                "The sentiments expressed by Washington in his Farewell Address most warn against partisan divisions that occurred before which of the following conflicts?",
                tempAnswers, "A"
        ));

        tempAnswers = new String[] {
            "A. Federalism",
            "B. Anti-Federalism",
            "C. Republicanism",
            "D. Sectionalism"
        };
        questionsP1.add(new Question(
                """
                “…Let me now take a more comprehensive view, and warn you in the most solemn manner against the baneful effects of the spirit of party generally.

                There is an opinion that parties in free countries are useful checks upon the administration of government, and serve to keep alive the spirit of liberty. This within certain limits is probably true; and in governments of a monarchical cast patriotism may look with indulgence, if not with favor, upon the spirit of party. But in those of the popular character, in governments purely elective, it is a spirit not to be encouraged. From their natural tendency it is certain there will always be enough of that spirit for every salutary purpose; and there being constant danger of excess, the effort ought to be by force of public opinion to mitigate and assuage it. A fire not to be quenched, it demands a uniform vigilance to prevent its bursting into a flame, lest, instead of warming, it should consume.”

                President George Washington, Farewell Address
                """,
                "Washington's Farewell Address best exemplifies which of the following political philosophies?",
                tempAnswers,  "C"
        ));

        tempAnswers = new String[] {
            "A. The development of a racially mixed population and caste system",
            "B. The introduction of large-scale African slavery in the British colonies",
            "C. The establishment of representative government in Spanish colonies",
            "D. The rapid decline of European influence in the Americas"
        };

        questionsP1.add(new Question(
            "Which of the following best describes a major effect of Spanish colonization in the Americas during the 16th century?",
            tempAnswers, "A"
        ));
        
                // Question 1
        tempAnswers = new String[] {
            "A. a series of armed conflicts between colonists and an alliance of Native American tribes, known as the Covenant Chain, led by Chief Pontiac.",
            "B. raids by Cherokee and the Creek warriors in the interior of Georgia and South Carolina following the \"Trail of Tears.\"",
            "C. a bloody conflict, known as King Philip's War, waged by the Narragansett against encroachments by colonists.",
            "D. skirmishes between Virginia settlers and the Powhatan Confederation."
        };
        questionsP1.add(new Question(
            """
            "And We do further declare it to be Our Royal Will and Pleasure, for the present as aforesaid, to reserve under our Sovereignty, Protection, and Dominion, for the use of the said Indians, . . . all the Lands and Territories lying to the Westward of the Sources of the Rivers which fall into the Sea from the West and North West as aforesaid.

            "And We do hereby strictly forbid, on Pain of our Displeasure, all our loving Subjects from making any Purchases or Settlements whatever, or taking Possession of any of the Lands above reserved, without our especial leave and Licence for that Purpose first obtained."

            —Royal Proclamation of 1763 (excerpt)
            """,
            tempAnswers,
            "A"
        ));

        // Question 2
        tempAnswers = new String[] {
            "A. uniting British colonists and American Indians in mutual distrust of British intentions.",
            "B. slowing down British immigration to North America.",
            "C. intensifying tensions between Great Britain and France.",
            "D. creating resentment by colonists toward British policies in North America."
        };
        questionsP1.add(new Question(
            """
            "And We do further declare it to be Our Royal Will and Pleasure, for the present as aforesaid, to reserve under our Sovereignty, Protection, and Dominion, for the use of the said Indians, . . . all the Lands and Territories lying to the Westward of the Sources of the Rivers which fall into the Sea from the West and North West as aforesaid.

            "And We do hereby strictly forbid, on Pain of our Displeasure, all our loving Subjects from making any Purchases or Settlements whatever, or taking Possession of any of the Lands above reserved, without our especial leave and Licence for that Purpose first obtained."

            —Royal Proclamation of 1763 (excerpt)
            """,
            tempAnswers,
            "D"
        ));

        // Question 3
        tempAnswers = new String[] {
            "A. Great Britain shifting the structure of its empire and allowing colonies more direct control of internal affairs.",
            "B. Great Britain's attempting to consolidate imperial control over its North American colonies.",
            "C. Great Britain attempting to prevent the spread of revolutionary sentiment.",
            "D. Great Britain shifting its policies from a mercantilist model to a free-market capitalist model."
        };
        questionsP1.add(new Question(
            """
            "And We do further declare it to be Our Royal Will and Pleasure, for the present as aforesaid, to reserve under our Sovereignty, Protection, and Dominion, for the use of the said Indians, . . . all the Lands and Territories lying to the Westward of the Sources of the Rivers which fall into the Sea from the West and North West as aforesaid.

            "And We do hereby strictly forbid, on Pain of our Displeasure, all our loving Subjects from making any Purchases or Settlements whatever, or taking Possession of any of the Lands above reserved, without our especial leave and Licence for that Purpose first obtained."

            —Royal Proclamation of 1763 (excerpt)
            """,
            tempAnswers,
            "B"
        ));

        // Question 7
        tempAnswers = new String[] {
            "A. President John Adams was extremely popular; any opposition to him was seen as treasonous.",
            "B. Irish immigration was changing the composition of many American cities; many Americans wondered if the United States could retain its Anglo-Saxon heritage without limiting immigration.",
            "C. federal authorities had uncovered and thwarted a plot by disgruntled North Carolina farmers to assassinate President John Adams; desperate times, it seemed, called for desperate measures.",
            "D. large numbers of Americans had become intensely critical of the revolutionary French government during the Quasi-War with France; restricting the ability of French immigrants to participate in American politics seemed reasonable."
        };
        questionsP1.add(new Question(
            """
            "SECTION 1.

            "Be it enacted by the Senate and the House of Representatives of the United States of America in Congress assembled, That it shall be lawful for the President of the United States at any time during the continuance of this act, to order all such aliens as he shall judge dangerous to the peace and safety of the United States, or shall have reasonable grounds to suspect are concerned in any treasonable or secret machinations against the government thereof, to depart out of the territory of the United States, within such time as shall be expressed in such order, which order shall be served on such alien by delivering him a copy thereof, or leaving the same at his usual abode, and returned to the office of the Secretary of State, by the marshal or other person to whom the same shall be directed."

            —An Act Concerning Aliens (excerpt), 1798
            """,
            tempAnswers,
            "D"
        ));

        // Question 8
        tempAnswers = new String[] {
            "A. calling for the impeachment of President John Adams.",
            "B. challenging the laws in the Supreme Court.",
            "C. putting forth the theory of state nullification of federal legislation.",
            "D. boycotting the elections of 1800."
        };
        questionsP1.add(new Question(
            """
            "SECTION 1.

            "Be it enacted by the Senate and the House of Representatives of the United States of America in Congress assembled, That it shall be lawful for the President of the United States at any time during the continuance of this act, to order all such aliens as he shall judge dangerous to the peace and safety of the United States, or shall have reasonable grounds to suspect are concerned in any treasonable or secret machinations against the government thereof, to depart out of the territory of the United States, within such time as shall be expressed in such order, which order shall be served on such alien by delivering him a copy thereof, or leaving the same at his usual abode, and returned to the office of the Secretary of State, by the marshal or other person to whom the same shall be directed."

            —An Act Concerning Aliens (excerpt), 1798
            """,
            tempAnswers,
            "C"
        ));
          tempAnswers = new String[] {
            "A. impoverished New Englanders used the legal system to vent class frustrations against the wealthy.",
            "B. political corruption was common in Puritan New England.",
            "C. Puritan magistrates were evenhanded in that they prosecuted anyone—rich or poor—who expressed heretical religious views.",
            "D. the Puritans attempted to enforce economic values that emphasized communal notions of fairness over free-market individualism."
        };
        questionsP1.add(new Question(
            "\"There is little doubt that Puritanism was closer to medieval theory than the material goals and values of a growing middle class that was becoming prominent in England and western Europe after the fifteenth century. While the Puritan never thought of his religion in economic terms, he did emphasize the fact that man could serve God not by withdrawing from the world, but rather by following an occupation or calling that served the world.\r\n" +
            "\"In spite of the proximity of certain Puritan values to the rising capitalistic ethic, Puritanism was more medieval than modern in its economic theory and practice. The idea of unrestrained economic individualism would have seemed a dangerous notion to any self-respecting Puritan. The statute books and court records of seventeenth-century Massachusetts abound in examples of price and wage controls instituted by the government of the colony. The Puritans, furthermore, always looked upon wealth as a gift from God given in the form of a trust; and they emphasized not only the benefits that accrued from work and wealth, but also their duties and responsibilities. In 1639, for example, one of the richest merchants in the colony was fined by the General Court (the highest legislative body) for excessive profiteering, despite the fact that there was no statute against the practice. The Puritans could never separate religion and business, and they often reiterated the medieval conception of the 'just price.'\r\n" + //
            "\"In the long run, however, the Puritan ethic, when divorced from its religious background, did serve to quicken and stimulate the spirit of capitalism. The limitations placed by the Puritans on the individual and the freedom of movement within society were subordinated as the time went on in favor of the enterprising and driving individual who possessed the ability and ambition to rise through his own exertions." + //               
            "In the second paragraph, the authors discuss the 1639 legal proceedings against \\\"one of the richest merchants in the colony,\\\" in order to show that",
            tempAnswers, "D"
        ));

        tempAnswers = new String[] {
            "A. Puritan restraints on economic activity prevented the economy of New England from growing, leading it to fall behind the South and the middle colonies during the colonial period.",
            "B. The economy of Puritan New England came to resemble the feudal economy of medieval Europe, dominated by large estates passed on from father to son over several generations.",
            "C. The economy of New England only began to thrive when non-Puritan immigrants began to move into New England after the 1640s.",
            "D. As the seventeenth century progressed, the decline of Puritan orthodoxy, combined with Puritan patterns of work, allowed for the emergence of a market-oriented economy."
        };
        questionsP1.add(new Question(
            "\"There is little doubt that Puritanism was closer to medieval theory than the material goals and values of a growing middle class that was becoming prominent in England and western Europe after the fifteenth century. While the Puritan never thought of his religion in economic terms, he did emphasize the fact that man could serve God not by withdrawing from the world, but rather by following an occupation or calling that served the world.\r\n" +
            "\r\n" +
            "In spite of the proximity of certain Puritan values to the rising capitalistic ethic, Puritanism was more medieval than modern in its economic theory and practice. The idea of unrestrained economic individualism would have seemed a dangerous notion to any self-respecting Puritan. The statute books and court records of seventeenth-century Massachusetts abound in examples of price and wage controls instituted by the government of the colony. The Puritans, furthermore, always looked upon wealth as a gift from God given in the form of a trust; and they emphasized not only the benefits that accrued from work and wealth, but also their duties and responsibilities. In 1639, for example, one of the richest merchants in the colony was fined by the General Court (the highest legislative body) for excessive profiteering, despite the fact that there was no statute against the practice. The Puritans could never separate religion and business, and they often reiterated the medieval conception of the 'just price.'\r\n" +
            "\r\n" +
            "In the long run, however, the Puritan ethic, when divorced from its religious background, did serve to quicken and stimulate the spirit of capitalism. The limitations placed by the Puritans on the individual and the freedom of movement within society were subordinated as the time went on in favor of the enterprising and driving individual who possessed the ability and ambition to rise through his own exertions.\"\r\n" +
            "\r\n" +
            "Which of the following reflects the main point that Gerald N. Grob and Robert N. Beck are making in the passage?",
            tempAnswers,
            "D"
        ));

        tempAnswers = new String[] {
            "A. adaptation by American Indians to European cultural practices.",
            "B. conflict among American Indian groups as a result of displacement and relocation by Spanish colonial forces.",
            "C. the high rate of intermarriage between American Indians and Spaniards in the New World.",
            "D. resistance by American Indians to Spanish colonial practices."
        };
        questionsP1.add(new Question(
            """
            "Asked what causes or motives the said Indian rebels had for renouncing the law of God and obedience to his Majesty, and for committing so many kinds of crimes, [Josephe answered] the causes they have were alleged ill treatment and injuries received from [Spanish authorities], because they beat them, took away what they had, and made them work without pay. Thus he replies.

            "Asked if he has learned if it has come to his notice during the time that he has been here the reason why the apostates burned the images, churches, and things pertaining to divine worship, making a mockery and a trophy of them, killing the priests and doing the other things they did, he said that he knows and had heard it generally stated that while they were besieging the villa the rebellious traitors burned the church and shouted in loud voices, 'Now the God of the Spaniards, who was their father, is dead, and Santa Maria, who was their mother, and the saints, who were pieces of rotten wood,' saying that only their own god lived. . . . The captains and the chiefs ordered that the names of Jesus and Mary should nowhere be uttered. . . . He has seen many houses of idolatry which they have built, dancing the dance of the cachina [part of a traditional Indian religious ceremony], which this declarant has also danced. Thus he replies to the question."

            —Account of questioning of Josephe, a Spanish-speaking Pueblo Indian, by Spanish authorities following the Pueblo Revolt of 1680 (1681)
            """,
            tempAnswers,
            "D"
        ));

        tempAnswers = new String[] {
            "A. were thoroughly Christianized by 1680.",
            "B. practiced nonviolent means of protest.",
            "C. traded extensively with the Spanish, but resented heavy taxes imposed on trade.",
            "D. targeted symbols of Spanish culture as well as the Spanish political and economic system."
        };
        questionsP1.add(new Question(
            """
            "Asked what causes or motives the said Indian rebels had for renouncing the law of God and obedience to his Majesty, and for committing so many kinds of crimes, [Josephe answered] the causes they have were alleged ill treatment and injuries received from [Spanish authorities], because they beat them, took away what they had, and made them work without pay. Thus he replies.

            "Asked if he has learned if it has come to his notice during the time that he has been here the reason why the apostates burned the images, churches, and things pertaining to divine worship, making a mockery and a trophy of them, killing the priests and doing the other things they did, he said that he knows and had heard it generally stated that while they were besieging the villa the rebellious traitors burned the church and shouted in loud voices, 'Now the God of the Spaniards, who was their father, is dead, and Santa Maria, who was their mother, and the saints, who were pieces of rotten wood,' saying that only their own god lived. . . . The captains and the chiefs ordered that the names of Jesus and Mary should nowhere be uttered. . . . He has seen many houses of idolatry which they have built, dancing the dance of the cachina [part of a traditional Indian religious ceremony], which this declarant has also danced. Thus he replies to the question."

            —Account of questioning of Josephe, a Spanish-speaking Pueblo Indian, by Spanish authorities following the Pueblo Revolt of 1680 (1681)
            """,
            tempAnswers,
            "D"
        ));

        tempAnswers = new String[] {
            "A. Spanish colonizing efforts in North America in the late 1600s and 1700s saw an accommodation with some aspects of American Indian culture.",
            "B. Spanish military actions and disease wiped out the American Indian populations in Spanish North America.",
            "C. Spanish forces, having been defeated by the Pueblo Indians, abandoned all land claims in North America by 1700.",
            "D. Spain and Great Britain formed an alliance to establish European control over North America."
        };
        questionsP1.add(new Question(
            """
            "Asked what causes or motives the said Indian rebels had for renouncing the law of God and obedience to his Majesty, and for committing so many kinds of crimes, [Josephe answered] the causes they have were alleged ill treatment and injuries received from [Spanish authorities], because they beat them, took away what they had, and made them work without pay. Thus he replies.

            "Asked if he has learned if it has come to his notice during the time that he has been here the reason why the apostates burned the images, churches, and things pertaining to divine worship, making a mockery and a trophy of them, killing the priests and doing the other things they did, he said that he knows and had heard it generally stated that while they were besieging the villa the rebellious traitors burned the church and shouted in loud voices, 'Now the God of the Spaniards, who was their father, is dead, and Santa Maria, who was their mother, and the saints, who were pieces of rotten wood,' saying that only their own god lived. . . . The captains and the chiefs ordered that the names of Jesus and Mary should nowhere be uttered. . . . He has seen many houses of idolatry which they have built, dancing the dance of the cachina [part of a traditional Indian religious ceremony], which this declarant has also danced. Thus he replies to the question."

            —Account of questioning of Josephe, a Spanish-speaking Pueblo Indian, by Spanish authorities following the Pueblo Revolt of 1680 (1681)
            """,
            tempAnswers,
            "A"
        ));
        // Period 2 (1800 - 1865)

      

        // Period 3 (1865 - 1945)


        // period 4 (1945 - present)

                //testing code below
        int testererer = 14;
        System.out.println("\n"+questionsP1.get(testererer)+"\n");
        System.out.println("user input: ");
        Scanner testScanner = new Scanner(System.in);
        String testInput = testScanner.nextLine();
        System.out.println(questionsP1.get(testererer).isCorrect(testInput));
    }
}