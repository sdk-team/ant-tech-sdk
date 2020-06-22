// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class OrgUser extends TeaModel {
    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("org_user_id")
    public String orgUserId;

    public static OrgUser build(java.util.Map<String, ?> map) throws Exception {
        OrgUser self = new OrgUser();
        return TeaModel.build(map, self);
    }

}
