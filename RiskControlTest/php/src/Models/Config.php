<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\RiskControlTest\Models;

use AlibabaCloud\Tea\Model;

/**
 * Model for initing client
 */
class Config extends Model {
    protected $_default = [
        'accessKeyId' => '',
        'accessKeySecret' => '',
        'authToken' => '',
        'protocol' => 'http',
        'regionId' => '',
        'readTimeout' => '',
        'connectTimeout' => '',
        'httpProxy' => '',
        'httpsProxy' => '',
        'endpoint' => '',
        'noProxy' => '',
        'maxIdleConns' => '',
        'userAgent' => '',
        'socks5Proxy' => '',
        'socks5NetWork' => '',
        'tenant' => '',
        'workspace' => '',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        $res['accessKeyId'] = $this->accessKeyId;
        $res['accessKeySecret'] = $this->accessKeySecret;
        $res['authToken'] = $this->authToken;
        $res['protocol'] = $this->protocol;
        $res['regionId'] = $this->regionId;
        $res['readTimeout'] = $this->readTimeout;
        $res['connectTimeout'] = $this->connectTimeout;
        $res['httpProxy'] = $this->httpProxy;
        $res['httpsProxy'] = $this->httpsProxy;
        $res['endpoint'] = $this->endpoint;
        $res['noProxy'] = $this->noProxy;
        $res['maxIdleConns'] = $this->maxIdleConns;
        $res['userAgent'] = $this->userAgent;
        $res['socks5Proxy'] = $this->socks5Proxy;
        $res['socks5NetWork'] = $this->socks5NetWork;
        $res['tenant'] = $this->tenant;
        $res['workspace'] = $this->workspace;
        return $res;
    }
    /**
     * @param array $map
     * @return Config
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['accessKeyId'])){
            $model->accessKeyId = $map['accessKeyId'];
        }
        if(isset($map['accessKeySecret'])){
            $model->accessKeySecret = $map['accessKeySecret'];
        }
        if(isset($map['authToken'])){
            $model->authToken = $map['authToken'];
        }
        if(isset($map['protocol'])){
            $model->protocol = $map['protocol'];
        }
        if(isset($map['regionId'])){
            $model->regionId = $map['regionId'];
        }
        if(isset($map['readTimeout'])){
            $model->readTimeout = $map['readTimeout'];
        }
        if(isset($map['connectTimeout'])){
            $model->connectTimeout = $map['connectTimeout'];
        }
        if(isset($map['httpProxy'])){
            $model->httpProxy = $map['httpProxy'];
        }
        if(isset($map['httpsProxy'])){
            $model->httpsProxy = $map['httpsProxy'];
        }
        if(isset($map['endpoint'])){
            $model->endpoint = $map['endpoint'];
        }
        if(isset($map['noProxy'])){
            $model->noProxy = $map['noProxy'];
        }
        if(isset($map['maxIdleConns'])){
            $model->maxIdleConns = $map['maxIdleConns'];
        }
        if(isset($map['userAgent'])){
            $model->userAgent = $map['userAgent'];
        }
        if(isset($map['socks5Proxy'])){
            $model->socks5Proxy = $map['socks5Proxy'];
        }
        if(isset($map['socks5NetWork'])){
            $model->socks5NetWork = $map['socks5NetWork'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @description accesskey id
     * @var string
     */
    public $accessKeyId;

    /**
     * @description accesskey secret
     * @var string
     */
    public $accessKeySecret;

    /**
     * @description auth token
     * @var string
     */
    public $authToken;

    /**
     * @description http protocol
     * @example http
     * @var string
     */
    public $protocol;

    /**
     * @description region id
     * @example cn-hangzhou
     * @var string
     */
    public $regionId;

    /**
     * @description read timeout
     * @example 10
     * @var integer
     */
    public $readTimeout;

    /**
     * @description connect timeout
     * @example 10
     * @var integer
     */
    public $connectTimeout;

    /**
     * @description http proxy
     * @example http://localhost
     * @var string
     */
    public $httpProxy;

    /**
     * @description https proxy
     * @example https://localhost
     * @var string
     */
    public $httpsProxy;

    /**
     * @description endpoint
     * @example cs.aliyuncs.com
     * @var string
     */
    public $endpoint;

    /**
     * @description proxy white list
     * @example http://localhost
     * @var string
     */
    public $noProxy;

    /**
     * @description max idle conns
     * @example 3
     * @var integer
     */
    public $maxIdleConns;

    /**
     * @description user agent
     * @example Alibabacloud/1
     * @var string
     */
    public $userAgent;

    /**
     * @description socks5 proxy
     * @var string
     */
    public $socks5Proxy;

    /**
     * @description socks5 network
     * @example TCP
     * @var string
     */
    public $socks5NetWork;

    /**
     * @description 当需要调用API操作指定租户的资源时， 需要提供目标租户的ID
     * @example MYBKC1CN
     * @var string
     */
    public $tenant;

    /**
     * @description 当需要调用API操作指定工作空间的资源时， 需要提供目标工作空间的ID
     * @example Prod
     * @var string
     */
    public $workspace;

}
