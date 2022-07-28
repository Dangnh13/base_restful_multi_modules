package ko.alliex.energy.framework.constant;

/**
 * Global constants
 */
public class CommonConstant {

    public static final String AWS_MAIL_REGION = "email-smtp.ap-northeast-1.amazonaws.com";

    public static final String RESOURCE_BUNDLE_COMMON = "messages";

    public interface TOKEN {
        String TOKEN_PREFIX_BEARER = "Bearer ";

        String ID_TOKEN = "id_token";

        String ACCESS_TOKEN = "access_token";

        interface USER_CLAIM_SET {
            String EMAIL = "email";
            String NAME = "name";
            String UID = "uid";
            String GIVEN_NAME = "given_name";
            String FAMILY_NAME = "family_name";
        }

        interface SUBSYSTEM_CLAIM_SET {
            String CLIENT_ID = "cid";
            String RESOURCE_ID = "rid";
        }
    }

    public interface MODEL_ATTRIBUTE {
        String STATUS_CODE = "statusCode";
        String STACK_TRACE = "stackTrace";
    }

    public interface FILE_EXTENSION {
        String CSV = ".csv";
        String DAT = ".dat";
        String XLSX = ".xlsx";
    }

    public interface OPERATION {
        String BEFORE_OPERATION = "運転開始前";
        String ACTIVE = "ACTIVE";
        String INACTIVE = "INACTIVE";
    }


    public interface FLAG {
        String YES = "YES";
        String NO = "NO";
    }

    public interface TEXT {
        String OOAZA = "大字";
        String AZA = "字";
    }

    public interface ACCOUNTANT {
        String ACCOUNTANT_NOT_FOUND = "住所は会計士事務所だが代表者名が不一致";
        String ADDRESS_NOT_FOUND = "代表者名は会計士だが住所が不一致";
    }

    public interface STATUS {
        String TYPE_1 = "TYPE_1";
        String TYPE_2 = "TYPE_2";
        String TYPE_3 = "TYPE_3";
        String TYPE_4 = "TYPE_4";
        String TYPE_5 = "TYPE_5";
        String TYPE_6 = "TYPE_6";
        String TYPE_7 = "TYPE_7";
        String TYPE_8 = "TYPE_8";
        String TYPE_9 = "TYPE_9";
        String TYPE_10 = "TYPE_10";
        String TYPE_11 = "TYPE_11";
        String TYPE_12 = "TYPE_12";
        String TYPE_13 = "TYPE_13";
    }

    public interface REAL_STATUS {
        String ARI = "EDIT_YES";
        String NASHI = "EDIT_NO";
        String SHINKI = "ADD_NEW";
    }

    public interface POWPLANT_STATUS {
        int NEW = 0;
        int NONE_MODIFIED = 1;
        int MODIFIED = 2;
        int DELETE = 3;
    }

    public interface CONFIRM_FLAG {
        String INFORMATION_CHANGE = "ステータス目検（事業者名一致、代表者不一致、住所不一致、電話番号不一致）";
        String HOUHOU_KOUKOU = "ステータス目検（個人→個人か法人→法人か不明）";
        String HOUKOU_HOUHOU = "ステータス目検（法人→個人か法人→法人か不明）";
        String COMPANY_CHANGE = "ステータス目検（事業者・代表者不一致）";
        String HOUJIN_KOUJIN_FUMEI = "法人個人不明";
        String NO_CODE = "新規企業";
        String PREF_CHECK = "都道府県・市区町村目検";
    }

    public interface SYMBOL {

        String SLASH_SYMBOL = "/";
        String SLASH_FW = "／";

        String SPACE = " ";

        String BLANK_FW = "　";

        String TILDE_SYMBOL = "~";

        String BACK_SLASH = "\\";

        String MINUS_SYMBOL = "-";

        String DOT_SYMBOL = ".";

        String COMMA_SYMBOL = ",";

        String PREFIX_DOMAIN_MAIL = "@";

        String PERCENT = "%";

        String COLON_SYMBOL = ":";
        String COMMA_QUOTE = "\",\"";

        String COLON_QUOTE = "\":\"";

        String QUESTION = "？";

        String UNDERSCORE_SYMBOL = "_";

    }

    public interface PROCESS_STATUS {
        String RUNNING = "RUNNING";
        String NOT_RUN = "NOT_RUN";
        String ERROR = "ERROR";
    }

    public interface COMPLETED_CONFIRM {
        String NO = "NO";
        String YES = "YES";
        String SKIP = "SKIP";
        String DEL = "DEL";
        String DONE = "DONE";
    }

    public interface DASH {
        String BIG = "—";
        String NORMAL = "−";
        String SMALL = "‐";
        String HUGE = "ー";
    }

    public interface IBUYER {
        String NEDO_TYPE = "NEDO 1981-2009";
        String KISOCHOU_TYPE = "気象庁 2000-2019";
        String METPV = "METPV20";
        String REAL_TYPE = "実績値";
        Short ERROR_STATUS = 1;
        Short NORMAL_STATUS = 0;
        Integer IBUYER_USER = 1;
    }

    public interface IBUYER_ERROR {
        String MISSING_ID = "Missing the powerplantId and ministryId";
        String POW_PLANT_NOT_FOUND = "Not found power plant";
        String NEDO_NOT_FOUND = "Power plant don't have longitude, latitude";
        String NEDO_DATA_NONE = "Nedo don't have solar or temp or snow";
        String REAL_TYPE_PARAM = "Real type doesn't have enough parameters";
        String KISOUCHOU_ERROR = "There is no Japan Meteorological Agency data";
        String UNKNOWN_ERROR = "Unknown Error";
    }

    public interface DATE_FORMAT {
        String YYYY_MM_DD = "yyyy/MM/dd";
        String YYYY_MM_DD_DASH = "yyyy-MM-dd";
        String YYYY_MM_DD_HH_MM_SS_DASH = "yyyy-MM-dd HH:mm:ss";
        String YYYYMM = "yyyyMM";
        String DD_MM_YYYY = "dd/MM/yyyy";

        String YYYY_MM_DD_HH_MM = "yyyyMMddHHmm";
        String YYYY_MM_DD_HH_MM_SLASH = "yyyy/MM/dd HH:mm";
        String YYYY_MM_DD_HH_MM_SS_SLASH = "yyyy/MM/dd HH:mm:ss";
        String DD_MM_YYYY_HH_MM_SLASH = "dd/MM/yyyy HH:mm";
        String HH_MM = "HHmm";
        String JUST_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm'+09:00'";

        String YYYY_MM_DASH = "yyyy-MM";

        String YYYY_MM_DD_HH_MM_SS_UNDERSCORE = "yyyyMMdd_HHmmss";

    }

    public interface MAIL_TEMPLATE {
        String SIMPLE_TEXT = "simple_text_template.ftl";
    }

    public interface PAGING {
        int GET_ALL = 0;
        int PAGE_SIZE = 20;
        int PAGE_OFFSET_DEFAULT = 0;
    }

    public interface PATH_PATTERNS {

        String ALL = "/**";

        String[] SWAGGER = {"/v2/api-docs",
                "/configuration/ui",
                "/swagger-resources/**",
                "/configuration/security",
                "/swagger-ui/**",
                "/webjars/**",
                "/resources/**"
        };

        String HEALTH = "/actuator/**";

        String AUTH = "/auth/**/login";

    }

    public interface MESSAGE {
        interface VALIDATION {
            String NOT_VALID_KEY = "javax.validation.constraints.Master.message";
            String NOT_FOUND_KEY = "error.message.common.service.NotFound.message";
            String ERR_HAS_BEEN_DELETE_MSG = "error.message.common.delete.hasBeenDeleted";
            String DUPLICATED_KEY = "error.message.common.duplicated";
            String ERR_POW_PLANT_FILE_HAS_BEEN_DELETE = "error.message.powPlantFile.cud.notAllowDelete";
            String NOT_BLANK_KEY = "javax.validation.constraints.NotBlank.message";
        }
    }

    public interface AWS {
        interface S3 {
            interface Folders {
                String WEB_ROOT_FOLDER = "web/";
                String WEB_POW_PLANT_FOLDER = WEB_ROOT_FOLDER + "pow_plant/";
                String EXPORT_CSV_FOLDER = WEB_ROOT_FOLDER + "csv_export/";
            }
        }
    }

    public interface EVENT_BUS_API {
        String ROOT = "/event-bus";

        interface V1 {
            String API_VERSION = ROOT + "/v1";

            interface Group {
                interface MinistryPowPlantsDataEdit {
                    String ADDRESS = "service.MinistryPowPlantsDataEdit";
                    String GROUP_NAME = API_VERSION + "/ministry-pow-plants-data-edit";

                    interface Apis {
                        String IMPORT_CSV = "/s3-import-csv";
                    }
                }

                interface Company {
                    String ADDRESS = "service.Company";
                    String GROUP_NAME = API_VERSION + "/company";

                    interface Apis {
                        String IMPORT_CSV = "/s3-import-csv";
                    }
                }

                interface PowerPlant {
                    String ADDRESS = "service.PowerPlant";
                    String GROUP_NAME = API_VERSION + "/power-plant";

                    interface Apis {
                        String IMPORT_CSV = "/s3-import-csv";
                    }
                }

                interface Purchase {
                    String ADDRESS = "service.Purchase";
                    String GROUP_NAME = API_VERSION + "/purchase";

                    interface Apis {
                        String IMPORT_CSV = "/s3-import-csv";
                    }
                }

                interface Sale {
                    String ADDRESS = "service.Sale";
                    String GROUP_NAME = API_VERSION + "/sale";

                    interface Apis {
                        String IMPORT_XLSX = "/s3-import-xlsx";
                    }
                }
            }
        }
    }

    public interface IReport {
        String ROOT = "jp\\afterfit\\energy\\report";

        interface Purchase {
            String RP_PURCHASE_RANK_SALE = ROOT + "\\rp_purchase_rank_sale.jrxml";
            String RP_SALE = ROOT + "\\rp_sale.jrxml";
        }
    }
}
