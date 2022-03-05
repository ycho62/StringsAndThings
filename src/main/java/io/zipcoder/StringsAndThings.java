package io.zipcoder;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int count = 0;
       String[] wordArr = input.split(" ");

       for (int i=0; i < wordArr.length; i++) {
           if (wordArr[i].charAt(wordArr[i].length()-1) == 'y' || wordArr[i].charAt(wordArr[i].length()-1) =='z');
                count++;


            } return count;
        }

//        int countOfYZ=0, i=0;
//    while (i<input.length()) {
//        if ((input.charAt(i) == 'y' || input.charAt(i) =='z') && (i+1==input.length() || !(Character.isLetter(input.charAt(i+1))))) {
//            countOfYZ;
//        }
//        i++;
//    }
//return countOfYZ;


//        Matcher y = Pattern.compile("[y]\\b").matcher(input);
//        int count = 0;
//        while (y.find()) {
//            count++;
//        }
//        Matcher z = Pattern.compile("[z]\\b").matcher(input);
//
//        while (z.find()) {
//            count++;
//
//
//        }
//        return count;
//
//    }


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String charString = new StringBuilder().append(remove).toString();
        return base.replace(charString, "");
    }

//    String result = base.replaceAll(remove,"");
//    return result;

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i < input.length() -1; i++) {
            if (input.charAt(i) == 'i'&& input.charAt(i+1) == 's') {
                countIs++;
            }
            if (input.charAt(i) == 'n'&& input.charAt(i+1) == 'o'&& input.charAt(i+2) == 't') {
                    countNot++;
            }
        }

        return countNot == countIs;
    }
    //int iscount=0, notcount=0;
    //Pattern pattern = Pattern.compile("is");
    //Pattern pattern1 = Pattern.compile("not");
    //Matcher matcher = pattern.matcher(input);
    //Matcher matcher1 = pattern1.matcher(input);
    // for (int i=0; matcher.find();i++){
    //  iscount++;
    //}
    //for (int i=0; matcher1.find(); i++) {
    //notcount++;
    //}
    //return iscount == notcount;


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        boolean gHappy = true;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'g'){

                if (input.charAt(i + 1) == 'g' || input.charAt(i - 1) == 'g') {
                    gHappy = true;

            } else {
                gHappy = false;
                break;
            }
        }
        }
        return gHappy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int tripleCount = 0;
        for (int i = 0; i < input.length()-2; i++) { // -2 because the index would not check for 3 letters
            if (input.charAt(i) == (input.charAt(i + 1)) && input.charAt(i+1) == input.charAt(i + 2)) {


                tripleCount++;
            }
        } return tripleCount;
    }
}

