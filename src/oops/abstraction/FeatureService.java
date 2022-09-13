package oops.abstraction;

public abstract class FeatureService {
    FeatureService(){
        System.out.println("Feature Service con");
    }
    abstract void addFeature(String feature);
}
