// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class QueryClassUserRequest extends TeaModel {
    @NameInMap("class_id")
    public String classId;

    @NameInMap("org_did")
    public String orgDid;

    public static QueryClassUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClassUserRequest self = new QueryClassUserRequest();
        return TeaModel.build(map, self);
    }

}
