package javabrains.unit1;

import javabrains.unit1.Celebrity;

public class CheckIfSinger implements CheckTalent {

    public boolean test(Celebrity celebrity){
        return celebrity.isCanSing();
    }

}
