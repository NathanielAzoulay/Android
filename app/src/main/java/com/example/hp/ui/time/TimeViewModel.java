package com.example.hp.ui.time;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TimeViewModel() {
        mText = new MutableLiveData<>();
        Date t1 = Calendar.getInstance().getTime();
        SimpleDateFormat t = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());
        String t2 = t.format(t1);
        mText.setValue(t2);
    }

    public LiveData<String> getText() {
        return mText;
    }
}