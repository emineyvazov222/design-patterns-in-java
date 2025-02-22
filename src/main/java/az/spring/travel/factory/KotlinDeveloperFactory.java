package az.spring.travel.factory;

public class KotlinDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
