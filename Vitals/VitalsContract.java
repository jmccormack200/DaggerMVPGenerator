interface VitalsContract {

    interface View extends BaseViewInterface {
    }

    interface Presenter extends BasePresenterInterface {
        void setView(VitalsContract.View vitalsView);
    }
}
