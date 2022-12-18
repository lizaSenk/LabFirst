import java.util.Objects;

public abstract class Food implements Consumable, Nutritious {
    String name = null;
    protected String parameter = null;

    public Food(String name, String parameter) {
        this.parameter = parameter;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(name, food.name) && Objects.equals(parameter, food.parameter);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, parameter);
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", parameter='" + parameter + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getParameter() {
        return parameter;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
// Реализация метода consume() удалена из базового класса Food
// Это можно сделать, потому что сам Food - абстрактный
}