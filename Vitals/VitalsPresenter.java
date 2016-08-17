public class VitalsPresenter extends BasePresenter implements VitalsContract.Presenter {

    private VitalsContract.View view;

    VitalsPresenter() {
        Injector.getPresenterComponent().inject(this);
    }

    @Override
    public void setView(VitalsContract.View vitalsView) {
        super.setView(view);
        view = vitalsView;
    }
}
