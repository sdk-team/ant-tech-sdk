// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class QueryClassUserResponse extends TeaModel {
    @NameInMap("class_name")
    public String className;

    @NameInMap("org_user_id_list")
    public java.util.List<String> orgUserIdList;

    @NameInMap("user_num")
    public Integer userNum;

    public static QueryClassUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClassUserResponse self = new QueryClassUserResponse();
        return TeaModel.build(map, self);
    }

}
