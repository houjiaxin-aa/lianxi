package src.company.chapter09_1.prototype;

public class GoldenCudgel implements Cloneable {
    public GoldenCudgel() {
    }
    public GoldenCudgel(boolean disappear) {
        this.disappear = disappear;
    }
    private boolean disappear;
    public boolean isDisappear() {
        return disappear;
    }
    public void setDisappear(boolean disappear) {
        this.disappear = disappear;
    }
    public GoldenCudgel clone() {
        GoldenCudgel goldenCudgel = null;
        try {
            goldenCudgel = (GoldenCudgel) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return goldenCudgel;
    }
    public boolean equals(GoldenCudgel obj) {
        return obj.isDisappear() == disappear;
    }
}
