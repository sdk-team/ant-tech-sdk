// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class QueryOrganizationClassRequest extends TeaModel {
    @NameInMap("class_id")
    public String classId;

    @NameInMap("org_did")
    public String orgDid;

    public static QueryOrganizationClassRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationClassRequest self = new QueryOrganizationClassRequest();
        return TeaModel.build(map, self);
    }

}
