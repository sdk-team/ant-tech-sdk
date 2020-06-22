// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class DeleteCourseClassRequest extends TeaModel {
    @NameInMap("class_list")
    public java.util.List<Class> classList;

    @NameInMap("course_id")
    public String courseId;

    @NameInMap("org_did")
    public String orgDid;

    public static DeleteCourseClassRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCourseClassRequest self = new DeleteCourseClassRequest();
        return TeaModel.build(map, self);
    }

}
