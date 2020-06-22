// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class CreateUserCertRequest extends TeaModel {
    @NameInMap("cert_code")
    public String certCode;

    @NameInMap("cert_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String certEndTime;

    @NameInMap("cert_name_cn")
    public String certNameCn;

    @NameInMap("cert_name_en")
    public String certNameEn;

    @NameInMap("cert_publish_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String certPublishTime;

    @NameInMap("cert_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String certStartTime;

    @NameInMap("cert_status")
    public Integer certStatus;

    @NameInMap("country")
    public String country;

    @NameInMap("expire_type")
    public Integer expireType;

    @NameInMap("holder_name")
    public String holderName;

    @NameInMap("level")
    public String level;

    @NameInMap("org_did")
    public String orgDid;

    @NameInMap("org_name")
    public String orgName;

    @NameInMap("org_user_id")
    public String orgUserId;

    @NameInMap("primary_id_no")
    public String primaryIdNo;

    @NameInMap("second_id_no_1")
    public String secondIdNo1;

    @NameInMap("second_id_no_2")
    public String secondIdNo2;

    @NameInMap("second_id_no_3")
    public String secondIdNo3;

    @NameInMap("type")
    public String type;

    public static CreateUserCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserCertRequest self = new CreateUserCertRequest();
        return TeaModel.build(map, self);
    }

}
