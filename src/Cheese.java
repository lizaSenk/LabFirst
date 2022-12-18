public class Cheese extends Food implements Nutritious {
    private boolean eaten = false;
    private String gramms;
    public Cheese(String gramms) {
        super("Сыр", " ");
        this.parameter=gramms;
    }

    public void consume(){
        System.out.println(this + " съеден");
        eaten = true;
    }

    public String getParameter(){
        return parameter;
    }
    public void setParameter(String gramms){
        this.parameter = gramms;
    }

    public boolean equals(Object arg0){
        if (super.equals(arg0)){
            if (!(arg0 instanceof Cheese)) return false;
            return parameter.equals(((Cheese)arg0).parameter);
        } else
            return false;
    }
    public String toString() {
        return "Cheese{" +
                "gramms='" + parameter + '\'' +
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



