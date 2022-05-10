package org.vashonsd;

public class school {
    String name;
    String city;
    int time;


    public school(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public boolean isItLunch(int time) {
        if (time == 12) {
            return true;
        } else {
            return false;
        }
    }

    public String whatClassIsIt(int time) {
        if (time == 8) {
            return "It is first period";
        } else if (time == 9) {
            return "It is second period";
        } else if (time == 10) {
            return "It is third period";
        } else if (time == 11) {
            return "It is forth period";
        } else if (time == 12) {
            return "Class is not going right now";
        } else if (time == 13) {
            return "It is fifth period";
        } else if (time == 14) {
            return "It is fifth period";
        } else if (time == 15) {
            return "It is sixth period";
        } else {
            return "School is not in session right now";
        }
    }





    }

