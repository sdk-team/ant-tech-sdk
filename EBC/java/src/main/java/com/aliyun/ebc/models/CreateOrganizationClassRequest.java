// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class CreateOrganizationClassRequest extends TeaModel {
    @NameInMap("capacity")
    public Integer capacity;

    @NameInMap("class_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String classEndTime;

    @NameInMap("class_name")
    public String className;

    @NameInMap("class_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String classStartTime;

    @NameInMap("class_status")
    public Integer classStatus;

    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("type")
    public Integer type;

    public static CreateOrganizationClassRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationClassRequest self = new CreateOrganizationClassRequest();
        return TeaModel.build(map, self);
    }

}
