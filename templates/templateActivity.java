import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.americanwell.teva.BaseActivity;

import butterknife.ButterKnife;

public class ${filename}Activity extends BaseActivity<${filename}Contract.Presenter>
        implements ${filename}Contract.View {

    @Inject ${filename}Contract.Presenter presenter;

    public static Intent makeIntent(Context context) {
        return new Intent(context, ${filename}Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	
        ButterKnife.bind(this);

        if (presenter == null) {
		${filename}Injector.get${filename}Component().inject(this);
        }
        presenter.setView(this);
    }

    @NonNull
    @Override
    protected ${filename}Contract.Presenter getPresenter() {
        return presenter;
    }

    @Override
    protected void setPresenter(${filename}Contract.Presenter presenter) {
        this.presenter = presenter;
    }
}
