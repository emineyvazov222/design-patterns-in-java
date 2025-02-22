package az.spring.travel.prototype;

public class Main {
    public static void main(String[] args) {

        PersonPrototype original = new PersonPrototype("Emin", 21);
        System.out.println("Original name: " + original.getName() + "   " + "Original age: " + original.getAge());


        PersonPrototype clone = original.clone();
        System.out.println("Clone name: " + clone.getName() + "   " + "Clone age: " + clone.getAge());

        original.setName("Elshan");
        original.setAge(22);
        System.out.println(original.getName() + "   " + original.getAge());

    }
}
