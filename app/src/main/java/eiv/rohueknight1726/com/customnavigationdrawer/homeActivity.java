package eiv.rohueknight1726.com.customnavigationdrawer;





import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import eiv.rohueknight1726.com.customnavigationdrawer.Fragments.eventsFragment;
import eiv.rohueknight1726.com.customnavigationdrawer.Fragments.messagesFragment;
import eiv.rohueknight1726.com.customnavigationdrawer.Fragments.homeFragment;
import eiv.rohueknight1726.com.customnavigationdrawer.Fragments.notificationFragment;

public class homeActivity extends AppCompatActivity {

    FrameLayout fragmentContainer,layoutContainer;
    homeFragment homeFrag;
    Boolean NavOpen = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        homeFrag = new homeFragment();

        fragmentContainer = (FrameLayout)findViewById(R.id.fragmentContainer);
        layoutContainer = (FrameLayout)findViewById(R.id.layoutContainer);

        initializeHomeFragment();


    }

    private void initializeHomeFragment(){

        homeFragment myf = new homeFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainer, myf, "HELLO");
        fragmentTransaction.commit();
    }
    public void toggleNavBar(View v){
        if (NavOpen){
            layoutContainer.animate().scaleX(1f).scaleY(1f).translationX(0).start();
            NavOpen = false;
        }
        else
        {

            layoutContainer.animate().scaleX(0.8f).scaleY(0.8f).translationX(-600).start();
            NavOpen = true;
        }
    }

    public void callProfile(View v){
        toggleNavBar(v);
        changeFragment("Profile");

    }

    public void callEvents(View v){
        toggleNavBar(v);
        changeFragment("Events");
    }

    public void callMessages(View v){
        toggleNavBar(v);
        changeFragment("Messages");

    }

    public void callNotification(View v){
        toggleNavBar(v);
        changeFragment("Notification");

    }

    private void changeFragment(String s) {

        Fragment myf = null;
        switch (s) {
            case "Profile": {
                myf = new homeFragment();
                break;
            }
            case "Messages":{
                myf = new messagesFragment();
                break;
            }
            case "Notification":{
                myf = new notificationFragment();
                break;
            }
            case "Events":{
                myf = new eventsFragment();
                break;
            }

            default:
                break;
        }


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, myf, "HELLO");
        fragmentTransaction.commit();
    }
}
