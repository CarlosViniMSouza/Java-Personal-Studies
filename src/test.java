public class test {
    static void methodCalcSum() {
        int otherNumberTest = 50;
        int numberTest = 100;

        System.out.println("The sum result: " + (numberTest + otherNumberTest));
    }

    public static void main(String[] args) {
        String name = "Carlos";
        int age = 22;
        boolean status = false;

        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);

        methodCalcSum();

        if (status == true) {
            System.out.println("Ok, can pass!");
        } else {
            System.out.println("You can not pass!");
        }
    }
}