<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateEquityRequest extends Model {
    protected $_name = [
        'authType' => 'auth_type',
        'chainId' => 'chain_id',
        'currency' => 'currency',
        'defaultPrice' => 'default_price',
        'delegatedTenantId' => 'delegated_tenant_id',
        'description' => 'description',
        'descImages' => 'desc_images',
        'equityId' => 'equity_id',
        'equityName' => 'equity_name',
        'equityType' => 'equity_type',
        'ifPublic' => 'if_public',
        'images' => 'images',
        'limitPerMerchantAndDay' => 'limit_per_merchant_and_day',
        'limitPerMerchantAndMonth' => 'limit_per_merchant_and_month',
        'limitPerUserAndDay' => 'limit_per_user_and_day',
        'limitPerUserAndMonth' => 'limit_per_user_and_month',
        'memo' => 'memo',
        'outTxId' => 'out_tx_id',
        'totalCount' => 'total_count',
        'useValidNotAfter' => 'use_valid_not_after',
        'useValidNotBefore' => 'use_valid_not_before',
        'validNotAfter' => 'valid_not_after',
        'validNotBefore' => 'valid_not_before',
        'value' => 'value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->defaultPrice) {
            $res['default_price'] = $this->defaultPrice;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->descImages) {
            $res['desc_images'] = $this->descImages;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->equityName) {
            $res['equity_name'] = $this->equityName;
        }
        if (null !== $this->equityType) {
            $res['equity_type'] = $this->equityType;
        }
        if (null !== $this->ifPublic) {
            $res['if_public'] = $this->ifPublic;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->limitPerMerchantAndDay) {
            $res['limit_per_merchant_and_day'] = $this->limitPerMerchantAndDay;
        }
        if (null !== $this->limitPerMerchantAndMonth) {
            $res['limit_per_merchant_and_month'] = $this->limitPerMerchantAndMonth;
        }
        if (null !== $this->limitPerUserAndDay) {
            $res['limit_per_user_and_day'] = $this->limitPerUserAndDay;
        }
        if (null !== $this->limitPerUserAndMonth) {
            $res['limit_per_user_and_month'] = $this->limitPerUserAndMonth;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->useValidNotAfter) {
            $res['use_valid_not_after'] = $this->useValidNotAfter;
        }
        if (null !== $this->useValidNotBefore) {
            $res['use_valid_not_before'] = $this->useValidNotBefore;
        }
        if (null !== $this->validNotAfter) {
            $res['valid_not_after'] = $this->validNotAfter;
        }
        if (null !== $this->validNotBefore) {
            $res['valid_not_before'] = $this->validNotBefore;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateEquityRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_type'])){
            $model->authType = $map['auth_type'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['default_price'])){
            $model->defaultPrice = $map['default_price'];
        }
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['desc_images'])){
            $model->descImages = $map['desc_images'];
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        if(isset($map['equity_name'])){
            $model->equityName = $map['equity_name'];
        }
        if(isset($map['equity_type'])){
            $model->equityType = $map['equity_type'];
        }
        if(isset($map['if_public'])){
            $model->ifPublic = $map['if_public'];
        }
        if(isset($map['images'])){
            $model->images = $map['images'];
        }
        if(isset($map['limit_per_merchant_and_day'])){
            $model->limitPerMerchantAndDay = $map['limit_per_merchant_and_day'];
        }
        if(isset($map['limit_per_merchant_and_month'])){
            $model->limitPerMerchantAndMonth = $map['limit_per_merchant_and_month'];
        }
        if(isset($map['limit_per_user_and_day'])){
            $model->limitPerUserAndDay = $map['limit_per_user_and_day'];
        }
        if(isset($map['limit_per_user_and_month'])){
            $model->limitPerUserAndMonth = $map['limit_per_user_and_month'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['use_valid_not_after'])){
            $model->useValidNotAfter = $map['use_valid_not_after'];
        }
        if(isset($map['use_valid_not_before'])){
            $model->useValidNotBefore = $map['use_valid_not_before'];
        }
        if(isset($map['valid_not_after'])){
            $model->validNotAfter = $map['valid_not_after'];
        }
        if(isset($map['valid_not_before'])){
            $model->validNotBefore = $map['valid_not_before'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    /**
     * @description 授权类型：0 Auto，1 Contract
     * @example 0，1
     * @var integer
     */
    public $authType;

    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 货币类型
     * @example CNY
     * @var string
     */
    public $currency;

    /**
     * @description 默认价格（单位：元）
     * @example 10000.0000
     * @var string
     */
    public $defaultPrice;

    /**
     * @description 要代理的租户ID
     * @example tenant
     * @var string
     */
    public $delegatedTenantId;

    /**
     * @description 权益商品详细描述信息
     * @example equity
     * @var string
     */
    public $description;

    /**
     * @description 描述图片信息(;分隔)
     * @example oss1;oss2;oss3
     * @var string
     */
    public $descImages;

    /**
     * @description 权益商品ID
     * @example equity001
     * @var string
     */
    public $equityId;

    /**
     * @description 权益商品名称
     * @example equity
     * @var string
     */
    public $equityName;

    /**
     * @description 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】
     * @example 0200050002
     * @var integer
     */
    public $equityType;

    /**
     * @description 权益商品是否公开
     * @example true, false
     * @var bool
     */
    public $ifPublic;

    /**
     * @description 主图片信息(;分隔)
     * @example oss1;oss2;oss3
     * @var string
     */
    public $images;

    /**
     * @description 商户每日兑换上限
     * @example 100000
     * @var integer
     */
    public $limitPerMerchantAndDay;

    /**
     * @description 商户每月兑换上限
     * @example 100000
     * @var integer
     */
    public $limitPerMerchantAndMonth;

    /**
     * @description 用户每日兑换上限
     * @example 1000
     * @var integer
     */
    public $limitPerUserAndDay;

    /**
     * @description 用户每月兑换上限
     * @example 100000
     * @var integer
     */
    public $limitPerUserAndMonth;

    /**
     * @description 附言
     * @example 这是权益
     * @var string
     */
    public $memo;

    /**
     * @description 交易ID
     * @example txid
     * @var string
     */
    public $outTxId;

    /**
     * @description 库存
     * @example 10000
     * @var string
     */
    public $totalCount;

    /**
     * @description 权益商品使用有效期右闭区间
     * @example 9
     * @var integer
     */
    public $useValidNotAfter;

    /**
     * @description 权益商品使用有效期左闭区间
     * @example 2
     * @var integer
     */
    public $useValidNotBefore;

    /**
     * @description 权益商品兑换有效期右闭区间
     * @example 10
     * @var integer
     */
    public $validNotAfter;

    /**
     * @description 权益商品兑换有效期左闭区间
     * @example 1
     * @var integer
     */
    public $validNotBefore;

    /**
     * @description 面值（单位：元）
     * @example 10.000
     * @var string
     */
    public $value;

}
