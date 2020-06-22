// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class DeleteClassUserResponse extends TeaModel {
    @NameInMap("fail_list")
    public java.util.List<OrgUser> failList;

    public static DeleteClassUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClassUserResponse self = new DeleteClassUserResponse();
        return TeaModel.build(map, self);
    }

}
