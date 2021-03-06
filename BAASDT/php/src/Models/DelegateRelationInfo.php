<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class DelegateRelationInfo extends Model {
    protected $_name = [
        'delegatedTenantId' => 'delegated_tenant_id',
        'extension' => 'extension',
        'status' => 'status',
        'tenantId' => 'tenant_id',
        'updateTime' => 'update_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DelegateRelationInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['extension'])){
            $model->extension = $map['extension'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['update_time'])){
            $model->updateTime = $map['update_time'];
        }
        return $model;
    }
    /**
     * @example WAESRDTF
     * @description 被代理的租户ID
     * @var string
     */
    public $delegatedTenantId;

    /**
     * @example extension
     * @description 扩展字段
     * @var string
     */
    public $extension;

    /**
     * @example true
     * @description 状态
     * @var bool
     */
    public $status;

    /**
     * @example OKIJUHYG
     * @description 被授权的租户ID
     * @var string
     */
    public $tenantId;

    /**
     * @example 20200327153541
     * @description 更新时间
     * @var string
     */
    public $updateTime;

}
