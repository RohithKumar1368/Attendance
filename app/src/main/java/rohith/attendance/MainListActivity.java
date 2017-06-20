package rohith.attendance;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment) ;

        //adding a fragment to the activity
        FragmentManager fm = getSupportFragmentManager() ;
        Fragment fragment = fm.findFragmentById(R.id.fragmnetContainer) ;

        if (fragment == null) {
            fragment = new MainListFragment() ;
            fm.beginTransaction().add(R.id.fragmnetContainer,fragment).commit() ;
        }
    }
}
