/*
 * Copyright (C) 2015 Giuseppe Sorce.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.giuseppesorce.databinding.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.giuseppesorce.databinding.BR;

/**
 * @author Giuseppe Sorce
 */
public class FieldsForm extends BaseObservable{

    private String name;
    private String surname;
    private String address;
    private String message;
    private String buttonSend;
    private boolean hasmessage;


    public FieldsForm(String name, String surname, String address, String message, String send, boolean hasmessage) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.message = message;
        this.buttonSend = send;
        this.hasmessage = hasmessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getButtonSend() {
        return buttonSend;
    }

    public void setButtonSend(String buttonSend) {
        this.buttonSend = buttonSend;
    }


    @Bindable
    public boolean isHasmessage() {
        return hasmessage;
    }

    public void setHasmessage(boolean bmessage) {
        this.hasmessage = bmessage;
        notifyPropertyChanged(BR.hasmessage);
    }
}
