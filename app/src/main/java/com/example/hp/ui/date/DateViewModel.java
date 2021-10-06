package com.example.hp.ui.date;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Calendar;
import java.util.Formatter;

public class DateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DateViewModel() {
        mText = new MutableLiveData<>();
        Formatter fmt = new Formatter();
        Calendar c = Calendar.getInstance();
        fmt = new Formatter();
        int day = c.get(Calendar.DATE);
        String month = String.valueOf(fmt.format("%tb",c));
        int year = c.get(Calendar.YEAR);
        mText.setValue(""+day+"-"+""+month+"-"+""+year);
    }

    public LiveData<String> getText() {
        return mText;
    }
}