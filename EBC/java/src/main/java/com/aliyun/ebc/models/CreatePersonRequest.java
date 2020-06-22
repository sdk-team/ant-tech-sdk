// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class CreatePersonRequest extends TeaModel {
    @NameInMap("person_name")
    public String personName;

    @NameInMap("primary_id_no")
    public String primaryIdNo;

    @NameInMap("second_id_no_1")
    public String secondIdNo1;

    @NameInMap("second_id_no_2")
    public String secondIdNo2;

    @NameInMap("second_id_no_3")
    public String secondIdNo3;

    public static CreatePersonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonRequest self = new CreatePersonRequest();
        return TeaModel.build(map, self);
    }

}
