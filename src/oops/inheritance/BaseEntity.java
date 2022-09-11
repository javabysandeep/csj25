package oops.inheritance;

public class BaseEntity {
    int tenantId = 1;
    String tenantName = "Base Tenant";
    String tenantLocation = "Base Tenant location";

    void addTenant(){
        System.out.println("Tenant added");
    }
}
