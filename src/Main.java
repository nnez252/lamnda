//interface Predicate<T> {
//    boolean predict(T t);
//}
//
//@FunctionalInterface
//interface Consumer<T> {
//    void consum(T t);
//}
//interface Function<D,L> {
//    D apply(L l);
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//        double x = 3125.312321d;
//        long y = 3125;
//        String name = "Elena";
//        int number = -23;
//        Predicate pred = new Predicate(){
//            public boolean predict(Object o) {
//                if (number > 0) {
//                    System.out.println("true");
//                } else {
//                    System.out.println("false");
//                }
//                return false;
//            }
//        };
//        pred.predict(number);

//        Predicate pred = (n) -> {
//            if (number > 0) {
//                System.out.println("true");
//            } else {
//                System.out.println("false");
//            }
//            return false;
//        };
//pred.predict(number);


//Consumer consum = new Consumer() {
//    public void consum(Object o) {
//        if (name != "") {
//            System.out.println("Привет " + name);
//        }
//    }
//};
//consum.consum(name);


//        Consumer consum = (n) -> {
//            if (name != "") {
//                System.out.println("Привет "+ name);
//            }
//        };
//        consum.consum(name);

//        Function function = new Function() {
//
//    }
//}