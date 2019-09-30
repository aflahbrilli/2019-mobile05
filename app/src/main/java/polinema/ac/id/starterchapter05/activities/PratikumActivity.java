package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.PraktikumFragment;

public class PratikumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratikum);
    }

    public void handlerClickHandstandFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (getSupportFragmentManager().findFragmentByTag("PRAKTIKUM_FRAGMENT") != null) ;
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_right, R.anim.exit_from_left, R.anim.enter_from_right);
        fragmentTransaction.replace(R.id.fragmentHolder, new PraktikumFragment(), "PRAKTIKUM_FRAGMENT");
        FragmentTransaction.addToBackStack(null);
    }
    {
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_right, R.anim.exit_from_left, R.anim.enter_from_right);
        fragmentTransaction.replace(R.id.fragmentHolder, new PraktikumFragment(),"PRAKTIKUM_FRAGMENT");
        FragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
