public class test {
    static void methodCalc() {
        int otherNumberTest = 50;
        int numberTest = 100;

        System.out.println("The sum result: " + (numberTest + otherNumberTest));
        System.out.println("The sub result: " + (numberTest - otherNumberTest));
        System.out.println("The mult result: " + (numberTest * otherNumberTest));
        System.out.println("The div result: " + (numberTest / otherNumberTest));
    }

    public static void main(String[] args) {
        boolean status = false;

        methodCalc();

        if (status == true) {
            System.out.println("Ok, can pass!");
        } else {
            System.out.println("You can not pass!");
        }
    }
}