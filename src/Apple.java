
public class Apple extends Food implements Nutritious {
    private String size;
    public Apple(String size){
        super("яблоко", " ");
        this.parameter = size;
    }
    public void consume(){
        System.out.println(this + "съеден");
    }

    public String getParameter(){
        return parameter;
    }
    public void setParameter(String size){
        this.parameter = size;
    }

    public boolean equals(Object arg0){
        if (super.equals(arg0)){
            if (!(arg0 instanceof Apple)) return false;
            return parameter.equals(((Apple)arg0).parameter);
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size='" + parameter + '\'' +
                '}';
    }

    public int calculateCalories() {
        int caloriesForOne = 40;
        int resultCalories = 0;
        if (parameter.equals("little")) {
            resultCalories = caloriesForOne;
        } else if (parameter.equals("middle")) {
            resultCalories = caloriesForOne * 2;
        } else if (parameter.equals("big")) {
            resultCalories = caloriesForOne * 3;
        } else {
            System.out.println("параметр не из таблицы");
        }
        return resultCalories;
    }
}