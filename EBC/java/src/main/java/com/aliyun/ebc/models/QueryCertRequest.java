// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class QueryCertRequest extends TeaModel {
    @NameInMap("cert_id")
    public String certId;

    @NameInMap("org_did")
    public String orgDid;

    public static QueryCertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCertRequest self = new QueryCertRequest();
        return TeaModel.build(map, self);
    }

}
