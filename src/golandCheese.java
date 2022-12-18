
public class golandCheese extends Food implements Nutritious {
    private boolean eaten = false;
    private String gramms1;
    public golandCheese(String gramms1) {
        super("Голландский Сыр", " ");
        this.parameter=gramms1;
    }

    public void consume(){
        System.out.println(this + " съеден");
        eaten = true;
    }

    public String getParameter(){
        return parameter;
    }
    public void setParameter(String gramms1){
        this.parameter = gramms1;
    }

    public boolean equals(Object arg0){
        if (super.equals(arg0)){
            if (!(arg0 instanceof golandCheese)) return false;
            return parameter.equals(((golandCheese)arg0).parameter);
        } else
            return false;
    }
    public String toString() {
        return "golandCheese{" +
                "gramms1='" + parameter + '\'' +
                '}';
    }

    public int calculateCalories() {
        int caloriesForOne = 100;
        int resultCalories = 0;

        if (parameter.equals("100")) {
            resultCalories = caloriesForOne;
        } else if (parameter.equals("200")) {
            resultCalories = caloriesForOne * 2;
        } else if (parameter.equals("300")) {
            resultCalories = caloriesForOne * 3;
        } else {
            System.out.println("параметр не из таблицы");
        }
        return resultCalories;

    }
}
