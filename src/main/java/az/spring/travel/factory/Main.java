package az.spring.travel.factory;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloperFactoryByLanguage(ProgrammingLanguage.JAVA);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory getDeveloperFactoryByLanguage(ProgrammingLanguage language) {
        return switch (language) {
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
        };
    }
}
