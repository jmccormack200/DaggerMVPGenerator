import com.americanwell.teva.BasePresenterInterface;
import com.americanwell.teva.BaseViewInterface;

public interface ${filename}Contract {

    interface View extends BaseViewInterface {
    }

    public interface Presenter extends BasePresenterInterface {
        void setView(${filename}Contract.View ${lowercaseFilename}View);
    }
}
