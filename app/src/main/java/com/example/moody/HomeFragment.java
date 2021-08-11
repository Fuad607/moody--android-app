package com.example.moody;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

public class HomeFragment extends Fragment {

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        FloatingActionButton add_mood = (FloatingActionButton) v.findViewById(R.id.add_mood);

        add_mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        TextView link_log = (TextView) v.findViewById(R.id.link_log);
        link_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment logFragment = new LogFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, logFragment).addToBackStack(null).commit();
            }
        });

        TextView link_history = (TextView) v.findViewById(R.id.link_history);
        link_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment historyFragment = new HistoryFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, historyFragment).addToBackStack(null).commit();
            }
        });

        TextView link_help = (TextView) v.findViewById(R.id.link_help);
        link_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment helpFragment = new HelpFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, helpFragment).addToBackStack(null).commit();
            }
        });

        return v;
    }
}
