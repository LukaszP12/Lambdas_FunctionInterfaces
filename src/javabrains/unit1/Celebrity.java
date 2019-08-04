package javabrains.unit1;

public class Celebrity {

    private String name;
    private boolean canSing;
    private boolean canAct;
    private boolean canDance;

    public Celebrity(String name, boolean canSing, boolean canAct, boolean canDance) {
        this.name = name;
        this.canSing = canSing;
        this.canAct = canAct;
        this.canDance = canDance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanSing() {
        return canSing;
    }

    public void setCanSing(boolean canSing) {
        this.canSing = canSing;
    }

    public boolean isCanAct() {
        return canAct;
    }

    public void setCanAct(boolean canAct) {
        this.canAct = canAct;
    }

    public boolean isCanDance() {
        return canDance;
    }

    public void setCanDance(boolean canDance) {
        this.canDance = canDance;
    }
}