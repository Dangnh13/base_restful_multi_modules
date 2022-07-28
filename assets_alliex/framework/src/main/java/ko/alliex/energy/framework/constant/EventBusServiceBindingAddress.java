package ko.alliex.energy.framework.constant;

import lombok.Getter;

@Getter
public enum EventBusServiceBindingAddress {

    MINISTRY_POW_PLANTS_DATA_EDIT_S3_IMPORT(CommonConstant.EVENT_BUS_API.V1.Group.MinistryPowPlantsDataEdit.ADDRESS,
            CommonConstant.EVENT_BUS_API.V1.Group.MinistryPowPlantsDataEdit.GROUP_NAME,
            CommonConstant.EVENT_BUS_API.V1.Group.MinistryPowPlantsDataEdit.Apis.IMPORT_CSV),
    COMPANY_SEARCH_DATA_CSV_S3_IMPORT(CommonConstant.EVENT_BUS_API.V1.Group.Company.ADDRESS,
            CommonConstant.EVENT_BUS_API.V1.Group.Company.GROUP_NAME,
            CommonConstant.EVENT_BUS_API.V1.Group.Company.Apis.IMPORT_CSV),
    POWER_PLANT_S3_IMPORT(CommonConstant.EVENT_BUS_API.V1.Group.PowerPlant.ADDRESS,
            CommonConstant.EVENT_BUS_API.V1.Group.PowerPlant.GROUP_NAME,
            CommonConstant.EVENT_BUS_API.V1.Group.PowerPlant.Apis.IMPORT_CSV),
    PURCHASE_SALE_S3_IMPORT(CommonConstant.EVENT_BUS_API.V1.Group.Purchase.ADDRESS,
            CommonConstant.EVENT_BUS_API.V1.Group.Purchase.GROUP_NAME,
            CommonConstant.EVENT_BUS_API.V1.Group.Purchase.Apis.IMPORT_CSV),
    SALE_S3_IMPORT(CommonConstant.EVENT_BUS_API.V1.Group.Sale.ADDRESS,
            CommonConstant.EVENT_BUS_API.V1.Group.Sale.GROUP_NAME,
            CommonConstant.EVENT_BUS_API.V1.Group.Sale.Apis.IMPORT_XLSX),
    ;
    private final String address;
    private final String groupName;
    private final String path;

    EventBusServiceBindingAddress(String address, String groupName, String path) {
        this.address = address;
        this.groupName = groupName;
        this.path = path;
    }

    public String getFullPath() {
        return this.groupName + this.path;
    }
}
