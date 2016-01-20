package bug_3;

public class ChangesDoNotApplyForIntegerValueFromMethod {
    private Integer value = 1;

    public Integer getValue() {
        return value;
    }

    public void changeVal(Integer value) {
        this.value = new Integer(value); // добавили this.value
    }

    public static void main(String args[]) {
        Integer a = new Integer(2222);
        System.out.println(a);
        ChangesDoNotApplyForIntegerValueFromMethod c = new ChangesDoNotApplyForIntegerValueFromMethod();
        System.out.println(c.getValue());//get value before changes
        c.changeVal(a);//change c from 1 -> a -> must be 2222
        System.out.println(c.getValue());
        System.out.print("a == c.getValue() ? " + (a.equals(c.getValue()) ? "true" : "false"));//should be "true"
        // метод сравнения == не работает т.к., мы используем не примитивный идентификатор int, а Integer и а - это просто ссылка.
    }
}
