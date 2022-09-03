package classComponents;

public class WebSeries {
    int webSeriesId;
    String webSeriesTitle;

    public WebSeries(int webSeriesId, String webSeriesTitle) {
        this();//call to the zero param. it must be first line
        this.webSeriesId = webSeriesId;
        this.webSeriesTitle = webSeriesTitle;

        this.accept(this);//calling current class instance method
    }

    public WebSeries() {
        System.out.println("Zero param");
    }

    void display(){
        System.out.println(this.webSeriesId+"\t"+this.webSeriesTitle);
    }

    void accept(WebSeries webSeries){
        this.display();
    }
}
