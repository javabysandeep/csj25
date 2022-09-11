package oops.inheritance;

public class TenantTest {
    public static void main(String[] args) {
        TenantEntity baseEntity = new TenantEntity();
        baseEntity.addTenant();
        System.out.println(baseEntity.tenantId);
        System.out.println(baseEntity.tenantName);
        System.out.println(baseEntity.tenantLocation);

        baseEntity.display(baseEntity.tenantId, baseEntity.tenantName, baseEntity.tenantLocation);
    }
}
