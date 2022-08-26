package ko.alliex.energy.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RoleMaster implements Serializable {
    private Integer roleId;

    private String roleIdentifier;

    private String roleName;

    private Short isDeleted;

    private Integer createdUid;

    private Date createdAt;

    private Integer updatedUid;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public enum Column {
        roleId("role_id", "roleId", "INTEGER", false),
        roleIdentifier("role_identifier", "roleIdentifier", "VARCHAR", false),
        roleName("role_name", "roleName", "VARCHAR", false),
        isDeleted("is_deleted", "isDeleted", "SMALLINT", false),
        createdUid("created_uid", "createdUid", "INTEGER", false),
        createdAt("created_at", "createdAt", "TIMESTAMP", false),
        updatedUid("updated_uid", "updatedUid", "INTEGER", false),
        updatedAt("updated_at", "updatedAt", "TIMESTAMP", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}