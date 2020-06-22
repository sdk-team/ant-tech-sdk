// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class AddCourseUserRequest extends TeaModel {
    @NameInMap("course_id")
    public String courseId;

    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("org_user_list")
    public java.util.List<OrgUser> orgUserList;

    public static AddCourseUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCourseUserRequest self = new AddCourseUserRequest();
        return TeaModel.build(map, self);
    }

}
