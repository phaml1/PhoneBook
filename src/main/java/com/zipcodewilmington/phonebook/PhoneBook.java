package com.zipcodewilmington.phonebook;

import java.util.*;
import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {this.phonebook = new LinkedHashMap<>();}


    public void add(String name, String phoneNumber) {
        ArrayList<String> nameAndPhone = new ArrayList<>();
        nameAndPhone.add(phoneNumber);
        this.phonebook.put(name, nameAndPhone);
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> additions = new ArrayList<>();
        additions.addAll(Arrays.asList(phoneNumbers));
        //Map<String, List<String>> additions = new HashMap<>();
        //additions.put(name, );
        this.phonebook.put(name, additions);
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for(String name: phonebook.keySet()){
            if(phonebook.get(name).contains(phoneNumber)){
                return name;
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(phonebook.keySet());
    }


    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
