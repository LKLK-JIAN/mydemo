package illuminomete.com.example.android.mydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.tv)
    TextView tv;
    @Bind(R.id.rotate)
    Button rotate;
    @Bind(R.id.alpha)
    Button alpha;
    @Bind(R.id.scale)
    Button scale;
    @Bind(R.id.translate)
    Button translate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick({R.id.rotate,R.id.alpha,R.id.scale,R.id.translate})
    public void onClick(View view){
        switch(view.getId()){
            case R.id.rotate:
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                tv.startAnimation(animation);
                break;
            case R.id.alpha:
                Animation animation1= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                tv.startAnimation(animation1);
                break;
            case R.id.scale:
                Animation animation2= AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                tv.startAnimation(animation2);
                break;
            case R.id.translate:
                Animation animation3= AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                tv.startAnimation(animation3);
                break;
        }
    }
}
