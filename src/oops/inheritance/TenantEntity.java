package oops.inheritance;

public class TenantEntity extends BaseEntity {
    int tenantId = 100;
    String tenantName = "Tenant Entity";
    String tenantLocation = " Tenant Entity location";

    void addTenant() {
        System.out.println("Tenant added via tenant entity");
    }

    void display(int tenantId, String tenantName, String tenantLocation) {
        System.out.println(tenantId + "\t" + tenantName + "\t" + tenantLocation);
        System.out.println(this.tenantId + "\t" + this.tenantName + "\t" + this.tenantLocation);
        System.out.println(super.tenantId + "\t" + super.tenantName + "\t" + super.tenantLocation);


    }
}
