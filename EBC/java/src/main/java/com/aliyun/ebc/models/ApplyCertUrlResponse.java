// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc.models;

import com.aliyun.tea.*;

public class ApplyCertUrlResponse extends TeaModel {
    @NameInMap("cert_upload_url")
    public String certUploadUrl;

    @NameInMap("feature_upload_url")
    public String featureUploadUrl;

    @NameInMap("holder_avatar_upload_url")
    public String holderAvatarUploadUrl;

    public static ApplyCertUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertUrlResponse self = new ApplyCertUrlResponse();
        return TeaModel.build(map, self);
    }

}
