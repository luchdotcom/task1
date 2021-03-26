package com.citb408;

public abstract class RegisterProvider implements Provider{
    private String regNumber;

    public RegisterProvider(String regNumber) {
        this.regNumber = regNumber;
    }
}
