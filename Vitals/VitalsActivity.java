public class VitalsActivity extends BaseActivity<VitalsContract.Presenter>
        implements VitalsContract.View {

    @Inject VitalsContract.Presenter presenter;

    public static Intent makeIntent(Context context) {
        return new Intent(context, VitalsActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	
        ButterKnife.bind(this);

        if (presenter == null) {
		VitalsInjector.getVitalsComponent().inject(this);
        }
        presenter.setView(this);
    }

    @NonNull
    @Override
    protected VitalsContract.Presenter getPresenter() {
        return presenter;
    }

    @Override
    protected void setPresenter(VitalsContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
