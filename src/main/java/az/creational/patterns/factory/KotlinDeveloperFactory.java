package az.creational.patterns.factory;

public class KotlinDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
