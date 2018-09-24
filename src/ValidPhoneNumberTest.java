public class ValidPhoneNumberTest {
    public static final String[] validPhone = {"(84)-(0978489648)"};
    public static final String[] invalidPhone = {"(a8)-(22222222)"};

    public static void main(String[] args) {
        ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();

        for (String item : validPhone) {
            boolean isvalid = validPhoneNumber.validate(item);
            System.out.println("Phone: "+ item + "is valid: "+ isvalid);
        }

        for (String item : invalidPhone) {
            boolean isvalid = validPhoneNumber.validate(item);
            System.out.println("Phone: "+ item + "is valid: "+ isvalid);
        }
    }
}
