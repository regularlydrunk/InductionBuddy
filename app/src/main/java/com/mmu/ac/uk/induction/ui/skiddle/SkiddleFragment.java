package com.mmu.ac.uk.induction.ui.skiddle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.mmu.ac.uk.induction.R;

public class SkiddleFragment extends Fragment {

    private SkiddleViewModel skiddleViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        skiddleViewModel =
                ViewModelProviders.of(this).get(SkiddleViewModel.class);
        View root = inflater.inflate(R.layout.fragment_skiddle, container, false);

                //Drop Down Menu For Venues
                Spinner Venues = (Spinner) root.findViewById(R.id.SPNVenues);
                ArrayAdapter<String> AdpVenues = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getActivity().getResources().getStringArray(R.array.Venues));
                AdpVenues.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Venues.setAdapter(AdpVenues);
                Venues.setPrompt("Venues");
                //Drop Down Menu For Venues
                Spinner Event = (Spinner) root.findViewById(R.id.SPNEvent);
                ArrayAdapter<String> AdpEvent = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getActivity().getResources().getStringArray(R.array.Event_Type));
                AdpEvent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Event.setAdapter(AdpEvent);
                Event.setPrompt("Event");
                //Drop Down Menu For Distance
                Spinner Distance = (Spinner) root.findViewById(R.id.SPNDistance);
                ArrayAdapter<String> AdpDistance = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getActivity().getResources().getStringArray(R.array.Distance));
                AdpDistance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Distance.setAdapter(AdpDistance);
                Distance.setPrompt("Distance");



        return root;
    }
}