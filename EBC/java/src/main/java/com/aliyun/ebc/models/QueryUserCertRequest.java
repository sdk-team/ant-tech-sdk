// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class QueryUserCertRequest extends TeaModel {
    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("org_user_id")
    public String orgUserId;

    public static QueryUserCertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserCertRequest self = new QueryUserCertRequest();
        return TeaModel.build(map, self);
    }

}
