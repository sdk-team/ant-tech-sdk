// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class DeleteCourseUserResponse extends TeaModel {
    @NameInMap("fail_list")
    public java.util.List<OrgUser> failList;

    public static DeleteCourseUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCourseUserResponse self = new DeleteCourseUserResponse();
        return TeaModel.build(map, self);
    }

}
