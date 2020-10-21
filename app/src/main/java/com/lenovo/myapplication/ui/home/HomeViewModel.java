package com.lenovo.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        System.out.println(1234);
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment哈哈哈哈哈！！！！！");
    }

    public LiveData<String> getText() {
        return mText;
    }
}