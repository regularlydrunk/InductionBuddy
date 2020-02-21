package com.mmu.ac.uk.induction.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.mmu.ac.uk.induction.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private WebView WebView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        return root;
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        WebView = (WebView) view.findViewById(R.id.WebView);
        WebView.setWebViewClient(new WebViewClient());
        WebView.loadUrl("https://www2.mmu.ac.uk/welcome/events/");
    }
}