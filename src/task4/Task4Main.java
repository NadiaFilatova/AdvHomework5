package task4;

//Створіть 2 класи, Animal та Cat. У класі Animal ініціалізуйте 3 поля різних модифікаторів.
// У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
public class Task4Main {

    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("some name", 10, 100);
        System.out.println(cat);
    }
}
