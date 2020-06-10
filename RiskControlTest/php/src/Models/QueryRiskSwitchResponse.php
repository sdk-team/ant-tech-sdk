<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\RiskControlTest\Models;

use AlibabaCloud\Tea\Model;

use Alipaycloud\RiskControlTest\Models\RiskSwitchInfo;

class QueryRiskSwitchResponse extends Model {
    protected $_name = [
        'riskSwitchInfo' => 'risk_switch_info',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        $res['risk_switch_info'] = [];
        if(null !== $this->riskSwitchInfo && is_array($this->riskSwitchInfo)){
            $n = 0;
            foreach($this->riskSwitchInfo as $item){
                $res['risk_switch_info'][$n++] = null !== $item ? $item->toMap() : $item;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRiskSwitchResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['risk_switch_info'])){
            if(!empty($map['risk_switch_info'])){
                $model->riskSwitchInfo = [];
                $n = 0;
                foreach($map['risk_switch_info'] as $item) {
                    $model->riskSwitchInfo[$n++] = null !== $item ? RiskSwitchInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 风险事件开关信息
     * @var array
     */
    public $riskSwitchInfo;

}
