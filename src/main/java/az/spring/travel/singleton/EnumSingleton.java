package az.spring.travel.singleton;

public enum EnumSingleton {
    SINGLETON;

    public void showMessage() {
        System.out.println("Enum Singleton");
    }
}
