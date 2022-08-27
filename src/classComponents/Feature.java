package classComponents;

public class Feature {
    int featureId;

    //zero param con provided by developer
    Feature(){
        featureId = 100;
        System.out.println("zero param constructor");
    }

    public static void main(String[] args) {
        Feature feature = new Feature();//
        System.out.println(feature.featureId);

        Feature feature1 = new Feature();//
        System.out.println(feature1.featureId);
    }
    static void Feature(){
        System.out.println("this is an instance method which has same name as of class name");
    }
}
