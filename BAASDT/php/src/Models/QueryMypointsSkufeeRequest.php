<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMypointsSkufeeRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'count' => 'count',
        'env' => 'env',
        'memo' => 'memo',
        'orderNo' => 'order_no',
        'skuId' => 'sku_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMypointsSkufeeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['count'])){
            $model->count = $map['count'];
        }
        if(isset($map['env'])){
            $model->env = $map['env'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['sku_id'])){
            $model->skuId = $map['sku_id'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example mypoints
     * @var string
     */
    public $chainId;

    /**
     * @description 预下单数量
     * @example 100
     * @var integer
     */
    public $count;

    /**
     * @description 环境标识(sandbox/prod)
     * @example sandbox
     * @var string
     */
    public $env;

    /**
     * @description 备注信息
     * @example 查询费率
     * @var string
     */
    public $memo;

    /**
     * @description 业务幂等号
     * @example S20200707123345
     * @var string
     */
    public $orderNo;

    /**
     * @description 商品ID
     * @example 735423584356abc293647
     * @var string
     */
    public $skuId;

}
