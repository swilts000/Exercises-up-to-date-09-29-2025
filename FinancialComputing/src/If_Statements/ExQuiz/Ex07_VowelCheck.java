package If_Statements.ExQuiz;

public class Ex07_VowelCheck {
    public static void main(String[] args) {
        String text = "spreg Bt jv";
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        if(text.indexOf(vowel[0]) != -1  || text.indexOf(vowel[1]) != -1 || text.indexOf(vowel[2]) != -1 || text.indexOf(vowel[3]) != -1 || text.indexOf(vowel[4]) != -1) {
            System.out.println("Vowel detected");
        }else  {
            System.out.println("No Vowel detected");
        }
        boolean upperDetected = containsCapitalLetterStream(text);
        if(upperDetected) {
            System.out.println("Capital Letter detected");
        }else  {
            System.out.println("No Capital Letter detected");
        }


        }
        public static boolean containsCapitalLetterStream(String str) {
        return str.chars().anyMatch(Character::isUpperCase);
    }
    }

