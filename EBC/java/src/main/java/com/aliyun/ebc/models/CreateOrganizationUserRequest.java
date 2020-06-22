// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class CreateOrganizationUserRequest extends TeaModel {
    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("person_did")
    public String personDid;

    @NameInMap("uid")
    public String uid;

    public static CreateOrganizationUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationUserRequest self = new CreateOrganizationUserRequest();
        return TeaModel.build(map, self);
    }

}
