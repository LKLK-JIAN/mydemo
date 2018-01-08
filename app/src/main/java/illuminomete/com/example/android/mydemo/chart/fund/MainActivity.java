package illuminomete.com.example.android.mydemo.chart.fund;

import android.os.Bundle;
import android.view.View;

import illuminomete.com.example.android.mydemo.R;
import illuminomete.com.example.android.mydemo.chart.fund.timesharing.TimeSharingActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void goFundView(View view) {
        go(FundActivity.class);

    }

    public void goTimeShring(View view) {
        go(TimeSharingActivity.class);
    }
}
