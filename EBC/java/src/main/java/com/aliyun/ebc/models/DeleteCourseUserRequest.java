// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class DeleteCourseUserRequest extends TeaModel {
    @NameInMap("course_id")
    public String courseId;

    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("org_user_list")
    public java.util.List<OrgUser> orgUserList;

    public static DeleteCourseUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCourseUserRequest self = new DeleteCourseUserRequest();
        return TeaModel.build(map, self);
    }

}
