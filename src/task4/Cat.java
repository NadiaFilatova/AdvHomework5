package task4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

////Створіть 2 класи, Animal та Cat. У класі Animal ініціалізуйте 3 поля різних модифікаторів.
//// У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
public class Cat extends Animal {
    public Cat(String name, int age, int lens) throws IllegalAccessException {
        super(name, age, lens);
        test();
    }

    private void test() throws IllegalAccessException {
        List<Field> fields = getAllFields(this.getClass());
        for (Field parentField : fields) {
            parentField.setAccessible(true);
            if (parentField.getType().isAssignableFrom(Integer.class)) {
                parentField.setInt(this, 40);
            } else if (parentField.getType().isAssignableFrom(Byte.class)) {
                parentField.setByte(this, (byte) 12);
            } else if (parentField.getType().isAssignableFrom(Short.class)) {
                parentField.setShort(this, (short) 3434);
            } else if (parentField.getType().isAssignableFrom(Long.class)) {
                parentField.setLong(this, 121212121);
            } else if (parentField.getType().isAssignableFrom(Double.class)) {
                parentField.setDouble(this, 5.5);
            } else if (parentField.getType().isAssignableFrom(String.class)) {
                parentField.set(this, "some stringName");
            } else if (parentField.getType().isAssignableFrom(Float.class)) {
                parentField.setFloat(this, 12345679);
            } else if (parentField.getType().isAssignableFrom(Boolean.class)) {
                parentField.set(this, true);
            } else parentField.setChar(this, (char) 3433);
        }
    }

    private List<Field> getAllFields(Class<?> clazz) {
        if (clazz == null) {
            return Collections.emptyList();
        }
        List<Field> result = new ArrayList<>(getAllFields(clazz.getSuperclass()));
        List<Field> filteredFields = new ArrayList<>(Arrays.asList(clazz.getDeclaredFields()));
        result.addAll(filteredFields);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + getAge() + ", " +
                "name='" + getName() + '\'' +
                ", lens=" + getLens() +
                '}';
    }
}