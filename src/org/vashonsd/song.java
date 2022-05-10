package org.vashonsd;

public class song {
    String title;
    boolean isExplicit;
    String yearReleased;
    String signer;

    public song(String title, String yearReleased, String signer){
        this.title = title;
        this.yearReleased = yearReleased;
        this.signer = signer;
    }

    public boolean isAppropriateForKids(boolean isExplicit){
        if(isExplicit){
            return false;
        }else{
            return true;
        }
    }

    public void songLayout(String title, String yearReleased, String signer){
        System.out.println("The song "+ title + " is sung by " + signer + "." + title + " was released in " + yearReleased + "." + " Is this song explicit? " + isExplicit);
    }

}
