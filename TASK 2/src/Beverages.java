public abstract class Beverages {
    protected boolean wantsExtras;
    protected abstract void addExtras();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public abstract void addCondiments();





    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }


    public final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        addExtras();

    }




}