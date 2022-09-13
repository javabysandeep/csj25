package oops.abstraction;

public abstract class FeatureServiceImpl extends FeatureService {
    FeatureServiceImpl() {
        super();
        System.out.println("Feature Service Impl con");
    }

    @Override
    void addFeature(String feature) {
        System.out.println("add feature implemented");
    }


}
