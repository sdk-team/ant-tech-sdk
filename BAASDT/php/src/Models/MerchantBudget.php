<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class MerchantBudget extends Model {
    protected $_name = [
        'budgetCode' => 'budget_code',
        'budgetDesc' => 'budget_desc',
        'budgetEndTime' => 'budget_end_time',
        'budgetStartTime' => 'budget_start_time',
        'pointLibCode' => 'point_lib_code',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->budgetCode) {
            $res['budget_code'] = $this->budgetCode;
        }
        if (null !== $this->budgetDesc) {
            $res['budget_desc'] = $this->budgetDesc;
        }
        if (null !== $this->budgetEndTime) {
            $res['budget_end_time'] = $this->budgetEndTime;
        }
        if (null !== $this->budgetStartTime) {
            $res['budget_start_time'] = $this->budgetStartTime;
        }
        if (null !== $this->pointLibCode) {
            $res['point_lib_code'] = $this->pointLibCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MerchantBudget
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['budget_code'])){
            $model->budgetCode = $map['budget_code'];
        }
        if(isset($map['budget_desc'])){
            $model->budgetDesc = $map['budget_desc'];
        }
        if(isset($map['budget_end_time'])){
            $model->budgetEndTime = $map['budget_end_time'];
        }
        if(isset($map['budget_start_time'])){
            $model->budgetStartTime = $map['budget_start_time'];
        }
        if(isset($map['point_lib_code'])){
            $model->pointLibCode = $map['point_lib_code'];
        }
        return $model;
    }
    /**
     * @example 1234567
     * @description 预算库代码
     * @var string
     */
    public $budgetCode;

    /**
     * @example budget
     * @description 预算库描述
     * @var string
     */
    public $budgetDesc;

    /**
     * @example 2020-06-01-20:20:20
     * @description 预算库截止时间
     * @var string
     */
    public $budgetEndTime;

    /**
     * @example 2020-06-01-20:20:20
     * @description 预算库启用时间
     * @var string
     */
    public $budgetStartTime;

    /**
     * @example 1234546
     * @description 积分库代码
     * @var string
     */
    public $pointLibCode;

}
