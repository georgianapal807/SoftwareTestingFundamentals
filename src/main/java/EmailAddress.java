public class EmailAddress {

    //The syntax of a valid address:
    //The prefix must contain only letters (a-z), numbers, underscores, periods, and dashes.
    //An underscore, period, or dash must be followed by one or more letter or number.
    //Allowed characters: letters, numbers, dashes.
    //The last portion of the domain must be at least two characters,
    // for example: .com, .org, .cc

    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public boolean isEmptyEmailAddress(String email) {
        return email.isBlank();
    }
}
