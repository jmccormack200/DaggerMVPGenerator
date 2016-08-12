interface ${filename}Contract {

    interface View extends BaseViewInterface {
    }

    interface Presenter extends BasePresenterInterface {
        void setView(${filename}Contract.View ${lowercaseFilename}View);
    }
}
