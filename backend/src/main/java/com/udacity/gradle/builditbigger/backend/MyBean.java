package com.udacity.gradle.builditbigger.backend;

import com.udacity.chukwuwauchenna.jokesmodule.JokesLibrary;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public String getMyData(){
        myData = JokesLibrary.getJoke();
        return myData;
    }
}