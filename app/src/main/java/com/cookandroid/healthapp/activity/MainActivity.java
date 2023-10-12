package com.cookandroid.healthapp.activity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.healthapp.fragment.BoardFragment;
import com.cookandroid.healthapp.fragment.HomeFragment;
import com.cookandroid.healthapp.R;
import com.cookandroid.healthapp.fragment.SettingFragment;
import com.cookandroid.healthapp.fragment.TestFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import org.checkerframework.checker.nullness.qual.NonNull;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    HomeFragment homeFragment;
    SettingFragment settingFragment;
    BoardFragment boardFragment;
    TestFragment testFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("헬스 도우미");


        homeFragment = new HomeFragment();
        settingFragment = new SettingFragment();
        boardFragment = new BoardFragment();
        testFragment = new TestFragment();

        init();

    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                init();
                break;
        }
    }
    private void init(){
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser == null) {
            startLoginActivity();
        } else {
            DocumentReference documentReference = FirebaseFirestore.getInstance().collection("users").document(firebaseUser.getUid());
            documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document != null) {
                            if (document.exists()) {
                                Log.d(TAG, "DocumentSnapshot data: " + document.getData());
                            } else {
                                Log.d(TAG, "No such document");
                                startUserActivity();
                            }
                        }
                    } else {
                        Log.d(TAG, "get failed with ", task.getException());
                    }
                }
            });
            getSupportFragmentManager().beginTransaction().replace(R.id.containers,homeFragment).commit();



            NavigationBarView navigationBarView = findViewById(R.id.bottom_nav);
            navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()){
                        case R.id.action_a:
                            getSupportFragmentManager().beginTransaction().replace(R.id.containers,homeFragment).commit();
                            break;
                        case R.id.action_b:
                            getSupportFragmentManager().beginTransaction().replace(R.id.containers,boardFragment).commit();
                            break;
                        case R.id.action_c:
                            getSupportFragmentManager().beginTransaction().replace(R.id.containers,testFragment).commit();
                            break;
                        case R.id.action_d:
                            getSupportFragmentManager().beginTransaction().replace(R.id.containers,settingFragment).commit();
                            break;
                    }

                    return true;
                }
            });
        }
    }

    private void startLoginActivity(){
        Intent intent2 = new Intent(MainActivity.this , LoginActivity.class);
        finish();
        startActivity(intent2);
    }
    private void startUserActivity() {
        Intent intent = new Intent(MainActivity.this , UserActivity.class);
        finish();
        startActivity(intent);
    }
}