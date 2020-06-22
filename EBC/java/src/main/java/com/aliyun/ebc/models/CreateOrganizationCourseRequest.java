// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class CreateOrganizationCourseRequest extends TeaModel {
    @NameInMap("course_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String courseEndTime;

    @NameInMap("course_name")
    public String courseName;

    @NameInMap("course_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String courseStartTime;

    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("period")
    public Integer period;

    public static CreateOrganizationCourseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationCourseRequest self = new CreateOrganizationCourseRequest();
        return TeaModel.build(map, self);
    }

}
