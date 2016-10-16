import com.americanwell.teva.di.Injector;
import com.americanwell.teva.mvp.BasePresenter;

public class ${filename}Presenter extends BasePresenter implements ${filename}Contract.Presenter {

    private ${filename}Contract.View view;

    public ${filename}Presenter() {
        Injector.getPresenterComponent().inject(this);
    }

    @Override
    public void setView(${filename}Contract.View ${lowercaseFilename}View) {
        super.setView(view);
        view = ${lowercaseFilename}View;
    }
}
