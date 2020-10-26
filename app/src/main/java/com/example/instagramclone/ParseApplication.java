package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ilReq31O0HxjL0GAEQIKbiZ4w3NGNfiFmMrTG9K7")
                .clientKey("uw1774l3BalpL2keufG0HL01fUkuYL7iYj0tckpZ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
