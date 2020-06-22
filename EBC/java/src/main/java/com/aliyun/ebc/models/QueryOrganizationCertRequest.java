// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class QueryOrganizationCertRequest extends TeaModel {
    @NameInMap("end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String end;

    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String start;

    public static QueryOrganizationCertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationCertRequest self = new QueryOrganizationCertRequest();
        return TeaModel.build(map, self);
    }

}
