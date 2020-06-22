// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class CreateOrganizationRequest extends TeaModel {
    @NameInMap("org_code")
    public String orgCode;

    @NameInMap("org_name")
    public String orgName;

    public static CreateOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationRequest self = new CreateOrganizationRequest();
        return TeaModel.build(map, self);
    }

}
