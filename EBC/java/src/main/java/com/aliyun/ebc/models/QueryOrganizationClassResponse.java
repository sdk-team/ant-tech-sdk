// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class QueryOrganizationClassResponse extends TeaModel {
    @NameInMap("class_name")
    public String className;

    @NameInMap("class_status")
    public Integer classStatus;

    @NameInMap("create_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String createTime;

    @NameInMap("modify_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String modifyTime;

    @NameInMap("period")
    public Integer period;

    @NameInMap("type")
    public String type;

    @NameInMap("user_num")
    public Integer userNum;

    public static QueryOrganizationClassResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationClassResponse self = new QueryOrganizationClassResponse();
        return TeaModel.build(map, self);
    }

}
