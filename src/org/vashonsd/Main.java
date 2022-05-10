package org.vashonsd;

public class Main {

    public static void main(String[] args) {
	clothing today = new clothing(53, "seattle", "afternoon");
    today.whatClothes(53);
    today.bringJacket(53);

    school now = new school("Vashon High School", "Seattle");
        System.out.println(now.isItLunch(11));
        System.out.println(now.whatClassIsIt(11));

        song scarlett = new song("Fireworks" , "2010" , "Katy Perry");
        scarlett.isAppropriateForKids(false);
        scarlett.songLayout("Fireworks" , "2012", "Katy Perry");
    }
}
