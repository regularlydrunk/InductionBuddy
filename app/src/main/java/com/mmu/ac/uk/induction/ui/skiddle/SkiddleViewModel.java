package com.mmu.ac.uk.induction.ui.skiddle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SkiddleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SkiddleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}