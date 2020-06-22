// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class ApplyCertUrlRequest extends TeaModel {
    @NameInMap("cert_code")
    public String certCode;

    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("org_user_id")
    public String orgUserId;

    public static ApplyCertUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertUrlRequest self = new ApplyCertUrlRequest();
        return TeaModel.build(map, self);
    }

}
