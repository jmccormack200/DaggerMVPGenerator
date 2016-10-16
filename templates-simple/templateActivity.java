import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.americanwell.teva.BaseActivity;

import butterknife.ButterKnife;

public class ${filename}Activity extends BaseActivity<${filename}Contract.Presenter>
        implements ${filename}Contract.View {

    public static Intent makeIntent(Context context) {
        return new Intent(context, ${filename}Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        presenter.setView(this);
    }
}
