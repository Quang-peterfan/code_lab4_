package com.example.lab4.Bai2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.example.lab4.Bai2.LoginFragment;
import com.example.lab4.Bai2.RegisterFragment;

import com.example.lab4.R;

public class Bai2_Lab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_lab4);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Thêm LoginFragment vào FragmentContainerView
        LoginFragment loginFragment = new LoginFragment();
        fragmentTransaction.add(R.id.fragment_frame, loginFragment);

        // Kết thúc FragmentTransaction
        fragmentTransaction.commit();
    }

    public void replaceFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Thay thế LoginFragment bằng RegisterFragment
        RegisterFragment registerFragment = new RegisterFragment();
        fragmentTransaction.replace(R.id.fragment_frame, registerFragment);

        // Kết thúc FragmentTransaction
        fragmentTransaction.commit();
    }
}