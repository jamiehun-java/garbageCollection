public class UseEmployee {
    public static void main(String[] args) {
        Employee A = new Employee("Adam", 56);
        Employee B = new Employee("Becker", 45);
        Employee C = new Employee("Cian", 25);

        A.show();
        B.show();
        C.show();

        A.showNextId();
        B.showNextId();
        C.showNextId();

        {
            Employee X = new Employee("Xoxo", 23);
            Employee Y = new Employee("You", 21);

            X.show();
            Y.show();

            X.showNextId();
            Y.showNextId();

            /** Garbage Collection
             *  and gc will call method to finalize()
             *  only when we programmers have overridden it in class
             *  (Already overridden in Employee)*/
            X = Y = null;
            System.gc();
            System.runFinalization();
        }

        A.showNextId();
    }
}
