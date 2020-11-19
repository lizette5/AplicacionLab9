package com.example.aplicacion.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is notifications fragment 2sfer");
    }

    public LiveData<String> getText() {
        return mText;
    }
}