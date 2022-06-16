package web.models;

public class Cars {
    private String model;
    private int series;
    private int yearOfIssue;

    public Cars() {
    }

    public Cars(int series,String model, int yearOfIssue) {
        this.model = model;
        this.series = series;
        this.yearOfIssue = yearOfIssue;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Cars = " +
                "model= " + model + '\'' +
                ", engine= " + series + '\'' +
                ", yearOfIssue= " + yearOfIssue;
    }
}
