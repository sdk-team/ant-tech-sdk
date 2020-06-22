// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class DeleteClassUserRequest extends TeaModel {
    @NameInMap("class_id")
    public String classId;

    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("org_user_list")
    public java.util.List<OrgUser> orgUserList;

    public static DeleteClassUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClassUserRequest self = new DeleteClassUserRequest();
        return TeaModel.build(map, self);
    }

}
