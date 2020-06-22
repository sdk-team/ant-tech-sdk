// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebc;

import com.aliyun.tea.*;
import com.aliyun.ebc.models.*;

public class Client {

    public String _endpoint;
    public String _regionId;
    public String _accessKeyId;
    public String _accessKeySecret;
    public String _protocol;
    public String _userAgent;
    public Integer _readTimeout;
    public Integer _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Integer _maxIdleConns;
    public String _authToken;
    public String _tenant;
    public String _workspace;
    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "ParameterMissing"),
                new TeaPair("message", "'config' can not be unset")
            ));
        }

        this._accessKeyId = config.accessKeyId;
        this._accessKeySecret = config.accessKeySecret;
        this._tenant = config.tenant;
        this._workspace = config.workspace;
        this._endpoint = config.endpoint;
        this._authToken = config.authToken;
        this._protocol = config.protocol;
        this._regionId = config.regionId;
        this._userAgent = config.userAgent;
        this._readTimeout = config.readTimeout;
        this._connectTimeout = config.connectTimeout;
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = config.maxIdleConns;
    }

    public java.util.Map<String, ?> doRequest(String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

        TeaRequest _lastRequest = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = com.aliyun.teautil.Common.defaultString(_protocol, protocol);
                request_.method = method;
                request_.pathname = pathname;
                request_.query = TeaConverter.buildMap(
                    new TeaPair("method", action),
                    new TeaPair("version", "1.0"),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.aliyun.alipayutil.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.aliyun.teautil.Common.getNonce())
                );
                if (!com.aliyun.teautil.Common.empty(_tenant)) {
                    request_.query.put("tenant", _tenant);
                }

                if (!com.aliyun.teautil.Common.empty(_workspace)) {
                    request_.query.put("workspace", _workspace);
                }

                if (!com.aliyun.teautil.Common.empty(_authToken)) {
                    request_.query.put("auth_token", _authToken);
                } else {
                    request_.query.put("access_key", _accessKeyId);
                }

                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint),
                    new TeaPair("user-agent", this.getUserAgent())
                );
                java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.anyifyMapValue(com.aliyun.common.Common.query(request));
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toFormString(tmp));
                request_.headers.put("content-type", "application/x-www-form-urlencoded");
                java.util.Map<String, String> signedParam = TeaConverter.merge(String.class,
                    request_.query,
                    com.aliyun.common.Common.query(request)
                );
                request_.query.put("sign", com.aliyun.alipayutil.Client.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                Object obj = com.aliyun.teautil.Common.readAsJSON(response_.body);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.aliyun.alipayutil.Client.hasError(res)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    continue;
                }
                throw e;
            }
        }

        throw new TeaUnretryableException(_lastRequest);
    }

    /**
     * Get user agent
     * @return user agent
     */
    public String getUserAgent() throws Exception {
        String userAgent = com.aliyun.teautil.Common.getUserAgent(_userAgent);
        return userAgent;
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级
     */
    public DeleteCourseClassResponse deleteCourseClass(DeleteCourseClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCourseClassEx(request, runtime);
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级
     */
    public DeleteCourseClassResponse deleteCourseClassEx(DeleteCourseClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.course.class.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new DeleteCourseClassResponse());
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
    证书已发布则会返回证书图片、证书其他信息的文件上传url。
    文件最大5M
     * Summary: 申请证书信息上传url
     */
    public ApplyCertUrlResponse applyCertUrl(ApplyCertUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyCertUrlEx(request, runtime);
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
    证书已发布则会返回证书图片、证书其他信息的文件上传url。
    文件最大5M
     * Summary: 申请证书信息上传url
     */
    public ApplyCertUrlResponse applyCertUrlEx(ApplyCertUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.cert.url.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new ApplyCertUrlResponse());
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级
     */
    public AddCourseClassResponse addCourseClass(AddCourseClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCourseClassEx(request, runtime);
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级
     */
    public AddCourseClassResponse addCourseClassEx(AddCourseClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.course.class.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new AddCourseClassResponse());
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员
     */
    public AddClassUserResponse addClassUser(AddClassUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addClassUserEx(request, runtime);
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员
     */
    public AddClassUserResponse addClassUserEx(AddClassUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.class.user.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new AddClassUserResponse());
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书
     */
    public QueryOrganizationCertResponse queryOrganizationCert(QueryOrganizationCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrganizationCertEx(request, runtime);
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书
     */
    public QueryOrganizationCertResponse queryOrganizationCertEx(QueryOrganizationCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.organization.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryOrganizationCertResponse());
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员
     */
    public AddCourseUserResponse addCourseUser(AddCourseUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCourseUserEx(request, runtime);
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员
     */
    public AddCourseUserResponse addCourseUserEx(AddCourseUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.course.user.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new AddCourseUserResponse());
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员
     */
    public DeleteCourseUserResponse deleteCourseUser(DeleteCourseUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCourseUserEx(request, runtime);
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员
     */
    public DeleteCourseUserResponse deleteCourseUserEx(DeleteCourseUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.course.user.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new DeleteCourseUserResponse());
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级
     */
    public CreateOrganizationClassResponse createOrganizationClass(CreateOrganizationClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrganizationClassEx(request, runtime);
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级
     */
    public CreateOrganizationClassResponse createOrganizationClassEx(CreateOrganizationClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.organization.class.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateOrganizationClassResponse());
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询
     */
    public QueryClassUserResponse queryClassUser(QueryClassUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryClassUserEx(request, runtime);
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询
     */
    public QueryClassUserResponse queryClassUserEx(QueryClassUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.class.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryClassUserResponse());
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询
     */
    public QueryCertResponse queryCert(QueryCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCertEx(request, runtime);
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询
     */
    public QueryCertResponse queryCertEx(QueryCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryCertResponse());
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程
     */
    public UpdateOrganizationCourseResponse updateOrganizationCourse(UpdateOrganizationCourseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrganizationCourseEx(request, runtime);
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程
     */
    public UpdateOrganizationCourseResponse updateOrganizationCourseEx(UpdateOrganizationCourseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.organization.course.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new UpdateOrganizationCourseResponse());
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出
     */
    public CancelPersonResponse cancelPerson(CancelPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPersonEx(request, runtime);
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出
     */
    public CancelPersonResponse cancelPersonEx(CancelPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.person.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CancelPersonResponse());
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书
     */
    public CreateUserCertResponse createUserCert(CreateUserCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserCertEx(request, runtime);
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书
     */
    public CreateUserCertResponse createUserCertEx(CreateUserCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.user.cert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateUserCertResponse());
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员
     */
    public DeleteClassUserResponse deleteClassUser(DeleteClassUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClassUserEx(request, runtime);
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员
     */
    public DeleteClassUserResponse deleteClassUserEx(DeleteClassUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.class.user.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new DeleteClassUserResponse());
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人
     */
    public CreatePersonResponse createPerson(CreatePersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPersonEx(request, runtime);
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人
     */
    public CreatePersonResponse createPersonEx(CreatePersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.person.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreatePersonResponse());
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入
     */
    public ResumePersonResponse resumePerson(ResumePersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumePersonEx(request, runtime);
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入
     */
    public ResumePersonResponse resumePersonEx(ResumePersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.person.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new ResumePersonResponse());
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询
     */
    public QueryOrganizationClassResponse queryOrganizationClass(QueryOrganizationClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrganizationClassEx(request, runtime);
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询
     */
    public QueryOrganizationClassResponse queryOrganizationClassEx(QueryOrganizationClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.organization.class.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryOrganizationClassResponse());
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级
     */
    public UpdateOrganizationClassResponse updateOrganizationClass(UpdateOrganizationClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrganizationClassEx(request, runtime);
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级
     */
    public UpdateOrganizationClassResponse updateOrganizationClassEx(UpdateOrganizationClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.organization.class.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new UpdateOrganizationClassResponse());
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书
     */
    public QueryUserCertResponse queryUserCert(QueryUserCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserCertEx(request, runtime);
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书
     */
    public QueryUserCertResponse queryUserCertEx(QueryUserCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.user.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryUserCertResponse());
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程
     */
    public CreateOrganizationCourseResponse createOrganizationCourse(CreateOrganizationCourseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrganizationCourseEx(request, runtime);
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程
     */
    public CreateOrganizationCourseResponse createOrganizationCourseEx(CreateOrganizationCourseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.organization.course.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateOrganizationCourseResponse());
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业
     */
    public CreateOrganizationResponse createOrganization(CreateOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrganizationEx(request, runtime);
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业
     */
    public CreateOrganizationResponse createOrganizationEx(CreateOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.organization.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateOrganizationResponse());
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册
     */
    public CreateOrganizationUserResponse createOrganizationUser(CreateOrganizationUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrganizationUserEx(request, runtime);
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册
     */
    public CreateOrganizationUserResponse createOrganizationUserEx(CreateOrganizationUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("baas.ebc.organization.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateOrganizationUserResponse());
    }
}
