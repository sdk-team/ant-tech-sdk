// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class AddCourseUserResponse extends TeaModel {
    @NameInMap("fail_list")
    public java.util.List<OrgUser> failList;

    public static AddCourseUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCourseUserResponse self = new AddCourseUserResponse();
        return TeaModel.build(map, self);
    }

}
