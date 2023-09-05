package com.example.quizcraft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank  {

    private static List<QuestionsList> scienceQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Brass gets discoloured in air because of the presence of which of the following gases in air?", "Oxygen", "Hydrogen Sulphide", "Carbon Dioxide", "Nitrogen", "Hydrogen Sulphide", "");
        final QuestionsList question2 = new QuestionsList("Which of the following is a non metal that remains liquid at room temperature?", "Phosphorus", "Bromine", "Chlorine", "Helium", "Bromine", "");
        final QuestionsList question3 = new QuestionsList("Chlorophyll is a naturally occurring chelate compound in which central metal is ______?", "Copper", "Magnesium", "Iron", "Calcium", "Magnesium", "");
        final QuestionsList question4 = new QuestionsList("Which of the following is used in pencils?", "Graphite", "Silicon", "Charcoal", "Phosphorus", "Graphite", "");
        final QuestionsList question5 = new QuestionsList("Which of the following metals forms an amalgam with other metals?", "Tin", "Mercury", "Lead", "Zinc", "Mercury", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;

    }

    private static List<QuestionsList> logicQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("QPO, NML, KJI, _____, EDC", "HGF", "CAB", "JKM", "GHD", "HGF", "");
        final QuestionsList question2 = new QuestionsList("ATNHG, DKCMB, CVPJI, GNFPE, EXRLK, JQISH, GZTNM, _____", "MTLVK", "PQMTH", "PQMTH", "PQMTH", "MTLVK", "");
        final QuestionsList question3 = new QuestionsList("FISH : SCHOOL, ____:_____", "Cow : Farm", "Wolf : Pack", "Herd : Peacock", "Elephant: Jungle", "Wolf : Pack", "");
        final QuestionsList question4 = new QuestionsList("PASTORAL : RURAL, ____:_____", "Sleepy : Nocturnal", "Harvest : Autumn", "Agrarian : Benevolent", "Metropolitan : Urban", "Metropolitan : Urban", "");
        final QuestionsList question5 = new QuestionsList("Suresh, the son of Mahesh is married to Sia, whose sister Jia is married to Amar, the brother of Suresh. How is Jia related to Mahesh?", "Daughter in law", "Cousin", "Sister in law", "Sister", "Daughter in law", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;

    }

    private static List<QuestionsList> triviaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Who was the ancient Greek goddess of love and beauty?", "Aphrodite", "Calliope", " Athena", "Calypso", "Aphrodite", "");
        final QuestionsList question2 = new QuestionsList("What does the Q in IQ stand for?", "Quantity", "Quorum", "Quality", "Quotient", "Quotient", "");
        final QuestionsList question3 = new QuestionsList("What is the name of Superman’s home planet?", "Argon", "Rann", "Krypton", "Qward", "Krypton", "");
        final QuestionsList question4 = new QuestionsList("In which U.S. city is NASA’s Mission Control Center located?", "Huntsville, Alabama", "Houston, Texas", " Hampton, Virginia", "Cape Canaveral, Florida", "Houston, Texas", "");
        final QuestionsList question5 = new QuestionsList("In meteorology, what name is given to a line of equal pressure on a map?", "Isotherm", "Isobar", "Isochor", "Isoquant", "Isobar", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;

    }

    private static List<QuestionsList> programmingQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Which of the following function prototype is perfectly acceptable?", "int Function(int Tmp = Show());", "float Function(int Tmp = Show(int, float));", "Both A and B", "float = Show(int, float) Function(Tmp);", "int Function(int Tmp = Show());", "");
        final QuestionsList question2 = new QuestionsList("Which of the following statement is incorrect?", "Default arguments can be provided for pointers to functions.", "A function can have all its arguments as default", "Default argument cannot be provided for pointers to functions.", "A default argument cannot be redefined in later declaration.", "Default argument cannot be provided for pointers to functions.", "");
        final QuestionsList question3 = new QuestionsList("Which of the following statement is correct?", "Constructors can have default parameters.", "Constructors cannot have default parameters.", "Constructors cannot have more than one default parameter.", "Constructors can have at most five default parameters.", "Constructors can have default parameters.", "");
        final QuestionsList question4 = new QuestionsList("Which of the following function / type of function cannot be overloaded?", "Member function", "Static function", "Virtual function", " Both B and C", "Virtual function", "");
        final QuestionsList question5 = new QuestionsList("Which of the following statement will be correct if the function has three arguments passed to it?", "The trailing argument will be the default argument.", "The first argument will be the default argument.", "The middle argument will be the default argument.", "All the argument will be the default argument", "The trailing argument will be the default argument.", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;

    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "science":
                return scienceQuestions();
            case "logic":
                return logicQuestions();
            case "trivia":
                return triviaQuestions();
            default:
                return programmingQuestions();
        }
    }

}