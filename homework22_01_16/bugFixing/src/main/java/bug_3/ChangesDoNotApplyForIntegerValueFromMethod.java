package bug_3;

public class ChangesDoNotApplyForIntegerValueFromMethod {
    private Integer value = 1;

    public Integer getValue() {
        return value;
    }

    public void changeVal(Integer value) {
        value = new Integer(3);
    }

    public static void main(String args[]) {
        Integer a = new Integer(2222);
        System.out.println(a);
        ChangesDoNotApplyForIntegerValueFromMethod c = new ChangesDoNotApplyForIntegerValueFromMethod();
        System.out.println(c.getValue());//get value before changes
        c.changeVal(a);//change c from 1 -> a -> must be 2222
        System.out.print("a == c.getValue() ? " + (a == c.getValue() ? "true" : "false"));//should be "true"
    }
}
