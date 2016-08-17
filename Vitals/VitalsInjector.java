public class VitalsInjector {

    private static VitalsComponent vitalsComponent;

    private VitalsInjector() {
        // private no-arg constructor for singleton class to force static usage
    }

    static VitalsComponent getVitalsComponent() {
        if (vitalsComponent != null) {
            return vitalsComponent;
        }
        return Injector.getApplicationComponent().plus(new vitalsModule());
    }

    static void setVitalsComponent(
            VitalsComponent vitalsComponent) {
        VitalsInjector.vitalsComponent = vitalsComponent;
    }

    @VitalsScope
    @Subcomponent(modules = {VitalsModule.class})
    public interface VitalsComponent {
        void inject(VitalsActivity activity);
    }

    @Module
    public static final class VitalsModule {
        @Provides
        VitalsContract.Presenter provideVitalsPresenter() {
            return new VitalsPresenter();
        }
    }
}
