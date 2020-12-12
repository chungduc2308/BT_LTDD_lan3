package com.chungduc.ute.apptong_lan3;

public class Contact {
    private int Icon;
    private String Name;

    public Contact(int icon, String name) {
        Icon = icon;
        Name = name;
    }

    public int getIcon() {
        return Icon;
    }

    public void setIcon(int icon) {
        Icon = icon;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
