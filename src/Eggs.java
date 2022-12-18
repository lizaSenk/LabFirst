import java.util.Objects;
import java.util.Scanner;
public class Eggs extends Food implements Nutritious {

    public String getParameter(){
        return parameter;
        // return number;
    }
    public void setParameter(String number){
        //  this.number = number;
        this.parameter = number;
    }

    public Eggs(String number) {

        super("Яйца", "");
        //this.number = number;
        this.parameter = number;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    @Override
    public String toString() {
        return "Eggs{" +
                "number='" + /*number*/  parameter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Eggs eggs = (Eggs) o;
        return parameter.equals(eggs.parameter);
    }

    public int calculateCalories() {
        int caloriesForOne = 50;
        int resultCalories = 0;
        if (parameter.equals("one")) {
            resultCalories = caloriesForOne;
        } else if (parameter.equals("two")) {
            resultCalories = caloriesForOne * 2;
        } else if (parameter.equals("three")) {
            resultCalories = caloriesForOne * 3;
        } else {
            System.out.println("параметр не из таблицы");
        }
        return resultCalories;
    }
}
