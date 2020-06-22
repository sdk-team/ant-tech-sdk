// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class AddClassUserResponse extends TeaModel {
    @NameInMap("fail_list")
    public java.util.List<OrgUser> failList;

    public static AddClassUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClassUserResponse self = new AddClassUserResponse();
        return TeaModel.build(map, self);
    }

}
