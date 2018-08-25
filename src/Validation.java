
import java.util.regex.Pattern;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ropali
 */
public class Validation {

    public final int CHARACTERS_ONLY = 0;
    public final int CHARACTERS_WITH_WHITESPACE = 1;
    public final int HAS_NON_CHARACTERS = 2;

    /*
    all the validation
    will be handle by thi clas
     */
    public boolean isNumber(String textString) {
        //check if the string contains only numbers
        if (Pattern.matches("[0-9]+", textString)) {
            return true;
        } else {
            return false;
        }

    }

    public int isCharacters(String str) {
        String regex = "(.)*(\\d)(.)*";
        Pattern pattern = Pattern.compile(regex);
        boolean containsNumber = pattern.matcher(str).matches();
        if (containsNumber) {
            return HAS_NON_CHARACTERS;
        } else {
            return CHARACTERS_ONLY;
        }

    }

    public boolean isAdharNumber(String textString) {
        //check if the string contains only numbers
        if (textString.matches("[0-9]+") && textString.length() == 12) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isPanNumber(String textString) {
        //check if the string contains only numbers
        if (textString.matches("^[0-9a-zA-Z]+$") && textString.length() == 10) {
            return true;
        } else {
            return false;
        }

    }

    public int isFieldEmpty(JTextField... textFields) {//this methods takes multiple argumenst as JTextField
        int numberOfEmptyFields = 0;

        //check if any field is empty
        for (JTextField fields : textFields) {
            if (fields.getText().equals("") || fields.getText() == null) {
                numberOfEmptyFields++;
            }
        }
        return numberOfEmptyFields;

    }

}
