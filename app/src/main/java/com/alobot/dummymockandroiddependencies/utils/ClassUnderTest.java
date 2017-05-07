package com.alobot.dummymockandroiddependencies.utils;

import android.content.Context;

import com.alobot.dummymockandroiddependencies.R;

public class ClassUnderTest {
    private Context context;

    public ClassUnderTest(Context context) {
        this.context = context;
    }

    public String getHelloWorldString() {
        return this.context.getString(R.string.hello_world);
    }
}
