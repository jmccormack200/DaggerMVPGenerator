public class ${filename}Injector {

    private static ${filename}Component ${lowercaseFilename}Component;

    private ${filename}Injector() {
        // private no-arg constructor for singleton class to force static usage
    }

    static ${filename}Component get${filename}Component() {
        if (${lowercaseFilename}Component != null) {
            return ${lowercaseFilename}Component;
        }
        return Injector.getApplicationComponent().plus(new ${filename}Module());
    }

    static void set${filename}Component(
            ${filename}Component ${lowercaseFilename}Component) {
        ${filename}Injector.${lowercaseFilename}Component = ${lowercaseFilename}Component;
    }

    @${filename}Scope
    @Subcomponent(modules = {${filename}Module.class})
    public interface ${filename}Component {
        void inject(${filename}Activity activity);
    }

    @Module
    public static final class ${filename}Module {
        @Provides
        ${filename}Contract.Presenter provide${filename}Presenter() {
            return new ${filename}Presenter();
        }
    }
}
