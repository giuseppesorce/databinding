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

/**
 * @author Giuseppe Sorce
 */
public class FieldsForm {

    public String name;
    public String surname;
    public String address;
    public String message;
    public String buttonSend;
    public boolean hasmessage;


    public FieldsForm(String name, String surname, String address, String message, String send, boolean hasmessage) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.message = message;
        this.buttonSend = send;
        this.hasmessage = hasmessage;
    }
}
