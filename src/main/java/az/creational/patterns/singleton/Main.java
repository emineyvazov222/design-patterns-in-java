package az.creational.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        //Lazy Singleton

//        LazySingleton lazySingleton1 = LazySingleton.getInstance();
//        LazySingleton lazySingleton2 = LazySingleton.getInstance();
//        LazySingleton lazySingleton3 = LazySingleton.getInstance();
//
//        System.out.println(lazySingleton1.hashCode() + " "
//               + lazySingleton2.hashCode() + " " + lazySingleton3.hashCode());


        //Eager Singleton

//        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
//        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
//        EagerSingleton eagerSingleton3 = EagerSingleton.getInstance();
//
//        System.out.println(eagerSingleton1.hashCode() + " "
//                + eagerSingleton2.hashCode() + " " + eagerSingleton3.hashCode());


        // MultiThread Singleton

//        MultiThreadSingleton singleton1 = MultiThreadSingleton.getInstance();
//        MultiThreadSingleton singleton2 = MultiThreadSingleton.getInstance();
//        MultiThreadSingleton singleton3 = MultiThreadSingleton.getInstance();
//
//        System.out.println(singleton1.hashCode() + " "
//                + singleton2.hashCode() + " " + singleton3.hashCode());


        // Enum Singleton

        EnumSingleton enumSingleton = EnumSingleton.SINGLETON;
        enumSingleton.showMessage();


    }
}
