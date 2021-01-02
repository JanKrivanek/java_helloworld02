package com.krivanek.helloworld;

import com.krivanek.basic_string_utils.StringExtender;

public class Runner {
    private final StringExtender _stringExtender;

    public Runner(StringExtender _stringExtender) {
        this._stringExtender = _stringExtender;
    }

    public void Run() {
        System.out.println("Helooooo");
    }
}
