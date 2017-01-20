package com.example.vivian.capstone_test.domain;

import android.support.annotation.NonNull;

/**
 * Created by aashreys on 20/01/17.
 */

public class Password extends Value<String> {

    public Password(@NonNull String value) throws IncorrectValueException {
        super(value);
    }

    @Override
    protected void validate(String value) throws IncorrectValueException {
        if (value.isEmpty()) {
            throw new IncorrectValueException("Value may not be empty.");
        }
    }
}
