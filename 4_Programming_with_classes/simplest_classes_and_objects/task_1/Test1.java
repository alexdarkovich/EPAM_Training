package OOP.OOP_theSimpest_1;

public class Test1 {

    private int var1;
    private int var2;

    public Test1(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public void changeVar1(int newVar1) {
        var1 = newVar1;
    }
    public void changeVar2(int newVar2) {
        var2 = newVar2;
    } // методы изменения переменных

    public int sum() {
        return var1 + var2;
    } // метод, который находит сумму значения переменных

    public int max() {
        return Math.max(var1, var2);
    } // метод, который находит макс значение переменной

    public void toPrint() {
        System.out.println(var1);
        System.out.println(var2);
        System.out.println("sum = " + sum() + ", max = " + max());
    }  // метод вывода на экран
}