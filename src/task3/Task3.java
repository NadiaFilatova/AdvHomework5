package task3;

//Створіть клас, в ньому визначте 3 поля, до цих полів створіть конструктори та методи.
// Використовуючи рефлексію отримайте всю інформацію про поля, методи, конструктори, а також модифікатори доступу.
public class Task3 {
    public int number1;
    private String name;
    protected float number2;

    public Task3(int number1, String name, float number2) {
        this.number1 = number1;
        this.name = name;
        this.number2 = number2;
    }

    public void setNumber1(int num) {
        this.number1 = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    private void print() {
        System.out.println(number1 + name + number2);
    }


}
